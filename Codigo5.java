//Este programa determina si el número dado por el usuario es afortunado o desafortunado
//Se considera como número afortunado si tiene en sus dígitos mayor cantidad de
//número afortunados (3,7,8,9) que los que no son afortunados.

import java.util.Scanner;

public class Codigo5 {
	//necesita un metodo main para poder ejecutar el código
	public static void main( String[] args ){

	    //solicitar número al usuario
		Scanner s = new Scanner(System.in); //faltaba el System.in e importarlo
		System.out.print("Introduzca un número: "); //usar "" o '' pero no ambas
		int ni = Integer.parseInt( s.nextLine() );//convertir ni a int
		int c = ni; 
		
		int afo = 0;
		int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = ni % 10; //se borró el tipo de dato, no es necesario ponerlo
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	    }//if else

		 ni /= 10;//reducir el num de digitos, se movió afuera de else

	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado."); //faltaba la t en println
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }//if else  
	  }//while
	  s.close(); //cerrar el scann
	  
	}//main
}//class