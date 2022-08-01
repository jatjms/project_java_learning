package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise17 {
	/*
	 * 17. Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser
pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de
18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre
arredonde os valores para cima, isto é, considere latas cheias.
	 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double  custoT, custoG, galao, comodo, tinta, custoFinal,custoGalao;
			// int tinta, custoFinal;
			
			System.out.println("Informe qual metragem do comodo a ser pintado");
			comodo = scan.nextDouble();
			
			custoT = 18*6;
			custoG = 36*6;
			
			tinta = comodo / custoT;
			galao = comodo / custoG;
			
			custoFinal = tinta * 80;
			custoGalao = galao * 25;
			
			System.out.println("Uma lata tinta R$ "+custoT+" Metros Quadrados,  usará "+tinta+" latas de tinta, o valor a ser gasto é de R$ "+custoFinal);
			System.out.println("Um Galão R$ "+custoG+" Metros Quadrados,  usará "+galao+" galao de tinta, o valor a ser gasto é de R$ "+custoGalao);

		}
	}

}
