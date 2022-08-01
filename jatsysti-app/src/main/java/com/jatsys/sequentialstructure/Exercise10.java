package com.jatsys.sequentialstructure;

import java.util.Scanner;

public class Exercise10 {
// 	Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double  celsius, f;
			
			System.out.println("Informe a Temperatura em ºC ");
			celsius = scan.nextDouble();
			
			f = (celsius * 1.8) + 32;
			
			System.out.println("A temperatura em Fahrenheit "+f);
		}
	}
}
