package com.jatsys.decisionstructure;

import java.util.Scanner;
public class Exercise03 {
	public static void main(String[] args) {
		// 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		try(Scanner scan = new Scanner(System.in)){
			
			String sexo;
			
			System.out.println("Informe se seu sexo com as seguintes informações, M para homem, F para mulher e O para outros.");
			sexo = scan.next();
			
			switch (sexo) {
			case "M":
				System.out.println("Você se considera do sexo Masculino.");
				break;
			case "F":
				System.out.println("Você se considera do sexo Feminino.");
				break;
			case "O":
				System.out.println("Sexo indeterminado.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
				}
			
		}
	}

}
