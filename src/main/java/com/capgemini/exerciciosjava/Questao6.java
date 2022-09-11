package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON
 * 6.Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a 
 * possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores 
 * trocados;
 *
 */
public class Questao6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a, b;
		int aux;
		System.out.println("Digite o valor de a ");
		a = scan.nextInt();
		
		System.out.println("Digite o valor de b ");
		b = scan.nextInt();
		
		aux = a;
		a = b;
		b = aux;
		aux = 0;
		
		System.out.println("Valor atual de a: " + a );
		System.out.println("Valor atual de b: " + b );
	}
}
