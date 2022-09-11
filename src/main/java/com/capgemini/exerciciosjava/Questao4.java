/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author WENDERSON
 * 4.Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o
 * total de vendas efetuadas 
 * por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão 
 * sobre suas vendas 
 * efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */
public class Questao4 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        float salario;
        float total_vendas;
        float salario_final;
        
        System.out.print("Digite o nome do vendedor: \n");
        nome = scan.next();
        
        System.out.print("Digite o salario fixo do vendedor: \n");
        salario = scan.nextFloat();
        
        System.out.print("Digite o total de vendas efetuadas do vendedor: \n");
        total_vendas = scan.nextFloat();
        
        salario_final = (float) ((total_vendas*0.15) + salario);
        
        System.out.println("Nome: " + nome);
        System.out.print(String.format("Salario fixo: %.3f\n", salario));
        System.out.print(String.format("Total de vendas: %.3f\n", total_vendas));
        System.out.println(String.format
        ("Salario atual %.3f", salario_final));
    }
    
}
