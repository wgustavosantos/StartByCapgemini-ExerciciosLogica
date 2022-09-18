/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON
 * 25. Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais
 * imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o
 * maior, e uma mensagem que são diferentes;

 *
 */
public class Questao25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroUm = 0;
		int numeroDois = 0;
		
		System.out.println("Digite o primeiro numero ");
		numeroUm = scan.nextInt();
		
		System.out.println("Digite o segundo numero ");
		numeroDois = scan.nextInt();
		
		if(numeroUm == numeroDois)
			System.out.println("Os numeros digitados sao iguais");
		if (numeroUm > numeroDois) {
			System.out.println("Os numeros sao diferentes, o numero " + numeroUm + " eh maior");
		}
		if(numeroUm < numeroDois) {
			System.out.println("Os numeros sao diferentes, o numero " + numeroDois + " eh maior");
		}
			


	}

}
