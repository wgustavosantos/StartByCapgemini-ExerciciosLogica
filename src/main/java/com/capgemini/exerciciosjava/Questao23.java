/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON
 * 23. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 80,
 * menor que 25 ou igual a 40;
 *
 */
public class Questao23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Informe um numero");
		numero = scan.nextInt();
		
		if(numero > 80)
			System.out.println("Numero maior que 80");
		else if (numero < 25)
			System.out.println("Numero menor que 25");
		else if (numero == 40)
			System.out.println("Numero igual a 40");
	}

}
