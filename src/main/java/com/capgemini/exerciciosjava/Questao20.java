/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON 20. A concessionária de veículos “CARANGO VELHO” está
 *         vendendo os seus veículos com desconto. Faça um algoritmo que calcule
 *         e exiba o valor do desconto e o valor a ser pago pelo cliente de
 *         vários carros. O desconto deverá ser calculado de acordo com o ano do
 *         veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá
 *         perguntar se deseja continuar calculando desconto até que a resposta
 *         seja: “(N) Não”. Informar total de carros com ano até 2000 e total
 *         geral;
 *
 */
public class Questao20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float desconto = 0.0f;
		float valorPago = 0.0f;

		float valorCarro = 0.0f;

		char opcao = 0;

		int totalAte2000 = 0;
		int totalGeral = 0;

		while (opcao != 'n' && opcao != 'N') {

			System.out.println("Digite o ano do carro");
			int anoCarro = scan.nextInt();

			System.out.println("Digite o valor do carro");
			valorCarro = scan.nextFloat();

			if (anoCarro <= 2000) {
				desconto = (float) (valorCarro * 0.12);
				totalAte2000++;

			}
			if (anoCarro > 2000) {
				desconto = (float) (valorCarro * 0.07);
			}
			totalGeral++;

			System.out.println("Ano do carro: " + anoCarro);
			System.out.println("Valor do desconto: " + desconto);
			System.out.println("Valor a ser pago pelo cliente: " + (valorCarro - desconto));

			System.out.println("Deseja continuar calculando? s para sim n para nao");
			opcao = scan.next().charAt(0);
		}
		
		System.out.println("Total de carros com ano ate 2000: " + totalAte2000);
		System.out.println("Total geral de carros: " + totalGeral);

	}

}
