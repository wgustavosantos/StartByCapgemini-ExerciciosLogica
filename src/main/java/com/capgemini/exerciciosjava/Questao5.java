/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.capgemini.exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author WENDERSON 5.Escreva um algoritmo que leia o nome de um aluno e as
 *         notas das três provas que ele obteve no semestre. No finalinformar o
 *         nome do aluno e a sua média (aritmética)
 */
public class Questao5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		float media = 0;
		String[] notasvet;

		System.out.println("Digite o nome do aluno: ");
		nome = scan.nextLine();

		System.out.println("Digite as 3 notas seguidas");
		String notas = scan.nextLine();

		notasvet = notas.split(" ");

		for (String nota : notasvet)
			media += Float.parseFloat(nota);

		System.out.println("Média das notas: " + media / notasvet.length);

	}
}
