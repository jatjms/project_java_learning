package com.jatsys.decisionstructure;

import java.util.Scanner;

public class Exercise07 {
	// 7. Faça um Programa que leia três números e mostre o maior e o menor deles.
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int num1,num2,num3;
			
			 System.out.println("Digite o 1º número.");
			 num1 = scan.nextInt();
			 System.out.println("Digite o 2º número.");
			 num2 = scan.nextInt();
			 System.out.println("Digite o 3º número.");
			 num3 = scan.nextInt();
			 
			 if(num1<num2 && num1<num3) {
				 System.out.print("o número "+num1+", é menor de todos.");
			 }else if(num2<num1 && num2<num3) {
				 System.out.print("o número "+num2+", é menor de todos.");
			 }else {
				 System.out.print("o número "+num3+", é menor de todos.");
			 }
		}
		
	}

}
