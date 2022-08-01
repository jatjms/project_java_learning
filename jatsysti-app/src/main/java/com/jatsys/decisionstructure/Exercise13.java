package com.jatsys.decisionstructure;

import java.util.Scanner;
public class Exercise13 {
	/*
	 * 13. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar
	 * outro valor deve aparecer valor inválido.
	 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int num;
			
			System.out.println("Informe o numero do dia da semana");
			num =scan.nextInt();
			
			switch(num) {
				case 1: 
					System.out.println("Domingo.");
					break;
				case 2: 
					System.out.println("Segunda-Feira.");
					break;
				case 3: 
					System.out.println("Terça-Feira.");
					break;
				case 4: 
					System.out.println("Quarta-Feira.");
					break;
				case 5: 
					System.out.println("Quinta-Feira.");
					break;
				case 6: 
					System.out.println("Sexta-Feira.");
					break;
				case 7: 
					System.out.println("Sábado.");
					break;
				default:
					System.out.println("Valor invalido.");
					break;
			}
		}
	}

}
