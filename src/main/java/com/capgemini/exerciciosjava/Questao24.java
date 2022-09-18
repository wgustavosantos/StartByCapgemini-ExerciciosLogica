/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON
 * 24. Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
 * 
 *
 */
public class Questao24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Digite um numero ");
		numero = scan.nextInt();
		
		if(numero > 0)
			System.out.println("Positivo");
		if (numero < 0)
			System.out.println("Negativo");
		if(numero == 0)
			System.out.println("Numero igual a zero");

	}

}
