package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise06 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double area, ray;
			double pi =3.14;
			
			System.out.println("Informe o valor do raio de um circulo.");
			ray = scan.nextDouble();
			
			area = pi*(ray*2);
			
			System.out.println("Sua área é: "+area);			
		}
	}

}
