package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise04 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			
			double nota1,nota2, nota3, nota4, media;
			
			System.out.println("Qual o valor da sua 1º nota:");
			nota1 =scan.nextDouble();
			System.out.println("Qual o valor da sua 2º nota:");
			nota2 =scan.nextDouble();
			System.out.println("Qual o valor da sua 3º nota:");
			nota3 =scan.nextDouble();
			System.out.println("Qual o valor da sua 4º nota:");
			nota4 =scan.nextDouble();
			
			media = (nota1 + nota2 + nota3 + nota4)/4;
			
			System.out.println("Sua média é: "+media);
						
			}
	}

}
