package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise15 {
/*
15. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o
total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
5% para o sindicato, faça um programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double salarioBruto, salarioLiquido, inss, ir, sindicato;
			
			System.out.println("Informe o Valor de seu salario Bruto.");
			salarioBruto = scan.nextDouble();
			
			inss = (salarioBruto*8)/100;
			ir = (salarioBruto*11)/100;
			sindicato = (salarioBruto*5)/100;		
			
			salarioLiquido = salarioBruto - inss - ir - sindicato;
			
			System.out.println("Seu Salário Bruto é de R$"+salarioBruto+" os descontos são:");
			System.out.println("R$ "+inss+" de INSS");
			System.out.println("R$ "+sindicato+" de Sindicato");
			System.out.println("R$ "+ir+" de IR");
			System.out.println("Salário Liquido(O que ira cair na sua conta) é de R$ "+salarioLiquido);
			
			
		}
	}
}
