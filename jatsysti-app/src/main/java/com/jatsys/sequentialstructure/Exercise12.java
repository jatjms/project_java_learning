package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise12 {
/*	12. 12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a
*	seguinte fórmula: (72.7*altura) - 58
*/
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double imc, altura;
			
			System.out.println("Informe sua altura.");
			altura = scan.nextDouble();
			
			imc = (72.7*altura) - 58;
			
			System.out.println("O Calculo IMC é: "+imc);
		}
	}
}
