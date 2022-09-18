/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON 26. Faça um algoritmo que leia um número de 1 a 5 e escreva
 *         por extenso. Caso o usuário digite um número que não esteja neste
 *         intervalo, exibir a seguinte mensagem: número inválido;
 *
 * 
 */
public class Questao26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String um, dois, tres, quatro, cinco;
		String[] vet = new String[5];

		System.out.println("Digite de 1 a 5 por extenso");

		for (int i = 0; i < vet.length; i++) {
			vet[i] = scan.next();

		}

		for (int i = 0; i < vet.length; i++) {

			if(i == 0) {
				if(!vet[i].equalsIgnoreCase("um")) {
					System.out.println("Numero " + vet[i] + " eh invalido");
				}
			}
			if(i == 1) {
				if(!vet[i].equalsIgnoreCase("dois")) {
					System.out.println("Numero " + vet[i] + " eh invalido");
				}
			}
			if(i == 2) {
				if(!vet[i].equalsIgnoreCase("tres")) {
					System.out.println("Numero " + vet[i] + " eh invalido");
				}
			}
			if(i == 3) {
				if(!vet[i].equalsIgnoreCase("quatro")) {
					System.out.println("Numero " + vet[i] + " eh invalido");
				}
			}
			if(i == 4) {
				if(!vet[i].equalsIgnoreCase("cinco")) {
					System.out.println("Numero " + vet[i] + " eh invalido");
				}
			}
			
		}

	}

}
