package com.jatsys.sequentialstructure;

import java.util.Scanner;
public class Exercise18 {
/*
 * 18. Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em
Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
 */
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			double tmp,mgbs, mb, download;
			
			System.out.println("Qual tamanho do arquivo que deseja baixar em Megabytes(Mb).");
			download = scan.nextDouble();
			
			mgbs = 1024;
			mb = download/mgbs;
			tmp = mb*60; 
			
			System.out.println("O tempo para baixar será de "+tmp);
			
		}
	}
	
}
