/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON 31. Dados três valores A, B e C, em que A e B são números
 *         reais e C é um caractere, pede-se para imprimir o resultado da
 *         operação de A por B se C for um símbolo de operador aritmético; caso
 *         contrário deve ser impressa uma mensagem de operador não definido.
 *         Tratar erro de divisão por zero;
 *
 */
public class Questao31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char ch = ' ';
		float a = 0.0f, b = 0.0f;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor de A");
		a = scan.nextFloat();

		System.out.println("Digite o valor de B");
		b = scan.nextFloat();

		System.out.println("Digite um operador aritmetico");
		ch = scan.next().charAt(0);

		if (ch == '+') {
			System.out.println(a + " + " + b + " = " + (a + b));
		} else if (ch == '-')
			System.out.println(a + " - " + b + " = " + (a - b));
		else if (ch == '*')
			System.out.println(a + " * " + b + " = " + (a * b));
		else if (ch == '/') {
			if (b == 0) {
				System.out.println("Divisao por zero. Saindo");
				return;
			}

			System.out.println(a + " / " + b + " = " + (a / b));
		}
		else
			System.out.println("Operador aritmetico invalido");

	}

}
