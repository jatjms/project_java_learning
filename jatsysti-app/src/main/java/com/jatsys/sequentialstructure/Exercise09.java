package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise09 {
// 	Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double  celsius, f;
			
			System.out.println("Informe a Temperatura em Fahrenheit ");
			f = scan.nextDouble();
			
			celsius = 5 * ((f-32) / 9);
			
			System.out.println("A temperatura em Celsius "+celsius);
		}
	}
	
}
