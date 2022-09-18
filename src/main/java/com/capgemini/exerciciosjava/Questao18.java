/**
 * 
 */
package com.capgemini.exerciciosjava;

/**
 * @author WENDERSON 
 * 18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
 *“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
 *
 */
public class Questao18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int vet[] = new int[80];
		

		for (int i = 0; i < 75; i++) {
			vet[i] = (int) (Math.random() * 100);

		}
		for (int i = 0; i < 75; i++) {
			if(vet[i] >= 18)
				System.out.println("Pessoa numero " + i + " eh maior de idade");
			else if(vet[i] <18)
				System.out.println("Pessoa numero " + i + " eh menor de diade");
			else
				System.out.println("Idade invalida");
		}
	}

}
