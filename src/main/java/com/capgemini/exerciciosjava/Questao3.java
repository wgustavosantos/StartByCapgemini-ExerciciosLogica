

package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author WENDERSON
 * 
 * 3.Escreva um algoritmo para determinar o consumo médio de um automóvel sendo
 * fornecida a distância 
 * total percorrida pelo automóvel e o total de combustível gasto
 */
public class Questao3 {

    public static void main(String[] args) {
        
    float distancia = 2f; // percorrida em km
    float combustivel = 300f;//medidado em litros
    
    float consumo_medio = (distancia*1000)/combustivel;
    
        System.out.println(String.format
        ("Consumo médio de combustivel: %.2f  ", consumo_medio));
        
        
        
    }
}
