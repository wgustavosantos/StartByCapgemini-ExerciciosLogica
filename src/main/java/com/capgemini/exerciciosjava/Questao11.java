/**
 * 
 */
package com.capgemini.exerciciosjava;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * @author WENDERSON 11. Faça um algoritmo que receba o preço de custo de um
 *         produto e mostre o valor de venda. Sabe-se que o preço de custo
 *         receberá um acréscimo de acordo com um percentual informado pelo
 *         usuário;
 *
 */
public class Questao11 {

	private static final Locale BRAZIL = new Locale("pt", "BR");
	private static final DecimalFormatSymbols REAL = new DecimalFormatSymbols(BRAZIL);
	private static DecimalFormat converteMoedaReal = new DecimalFormat("¤ ###,###,###0.00", REAL);

	public static void main(String[] args) {
		
		float precoCusto, precoVenda, acrescimoPorCento;
		
		precoCusto = 2000.00f;
		acrescimoPorCento = 10; 
		
		precoVenda = precoCusto + (precoCusto*(acrescimoPorCento/100));
		
		System.out.println("Preço da venda: " + converteMoedaReal.format(precoVenda));

	}

}
