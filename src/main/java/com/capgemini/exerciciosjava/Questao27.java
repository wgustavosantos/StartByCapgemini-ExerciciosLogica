/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON
 * 27. A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
 * algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
 * calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
 * –14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
 * clientes;
 *
 */
public class Questao27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		float valor = 0.0f, desconto = 0.0f,
				totalDescontos = 0.0f, totalPago = 0.0f, valorPagamento = 0.0f;
		String tipoCombustivel = "";
		
		Scanner scan = new Scanner(System.in);
		char opcao = 0;
		
		
		while (opcao != 'n' && opcao != 'N') {
			
			System.out.println("Digite o valor do carro ");
			valor = scan.nextFloat();
			
			System.out.println("Digite o tipo de combustivel (Gasolina, Alcool ou Diesel) ");
			tipoCombustivel = scan.next();
			
			if(tipoCombustivel.equalsIgnoreCase("Gasolina"))
				desconto = (float) (valor * 0.21);
			if(tipoCombustivel.equalsIgnoreCase("Alcool"))
				desconto = (float) (valor * 0.25);
			if(tipoCombustivel.equalsIgnoreCase("Diesel"))
				desconto = (float) (valor * 0.14);
			
			valorPagamento = valor - desconto;
			
			System.out.println("Valor do desconto: R$" + desconto);
			System.out.println("Valor final: " + valorPagamento);
			
			totalDescontos =+ desconto;
			totalPago =+ (valor + desconto);
			
			System.out.println("Deseja continuar inserindo dados? s para sim n para nao");
			opcao = scan.next().charAt(0);
		}
		
		System.out.println("Valor total de descontos: R$" + totalDescontos);
		System.out.println("Valor total de pagamentos: R$" + totalPago);
		

	}

}


