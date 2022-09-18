/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 * @author WENDERSON 32. Escreva um algoritmo que leia três valores inteiros e
 *         verifique se eles podem ser os lados de um triângulo. Se forem,
 *         informar qual o tipo de triângulo que eles formam: equilátero,
 *         isóscele ou escaleno. Propriedade: o comprimento de cada lado de um
 *         triângulo é menor do que a soma dos comprimentos dos outros dois
 *         lados. a. Triângulo Equilátero: aquele que tem os comprimentos dos
 *         três lados iguais; b. Triângulo Isóscele: aquele que tem os
 *         comprimentos de dois lados iguais. c. Triângulo equilátero é também
 *         isóscele; d. Triângulo Escaleno: aquele que tem os comprimentos de
 *         seus três lados diferentes;
 *
 */
public class Questao32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado de um triangulo");
		a = scan.nextInt();
		
		System.out.println("Digite o segundo lado do triangulo");
		b = scan.nextInt();
		
		System.out.println("Digite o terceiro lado do triangulo");
		c = scan.nextInt();
		
		if( (a + b) > c || (a + c) > b || (b + c) > a  ) {
			System.out.println("Parametros invalidos");
		}
		
		if(a == b && b == c)
			System.out.println("Triângulo Equilátero e Isóscele");
		if(a == b || a == c)
			System.out.println("Triângulo Isóscele");
		if(a != b && b != c)
			System.out.println("Triângulo Escaleno");
	}

}
