package com.jatsys.decisionstructure;

import java.util.Scanner;
public class Exercise10 {
	/*
	 * 10. Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
	 * Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
	 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			
			String  turnoEstudo;
			
			System.out.println("Informe qual turno você estuda digitar M-matutino ou V-Vespertino ou N- Noturno");
			turnoEstudo = scan.next();
			
			switch(turnoEstudo) {
				case "M":
					System.out.println("Bom Dia!!");
					break;
				case "V":
					System.out.println("Boa Tarde!!");
					break;
				case "N":
					System.out.println("Boa Noite!!");
					break;
				default:
					System.out.println("Valor Inválido!");
					break;
			}
			
			
		}
	}

}
