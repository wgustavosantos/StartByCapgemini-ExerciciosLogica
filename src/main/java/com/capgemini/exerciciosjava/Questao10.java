/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Iterator;
import java.util.Locale;

/**
 * @author WENDERSON
 * 10.  A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um 
 * algoritmo que receba um valor de uma compra e mostre o valor das prestações
 *
 */
public class Questao10 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	
	private static final Locale BRAZIL = new Locale("pt", "BR");
	private static final DecimalFormatSymbols REAL = new DecimalFormatSymbols(BRAZIL);
	private static DecimalFormat converteMoedaReal = new DecimalFormat("¤ ###,###,###0.00", REAL);
	
	public static void main(String[] args) {
		
		float valorCompra = 2600f;

		
		System.out.println("## Valor das prestacoesc##");
	
			
			System.out.println(String.format("Valor das prestacoes: %s  ", converteMoedaReal.format(valorCompra/5)));
		
		

	}

}
