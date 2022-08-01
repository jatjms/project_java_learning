package com.jatsys.decisionstructure;

import java.util.Scanner;
public class Exercise14 {
	/*
	 * 14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
	 *
	 * Média de Aproveitamento     Conceito
	 * Entre 9.0 e 10.0            A
	 * Entre 7.5 e 9.0             B
	 * Entre 6.0 e 7.5             C
	 * Entre 4.0 e 6.0             D
	 * Entre 4.0 e zero            E
	 *
	 * O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
	 */
	public static void main(String[] args){
		try(Scanner scan = new Scanner(System.in)){
			double nota1, nota2, media;
			
			System.out.println("Informe a 1º nota.");
			nota1 = scan.nextDouble();
			System.out.println("Informe a 2º nota.");
			nota2 = scan.nextDouble();
			
			media = (nota1+nota2)/2;
			
			
			if(media >= 9 && media < 10) {
				System.out.println("Sua Média é "+media+" esta no conceito 'A', assim Aprovado");
				
			}
			else if((media >= 7.5) && (media < 9)) {
				System.out.println("Sua Média é "+media+" esta no conceito 'B', assim Aprovado");
			}
			else if((media >= 6) && (media < 7.5)) {
				System.out.println("Sua Média é "+media+" esta no conceito 'C', assim Aprovado");
			}
			else if((media >= 4) && (media < 6)) {
				System.out.println("Sua Média é "+media+" esta no conceito 'D', assim Reprovado");
			}
			else if((media >= 0) && (media < 4)) {
				System.out.println("Sua Média é "+media+" esta no conceito 'E', assim Aprovado");
			}else{
				System.out.println("Sua Média é "+media);
			}
		}
	}

}
