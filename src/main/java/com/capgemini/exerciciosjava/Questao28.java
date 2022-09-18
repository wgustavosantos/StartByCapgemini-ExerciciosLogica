/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON 28. Escreva um algoritmo para uma empresa que decide dar um
 *         reajuste a seus 584 funcionários de acordo com os seguintes
 *         critérios: a. 50% para aqueles que ganham menos do que três salários
 *         mínimos; b. 20% para aqueles que ganham entre três até dez salários
 *         mínimos; c. 15% para aqueles que ganham acima de dez até vinte
 *         salários mínimos; d. 10% para os demais funcionários. Leia o nome do
 *         funcionário, seu salário e o valor do salário mínimo. Calcule o seu
 *         novo salário reajustado. Escrever o nome do funcionário, o reajuste e
 *         seu novo salário. Calcule quanto à empresa vai aumentar sua folha de
 *         pagamento;
 *
 */
public class Questao28 {

	/**
	 * @param args
	 */
	public static float SALARIO_MINIMO = 1200F;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nome;
		float salario = 0.0f, reajuste = 0.0f, folhaPagamento = 0.0f;

		char opcao = ' ';
		
		
		while (opcao != 'n' && opcao != 'N') {
			
			System.out.println("Digite o nome do funcionario ");
			nome = scan.next();
			
			System.out.println("Digite o salario do funcionario ");
			salario = scan.nextFloat();
			
			if(salario < (SALARIO_MINIMO*3f))
				reajuste = (float) (salario*0.50);
			if(salario >= (SALARIO_MINIMO*3f) && salario <= (SALARIO_MINIMO*10f) )
				reajuste = (float) (salario*0.20);
			if(salario >= (SALARIO_MINIMO*10f) && salario <= (SALARIO_MINIMO*20f) )
				reajuste = (float) (salario*0.15);
			
			folhaPagamento += reajuste;
			
			System.out.println("Nome do funcionario: " + nome);
			System.out.println("Reajuste salarial : R$" + reajuste);
			System.out.println("Novo salario: R$" + (salario + reajuste));
			System.out.println("Deseja continuar inserindo dados? s para sim n para nao");
			opcao = scan.next().charAt(0);
		}
		
		System.out.println("Folha de pagamento atualizada: R$" + folhaPagamento);

	}

}
