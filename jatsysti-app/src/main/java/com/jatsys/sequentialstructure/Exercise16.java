package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise16 {
	/*
	 * 16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser
	pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de
	18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
	 */
	public static void main(String[] args){
		try(Scanner scan = new Scanner(System.in)){
			double  custo, comodo, tinta, custoFinal;
			// int tinta, custoFinal;
			
			System.out.println("Informe qual metragem do comodo a ser pintado");
			comodo = scan.nextDouble();
			
			custo = 18*3;
			
			tinta = comodo / custo;
			
			custoFinal = tinta * 80;
			//custo = comodo/3;
			//tinta = custo/18;
			//custoFinal = tinta * 80;
			
			//custoFinal = custo * 80;
			//tintaFinal = comodo/tinta;
			
			System.out.println("Uma lata pinta "+custo+" Metros Quadrados,  usará "+tinta+" latas de tinta, o valor a ser gasto é de R$ "+custoFinal);
		}
		
	}

}
