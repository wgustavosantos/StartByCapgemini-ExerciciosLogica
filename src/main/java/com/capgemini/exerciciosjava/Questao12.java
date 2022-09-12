/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author WENDERSON
 * 12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
 * dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
 * do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
 * 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
 * mesmo;
 *
 */
public class Questao12 {

	/**
	 * @param args
	 */
	
	private static final Locale BRAZIL = new Locale("pt", "BR");
	private static final DecimalFormatSymbols REAL = new DecimalFormatSymbols(BRAZIL);
	private static DecimalFormat converteMoedaReal = new DecimalFormat("¤ #,##0.00", REAL);

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float custoFabrica = 0;;
		float percentualDistribuidor = 1.28f;
		float impostos = 1.45f;
		
		System.out.println("Digite o custo de fabrica: ");
		custoFabrica = scan.nextFloat();
		
		custoFabrica = (custoFabrica*impostos);
		float custoTotal = (custoFabrica*percentualDistribuidor);
		System.out.println(custoTotal);
		System.out.println("Custo total com impostos e percentual do distribuidor: " + converteMoedaReal.format(custoTotal));
		
		

	}

}
