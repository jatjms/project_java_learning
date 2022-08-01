package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise07 {
	// 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
	public static void main(String[] args) {
	try(Scanner scan = new Scanner(System.in)){
		double area, lado;
		
		System.out.println("Informe o valor do lado de um quadrado.");
		lado = scan.nextDouble();
		
		area = lado*lado;
		
		System.out.println("A área do quadrado é: "+area);
		}
	}
}
