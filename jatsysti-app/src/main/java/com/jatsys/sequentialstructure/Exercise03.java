package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise03 {

public static void man(String[] args) {		
		
		try(Scanner scan = new Scanner(System.in)){
			int num1, num2;
			System.out.println("Informe o 1º número:");
			num1 = scan.nextInt();
			System.out.println("Informe o 2º número:");
			num2 = scan.nextInt();
			
			System.out.println("O 1º número informado foi "+num1+", o 2º foi "+num2);
		}
	}
}

