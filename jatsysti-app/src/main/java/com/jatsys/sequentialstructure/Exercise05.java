package com.jatsys.sequentialstructure;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double meters, centimeter;
			
			System.out.println("Informe o comprimento no objeto em centimetro.");
			centimeter = scan.nextDouble();
			
			meters = centimeter / 100;
			
			System.out.println("Informe o comprimento no objeto em metros é: "+meters);
			
		}
	}

}
