/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON 34. Elabore um algoritmo que, dada a idade de um nadador.
 *         Classifique-o em uma das seguintes categorias: a. Infantil A = 5 - 7
 *         anos; b. Infantil B = 8 - 10 anos; c. Juvenil A = 11- 13 anos; d.
 *         Juvenil B = 14 - 17 anos; e. Sênior = 18 - 25 anos. Apresentar
 *         mensagem “idade fora da faixa etária” quando for outro ano não
 *         contemplado;
 *
 */
public class Questao34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char opcao = 0;
		int idade;
		
		
		while (opcao != 'n' && opcao != 'N') {
			
			System.out.println("Digite a idade do nadador");
			idade = scan.nextInt();
			
			if(idade >= 5 && idade <= 7)
				System.out.println("Nadador Infantil A");
			else if(idade >= 8 && idade <= 10)
				System.out.println("Nadador Infantil B");
			else if(idade >= 11 && idade <= 13)
				System.out.println("Nadador Juvenil A");
			else if(idade >= 14 && idade <= 17)
				System.out.println("Nadador Juvenil B");
			else if(idade >= 18 && idade <= 25)
				System.out.println("Nadador Sênior");
			else
				System.out.println("idade fora da faixa etária");
			
			System.out.println("Deseja continuar inserindo dados? s para sim n para nao");
			opcao = scan.next().charAt(0);
		}

	}

}
