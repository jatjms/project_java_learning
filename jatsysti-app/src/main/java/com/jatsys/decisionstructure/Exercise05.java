package com.jatsys.decisionstructure;

import java.util.Scanner;
public class Exercise05 {
	/*
	 * 5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por
	 * aluno e apresentar:
	 * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
	 * A mensagem "Reprovado", se a média for menor do que sete;
	 * A mensagem "Aprovado com Distinção", se a média for igual a dez.
	 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double nota1, nota2, media;
			
			System.out.println("Informe qual o valor da nota que tirou na 1º Avaliação.");
			nota1 = scan.nextDouble();
			System.out.println("Informe qual o valor da nota que tirou na 2º Avaliação.");
			nota2 = scan.nextDouble();
			
			media = nota1+nota2/2;
			if(media >=7 && media < 10) {
				System.out.println("Aprovado");
			}else if(media < 7) {
				System.out.println("Reprovado");
			}else{
				System.out.println("Aprovado com Distinção");
			}
		}
	}

}
