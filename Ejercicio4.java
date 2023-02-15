/*
Identifiqué varios errores, pero tuve problemas para ejecutarlo en la consola. Me ayudé de otros códigos de Java para segurarme de que estuviera correcto.
*/

package com.generation;

import java.util.Scanner; //faltaba importar Scanner

public class Codigo4 {

	public static void main(String[] args) { //no había main para ejecutar el código
    Scanner s = new Scanner(System.in);//no había nada que escanear
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //error en el número del jugador
    //Scanner s2 = new Scanner(System.in);// código innecesario
    String j2 = s.nextLine();//s2 añadido
    
    if (j1 == j2) { //se eliminó parántesis que había de más
      System.out.println("Empate"); //cierre de llaves incorrecto
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {//innecesario el ==, debido a uso incorrecto
            g = 1;
          }
          break;//se agregaron breaks a cada clase
        case "papel":
          if (j2.equals("piedra")) {
            g = 1;
            }
          break;
        case "tijeras"://faltaba una letra s
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
    s.close();
   }
}
