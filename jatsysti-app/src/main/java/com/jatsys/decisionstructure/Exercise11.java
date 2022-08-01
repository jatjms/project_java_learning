package com.jatsys.decisionstructure;

import java.util.Scanner;
public class Exercise11 {
	/*
	 * 11. As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para
	desenvolver o programa que calculará os reajustes.	Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no
	salário atual:
	salários até R$ 280,00 (incluindo) : aumento de 20%
	salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
	salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
	salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
	o salário antes do reajuste;
	o percentual de aumento aplicado;
	o valor do aumento;
	o novo salário, após o aumento.
	 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double salarioAtual, aumento, salarioFinal;
			
			System.out.println("Informe o Valor de seu salario Bruto.");
			salarioAtual = scan.nextDouble();
			
			
			if (salarioAtual <= 280) {
				aumento = (20*salarioAtual)/100;
				salarioFinal = aumento + salarioAtual;
				System.out.println("O Seu salário atual é de R$ "+salarioAtual+", assim terá uma aumento de 20% R$ "+aumento+", na soma o reajuste é de R$ "+salarioFinal);
				}
			else if (salarioAtual > 280 && salarioAtual <= 700) {
					aumento = (15*salarioAtual)/100;
					salarioFinal = aumento + salarioAtual;
					System.out.println("O Seu salário atual é de R$ "+salarioAtual+", assim terá uma aumento de 15% R$ "+aumento+", na soma o reajuste é de R$ "+salarioFinal);
				}
			else if (salarioAtual > 700 && salarioAtual <=1500) {
				aumento = (10*salarioAtual)/100;
				salarioFinal = aumento + salarioAtual;
				System.out.println("O Seu salário atual é de R$ "+salarioAtual+", assim terá uma aumento de 10% R$ "+aumento+", na soma o reajuste é de R$ "+salarioFinal);
			}
			else {
				aumento = (5*salarioAtual)/100;
				salarioFinal = aumento + salarioAtual;
				System.out.println("O Seu salário atual é de R$ "+salarioAtual+", assim terá uma aumento de 5% R$ "+aumento+", na soma o reajuste é de R$ "+salarioFinal);
			}
			
			
		}
	}

}
