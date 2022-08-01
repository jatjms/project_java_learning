package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise13 {
/*
 * 13. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as
 * seguintes fórmulas:
 *	a. Para homens: (72.7*h) - 58
 *	b. Para mulheres: (62.1*h) - 44.7
 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double height, imcMan, imcWoman;
			
			System.out.println("Informe a Altura.");
			height = scan.nextDouble();
			
			imcMan = (72.7*height) - 58;
			imcWoman = (62.1*height) - 44.7;
			
			System.out.println("IMC masculino é "+imcMan+" e o IMC feminino é de "+imcWoman);
			
			
		}
	}
}
