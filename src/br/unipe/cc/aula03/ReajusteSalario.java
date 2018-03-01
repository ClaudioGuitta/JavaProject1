package br.unipe.cc.aula03;

import java.util.Scanner;

public class ReajusteSalario {
	public static void main(String[] args) {
		int salarios;
		Scanner valores = new Scanner(System.in);
		int total;
		int contador = 10;
		String nomes;
		String fim = new String("fim");
	
	
		while(contador != 0 ) {
			contador--;
			System.out.println("informe seu nome: ");
			nomes = valores.next();
			if(nomes.equals(fim)) {
				break;
			}
			
			System.out.println("informe seu salario");
			salarios = valores.nextInt();
			
			if (salarios < 500) {
				total = (((salarios*20)/100)+salarios);
				System.out.println("Reajustamos seu salario agora é: " +total);
			}
			else {
				System.out.println("seu salario esta regular obrigado pela preferencia!");
			}
		
		}
	}

}
