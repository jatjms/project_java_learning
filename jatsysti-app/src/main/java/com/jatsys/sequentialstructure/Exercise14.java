package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise14 {
	/*
	 * 14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu
	 * trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de
	 * São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa
	 * que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do
	 * limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens
	 * adequadas.
	 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double peso, multa;
			
			System.out.println("Informe quantos kilos de peixe foi trazido.");
			peso = scan.nextDouble();
			
			multa = (peso - 50) * 4;
			
			System.out.println("O Valor a multa é: R$ "+ multa);
			
		}
	}

}
