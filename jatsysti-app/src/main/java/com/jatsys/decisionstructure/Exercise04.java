package com.jatsys.decisionstructure;

import java.util.Scanner;

public class Exercise04 {
// 4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			String vogal;
			
			System.out.println("Informe uma letra do alfabeto.");
			vogal=scan.next();
			
			switch(vogal) {
			case "a":
				System.out.println("A vogal digitada foi a - "+vogal);
				break;
			case "e":
				System.out.println("A vogal digitada foi a - "+vogal);
				break;
			case "i":
				System.out.println("A vogal digitada foi a - "+vogal);
				break;
			case "o":
				System.out.println("A vogal digitada foi a - "+vogal);
				break;
			case "u":
				System.out.println("A vogal digitada foi a - "+vogal);
				break;
			case "A":
				System.out.println("A vogal digitada foi a - "+vogal);
				break;
			case "E":
				System.out.println("A vogal digitada foi a - "+vogal);
				break;
			case "I":
				System.out.println("A vogal digitada foi a - "+vogal);
				break;
			case "O":
				System.out.println("A vogal digitada foi a - "+vogal);
				break;
		    case "U":
				System.out.println("A vogal digitada foi a - "+vogal);
				break;
			default:
				System.out.println("A Letra informada é uma consoante "+vogal);
				break;				
			}
		}
		
	}

}
