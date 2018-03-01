package br.unipe.cc.aula03;

import java.util.Scanner;

public class ProjetoFuncionario {
	public static void main(String[] args) {
		int salario;
		int aumento;
		int total;
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Informe seu salário.");
		salario = valor.nextInt();
		
		System.out.println("informe o percentual que deseja almentar.");
		aumento = valor.nextInt();
		
		total = ((salario*aumento)/100 + salario);
		System.out.println("o seu salario agora é: " + total);
		
		
	}


}
