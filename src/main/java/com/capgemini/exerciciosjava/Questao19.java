/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author WENDERSON 19. Escreva um algoritmo que leia o nome e o sexo de 56
 *         pessoas e informe o nome e se ela é homem ou mulher. No final informe
 *         total de homens e de mulheres;
 *
 */
public class Questao19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String vet[][] = new String[56][2];
		Random r = new Random();
		int m = 0, f = 0;

		for (int i = 0; i < 56; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0)
					vet[i][j] = (String) RandomStringUtils.randomAlphanumeric(15);
				if (j == 1)
					vet[i][j] = (r.nextInt(0, 2)) == 1 ? "m" : "f";
			}

		}
		
		for (String[] pessoa : vet) {
			System.out.println("nome :" + pessoa[0] + " sexo: " + pessoa[1]);
			if (pessoa[1].equals("m")) 
				m++;
			else
				f++;
			
		}
		System.out.println("Quantidade de homens: " + m + " Quantidade de mulheres: " + f);
		
	}

}
