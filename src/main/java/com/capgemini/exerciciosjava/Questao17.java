/**
 * 
 */
package com.capgemini.exerciciosjava;

/**
 * @author WENDERSON 17. Leia 80 números e ao final informar quantos número(s)
 *         est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive);
 *
 * 
 */
public class Questao17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int f = 0, cont = 0;
		int vet[] = new int[80];

		for (int i = 0; i < 80; i++) {
			vet[i] = (int) (Math.random() * 360);

		}
		
		for(int i: vet) {
			if (i >= 10 && i <= 150) {
				cont++;
			}
		}
		
		System.out.println("Quantidade de numeros entre 10 e 150: " + cont);

	}

}
