package com.capgemini.exerciciosjava;

/**
 * @author WENDERSON 9. Faça um algoritmo que receba um valor que foi depositado
 *         e exiba o valor com rendimento após um mês.Considere fixo o juro da
 *         poupança em 0,07% a. m;
 *
 */
public class Questao9 {

	public static void main(String[] args) {

		float deposito = 100;

		for (int i = 0; i < 12; i++) {
			deposito += deposito * 0.07;
			System.out.println(String.format("%dº mês com redimento: %.2f", i + 1, deposito));

		}

	}

}
