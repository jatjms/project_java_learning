package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise08 {
	// 8. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o	total do seu salário no referido mês.
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double salaryHour, salary;
			
			System.out.println("Informe o valor cobrado por hora de trablaho");
			salaryHour = scan.nextDouble();
			
			salary = salaryHour * 30;
			
			System.out.println("O Valor do seu sálario é de R$ "+salary);
		}
	}
}
