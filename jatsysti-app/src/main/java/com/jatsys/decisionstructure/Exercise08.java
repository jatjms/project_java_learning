package com.jatsys.decisionstructure;

import java.util.Scanner;

public class Exercise08 {
	// 8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a
	// decisão é sempre pelo mais barato.
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double produto1,produto2,produto3;
			
			 System.out.println("Digite o 1º número.");
			 produto1 = scan.nextDouble();
			 System.out.println("Digite o 2º número.");
			 produto2 = scan.nextDouble();
			 System.out.println("Digite o 3º número.");
			 produto3 = scan.nextDouble();
			 
			 if(produto1<produto2 && produto1<produto3) {
				 System.out.print("O 1º Produto é o mais barato.");
			 }else if(produto1<produto1 && produto1<produto1) {
				 System.out.print("O 2º Produto é o mais barato.");
			 }else {
				 System.out.print("O 3º Produto é o mais barato.");
			 }
		}
		
	}

}
