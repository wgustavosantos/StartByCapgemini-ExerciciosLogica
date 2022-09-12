/**
 * 
 */
package com.capgemini.exerciciosjava;

/**
 * @author WENDERSON
 * 15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
 *
 */
public class Questao15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 150;
		
		if(n > 100 && n < 200) {
			System.out.println("O numero lido esta entre 100 e 200");
		}else {
			System.out.println("O numero lido nao esta entre 100 e 200");
		}

	}

}
