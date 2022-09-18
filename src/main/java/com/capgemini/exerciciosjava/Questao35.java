/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON Faça um algoritmo que calcule o valor da conta de luz de
 *         uma pessoa. Sabe-se que o cálculo da conta de luz segue a tabela
 *         abaixo: Tipo de Cliente Valor do KW/h a. (Residência) 0,60; b.
 *         (Comércio) 0,48; c. (Indústria) 1,29.
 *
 */
public class Questao35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char opcao = 0;
		String tipoCliente;
		float KWh;

		while (opcao != 'n' && opcao != 'N') {
			
			System.out.println("Digite a quantidade de Kw/h");
			KWh = scan.nextFloat();
			
			System.out.println("Digite o tipo de cliente");;
			tipoCliente = scan.next();
			
			if(tipoCliente.equalsIgnoreCase("Residencial")) {
				System.out.println("Total a pagar: R$" + (KWh * 0.60));
			}
			if(tipoCliente.equalsIgnoreCase("Comercial")) {
				System.out.println("Total a pagar: R$" + (KWh * 0.48));
			}
			if(tipoCliente.equalsIgnoreCase("Industrial")) {
				System.out.println("Total a pagar: R$" + (KWh * 1.29));
			}

			System.out.println("Deseja continuar inserindo dados? s para sim n para nao");
			opcao = scan.next().charAt(0);
		}

	}

}
