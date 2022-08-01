package com.jatsys.decisionstructure;

import java.util.Scanner;
public class Exercise12 {
	/*
	 *  Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que
	depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário
	Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os
	descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
	Desconto do IR:
	Salário Bruto até 900 (inclusive) - isento
	Salário Bruto até 1500 (inclusive) - desconto de 5%
	Salário Bruto até 2500 (inclusive) - desconto de 10%
	Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo
	abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

	Salário Bruto: (5 * 220)    : R$ 1100,00
	(-) IR (5%)                 : R$ 55,00
	(-) INSS ( 10%)             : R$ 110,00
	FGTS (11%)                  : R$ 121,00
	Total de descontos          : R$ 165,00
	Salário Liquido             : R$ 935,00

	 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
double salarioBruto, salarioLiquido, inss, ir, sindicato, fgts;
			
			System.out.println("Informe o Valor de seu salario Bruto.");
			salarioBruto = scan.nextDouble();
			
			if (salarioBruto > 2500) {
			inss = (salarioBruto*10)/100;
			fgts = (salarioBruto*11)/100;
			ir = (salarioBruto*20)/100;
			sindicato = (salarioBruto*3)/100;		
			
			salarioLiquido = salarioBruto - inss - ir - sindicato - fgts;
			
			System.out.println("Seu Salário Bruto é de R$"+salarioBruto+" os descontos são:");
			System.out.println("R$ "+inss+" de INSS");
			System.out.println("R$ "+sindicato+" de Sindicato");
			System.out.println("R$ "+ir+" de IR");
			System.out.println("R$ "+fgts+" de FGTS");
			System.out.println("Salário Liquido(O que ira cair na sua conta) é de R$ "+salarioLiquido);
			}
			else if (salarioBruto > 1500 && salarioBruto < 2500 ) {
				inss = (salarioBruto*10)/100;
				fgts = (salarioBruto*11)/100;
				ir = (salarioBruto*10)/100;
				sindicato = (salarioBruto*3)/100;		
				
				salarioLiquido = salarioBruto - inss - ir - sindicato - fgts;
				
				System.out.println("Seu Salário Bruto é de R$"+salarioBruto+" os descontos são:");
				System.out.println("R$ "+inss+" de INSS");
				System.out.println("R$ "+sindicato+" de Sindicato");
				System.out.println("R$ "+ir+" de IR");
				System.out.println("R$ "+fgts+" de FGTS");
				System.out.println("Salário Liquido(O que ira cair na sua conta) é de R$ "+salarioLiquido);
				
			}
			else if (salarioBruto > 900 && salarioBruto < 1500) {
				inss = (salarioBruto*10)/100;
				fgts = (salarioBruto*11)/100;
				ir = (salarioBruto*5)/100;
				sindicato = (salarioBruto*3)/100;		
				
				salarioLiquido = salarioBruto - inss - ir - sindicato - fgts;
				
				System.out.println("Seu Salário Bruto é de R$"+salarioBruto+" os descontos são:");
				System.out.println("R$ "+inss+" de INSS");
				System.out.println("R$ "+sindicato+" de Sindicato");
				System.out.println("R$ "+ir+" de IR");
				System.out.println("R$ "+fgts+" de FGTS");
				System.out.println("Salário Liquido(O que ira cair na sua conta) é de R$ "+salarioLiquido);
			}
			else {
				inss = (salarioBruto*10)/100;
				fgts = (salarioBruto*11)/100;
				ir = 0;
				sindicato = (salarioBruto*3)/100;		
				
				salarioLiquido = salarioBruto - inss - ir - sindicato - fgts;
				
				System.out.println("Seu Salário Bruto é de R$"+salarioBruto+" os descontos são:");
				System.out.println("R$ "+inss+" de INSS");
				System.out.println("R$ "+sindicato+" de Sindicato");
				System.out.println("R$ "+ir+" de IR ISENTO.");
				System.out.println("R$ "+fgts+" de FGTS");
				System.out.println("Salário Liquido(O que ira cair na sua conta) é de R$ "+salarioLiquido);
			}
		}
	}

}
