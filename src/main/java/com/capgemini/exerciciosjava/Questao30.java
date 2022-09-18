/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON 30. Escreva um algoritmo que leia três valores inteiros
 *         distintos e os escreva em ordem crescente;
 * 
 *
 */
public class Questao30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite 3 numeros seguidos de enter");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();

		if(n1 < n2) {
			if(n2 < n3)
				System.out.println(n1 + " " + n2 + " " + n3);
			else if(n2 > n3 && n1 < n3)
				System.out.println(n1 + " " + n3 + " " + n2);
			else if(n2 > n3 && n1 > n3)
				System.out.println(n2 + " " + n1 + " " + n2);
		}
		if(n1 > n2 ) {
			if(n2 < n3) 
				System.out.println(n2 + " " + n3 + " " + n1);
			else if(n2 > n3 && n3 < n1)
				System.out.println(n3 + " " + n2 + " " + n1);
			else if(n1 < n3)
				System.out.println(n2 + " " + n1 + " " + n3);
				
		}
		
			
		
		
	}

}
