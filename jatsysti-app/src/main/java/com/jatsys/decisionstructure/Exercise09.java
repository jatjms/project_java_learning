package com.jatsys.decisionstructure;

import java.util.Scanner;
public class Exercise09 {
	//  Faça um Programa que leia três números e mostre-os em ordem decrescente.
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			 int num1, num2, num3;
			 
			 System.out.println("Digite o 1º número.");
			 num1 = scan.nextInt();
			 System.out.println("Digite o 2º número.");
			 num2 = scan.nextInt();
			 System.out.println("Digite o 3º número.");
			 num3 = scan.nextInt();
			
			 if(num1<num2 && num1<num3 && num2>num3 && num2>num3) {
				 System.out.println("A ordem é: 1º: "+num1+", 2º: "+num2+" e 3º: "+num3);
			 }
			 else if (num1<num2 && num1<num3 && num3>num2 && num3>num1) {
				 System.out.println("A ordem é: 1º: "+num1+", 3º: "+num3+" e 2º: "+num2);
			 }
			 else if(num2<num1 && num2<num3 && num1>num3 && num1>num2) {
				 System.out.println("A ordem é: 2º: "+num2+", 3º: "+num3+" e 1º: "+num1);
			 }
			 else if (num2<num1 && num2<num3 && num3>num2 && num3>num1) {
				 System.out.println("A ordem é: 2º: "+num2+", 1º: "+num1+" e 3º: "+num3);
			 }
			 else if (num3<num1 && num3<num2 && num2>num3 && num2>num1){
				 System.out.println("A ordem é: 3º: "+num3+", 2º: "+num2+" e 1º: "+num1);
			 }
			 else if (num3<num1 && num3<num2 && num1>num2 && num1>num3){
				 System.out.println("A ordem é: 3º: "+num3+", 1º: "+num1+" e 2º: "+num2);
			 }
			 else {
				 System.out.println("Fiz merda kkkk"); 
			 }
				 
			 }
				 
		}

}
