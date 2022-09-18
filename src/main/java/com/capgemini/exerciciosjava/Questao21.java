/**
* 
*/
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON 21. Escreva um algoritmo que leia os dados de “N” pessoas
 *         (nome, sexo, idade e saúde) e informe se está apta ou não para
 *         cumprir o serviço militar obrigatório. Informe os totais;
 *
 */
public class Questao21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char opcao = 0;
		String nome, sexo;
		int idade;
		@SuppressWarnings("unused")
		String saude = "";
		int cont = 0;
		Scanner scan = new Scanner(System.in);

		while (opcao != 'n' && opcao != 'N') {

			System.out.println("Digite o nome: ");
			nome = scan.nextLine();

			System.out.println("Digite o sexo: ");
			sexo = scan.next();

			System.out.println("Digite o idade: ");
			idade = scan.nextInt();

			System.out.println("Digite o saude: ");
			saude = scan.next();

			if (sexo.equalsIgnoreCase("m") && idade >= 18) {
				System.out.println(nome + " esta apto a ingressar no serviço militar obrigatório");
			}
			cont++;
			System.out.println("Deseja continuar ? s para sim n para nao");
			opcao = scan.next().charAt(0);
			scan.nextLine();
		}
		System.out.println("Total de pessoas pesquisadas: " + cont);
		scan.close();
	}

}
