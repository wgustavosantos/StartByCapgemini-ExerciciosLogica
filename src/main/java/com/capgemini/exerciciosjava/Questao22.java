/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON 22. Faça um algoritmo que receba o preço de custo e o preço
 *         de venda de 40 produtos. Mostre como resultado se houve lucro,
 *         prejuízo ou empate para cada produto. Informe o valor de custo de
 *         cada produto, o valor de venda de cada produto, a média de preço de
 *         custo e do preço de venda;
 *
 * 
 */
public class Questao22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		float mediaCusto = 0.0f, mediaVenda = 0.0f;
		float precoCusto = 0.0f, precoVenda = 0.0f;
		int contaCarros = 0;

		char opcao = 0;

		Scanner scan = new Scanner(System.in);

		while (opcao != 'n' && opcao != 'N') {

			System.out.println("Informe o preco de custo do carro: ");
			precoCusto = scan.nextFloat();
			mediaCusto =+ precoCusto;

			System.out.println("Informe o preco de venda do carro: ");
			precoVenda = scan.nextFloat();
			mediaVenda =+ precoVenda;

			if (precoVenda > precoCusto) {
				System.out.println("Houve lucro de R$" + (precoVenda - precoCusto));
				
			} else if (precoVenda < precoCusto) {
				System.out.println("Houve prejuizo de R$" + (precoCusto - precoVenda));
			} else if (precoVenda == precoCusto) {
				System.out.println("Houve empate");
			}

			contaCarros++;

			System.out.println("Deseja continuar calculando? s para sim n para nao");
			opcao = scan.next().charAt(0);
		}
		
		System.out.println("Media de preco de venda: R$" + (mediaVenda/contaCarros));
		System.out.println("Media de preco de custo: R$" + (mediaCusto/contaCarros));

	}

}
