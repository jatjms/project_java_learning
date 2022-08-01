package com.jatsys.decisionstructure;

import java.util.Scanner;
public class Exercise02 {
	//2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int num1;
			
			System.out.println("Digite o 1º número.");
			 num1 = scan.nextInt();
			 
			 if (num1 > 0) {
				 System.out.println("Esse Valor "+num1+" é positivo.");
				 			 
			 }else {
				 System.out.println("Esse Valor "+num1+" é negativo.");
			 }
			
		}
	}

}
