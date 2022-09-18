/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author WENDERSON
 * 29. Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido;
 * 
 *
 */
public class Questao29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Locale BRAZIL = new Locale("pt", "BR");
		String mes = "";
		
		System.out.println("Digite um mes em forma de numero");
		int mesInt = scan.nextInt();
		
		if(mesInt >= 1 && mesInt <= 12) {
			mes = Month.of(mesInt).getDisplayName(TextStyle.FULL, BRAZIL);
			System.out.println(mes);
		}
		else
			System.out.println("Mes invalido");
		
	}

}
