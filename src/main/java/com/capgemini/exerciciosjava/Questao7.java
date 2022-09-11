package com.capgemini.exerciciosjava;



/**
 * @author WENDERSON
 * 7.Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de 
 * conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;
 *
 */
public class Questao7 {
	public static void main(String[] args) {
		
		float temp = 35f;//lendo a temperatura em Celsius
		float f;
		
		f = (9*temp+160)/5;
		
		System.out.println(String.format("Temperatura em Celsius %.2f\nTemperatura em Fahrenheit %.2f", temp, f));
		
	}

}
