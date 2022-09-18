/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON 33. A escola “APRENDER” faz o pagamento de seus professores
 *         por hora/aula. Faça um algoritmo que calcule e exiba o salário de um
 *         professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
 *         a.Professor Nível 1 R$12,00 por hora/aula;
 *         b. Professor Nível 2 R$17,00mpor hora/aula;
 *         c. Professor Nível 3 R$25,00 por hora/aula.
 *
 */
public class Questao33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char opcao = 0;
		int nivel = 0;
		String nome;
		int horas = 0;
		
		
		while (opcao != 'n' && opcao != 'N') {
			
			System.out.println("Digite o nome do professor");
			nome = scan.next();
			
			System.out.println("Digite a quantidade de horas ministradas por mes");
			horas = scan.nextInt();
			
			System.out.println("Digite o nivel do professor (1, 2 ou 3");
			nivel = scan.nextInt();
			if(nivel == 1)
				System.out.println("O salario do professor eh R$" + (float) (horas*12));
			if(nivel == 2)
				System.out.println("O salario do professor eh R$" + (float) (horas*17));
			if(nivel == 3)
				System.out.println("O salario do professor eh R$" + (float) (horas*25));
			
			System.out.println("Deseja continuar inserindo dados? s para sim n para nao");
			opcao = scan.next().charAt(0);
		}
	}

}
