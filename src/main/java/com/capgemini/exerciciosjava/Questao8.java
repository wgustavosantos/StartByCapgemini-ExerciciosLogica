package com.capgemini.exerciciosjava;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author WENDERSON 8. Elabore um algoritmo que efetue a apresentação do valor
 *         da conversão em real (R$) de um valorlido em dólar (US$). O algoritmo
 *         deverá solicitar o valor da cotação do dólar e também aquantidade de
 *         dólares disponíveis com ousuário;
 *
 */
public class Questao8 {

	private static final Locale BRAZIL = new Locale("pt", "BR");
	private static final DecimalFormatSymbols REAL = new DecimalFormatSymbols(BRAZIL);
	public static final DecimalFormat DINHEIRO_REAL = new DecimalFormat("¤ ###,###,##0.00", REAL);

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float cotacaoDolar = 0;
		float dolares = 0;
		float real;

		System.out.println("Digite a cotação do dolar");
		cotacaoDolar = scan.nextFloat();

		System.out.println("Digite o valor em dolares");
		real = scan.nextFloat();

		real *= cotacaoDolar;

		System.out.println(DINHEIRO_REAL.format(real));

	}

}
