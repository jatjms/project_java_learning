package com.jatsys.decisionstructure;

import java.util.Scanner;
public class Exercise01 {
	// 1. Faça um Programa que peça dois números e imprima o maior deles.
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			 int num1, num2;
			 
			 System.out.println("Digite o 1º número.");
			 num1 = scan.nextInt();
			 System.out.println("Digite o 2º número.");
			 num2 = scan.nextInt();
			
			 if(num1>num2) {
				 System.out.println("o "+num1+", 1º número é maior que o 2º.");
			 }else {
				 System.out.println("o "+num2+", 2º número é maior que o 1º.");
			 }
				 
		}
	}

}
