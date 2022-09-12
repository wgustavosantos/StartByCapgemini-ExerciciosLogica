/**
 * 
 */
package com.capgemini.exerciciosjava;

/**
 * @author WENDERSON
 * 16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
 * sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
 * Recuperação (media entre 5.1 a 6.9);

 *
 */
public class Questao16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float n1, n2, n3, media;
		n1 = 5.0f;
		n2 = 10.0f;
		n3 = 0.5f;
		
		media = (n1+n2+n3)/3;
		
		if(media >= 7) {
			System.out.println("Aprovado");
		}
		else if(media > 5.1 && media < 6.9) {
			System.out.println("Recuperacao");
		} else if (media < 5) {
			System.out.println("Reprovado");
		}

	}

}
