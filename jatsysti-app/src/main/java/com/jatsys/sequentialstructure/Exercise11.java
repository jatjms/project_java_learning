package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise11 {
	/*
	 * 11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
	 * a. o produto do dobro do primeiro com metade do segundo .
	 * b. a soma do triplo do primeiro com o terceiro.
	 * c. o terceiro elevado ao cubo.
	 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int num1, num2;
			double num3, calc1, calc2, calc3;
			System.out.println("Informe o 1º número inteiro.");
			num1 = scan.nextInt();
			System.out.println("Informe o 2º número inteiro.");
			num2 = scan.nextInt();
			System.out.println("Informe o 3º número real.");
			num3 = scan.nextDouble();
			
			calc1 = (num1*2) + (num2/2);
			calc2 = (num1*3) + num3;
			calc3 = num3*num3*num3;
			
			System.out.println("o produto do dobro do primeiro com metade do segundo. "+ calc1);
			System.out.println("a soma do triplo do primeiro com o terceiro." +calc2);
			System.out.println(" o terceiro elevado ao cubo." +calc3);
			
		}
	}

}
