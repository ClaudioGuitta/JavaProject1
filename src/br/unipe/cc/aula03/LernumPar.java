package br.unipe.cc.aula03;

import java.util.Scanner;

public class LernumPar {
	public static void main(String[] args) {
		int variavel;
		Scanner ParOuImpar = new Scanner(System.in);
		int contador;
		
		System.out.println("informe um numero. ");
		variavel = ParOuImpar.nextInt();
		
		if ((variavel % 2 ) == 0) {
			System.out.println("� Par!! ");
		}
		else {
			System.out.println("� impar!!");
		}
			
		
		
		
	}

}
