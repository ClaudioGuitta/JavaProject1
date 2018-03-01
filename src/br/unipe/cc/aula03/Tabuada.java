package br.unipe.cc.aula03;

import java.util.Scanner;

public class Tabuada {
		public static void main(String[] args) {
			int opcao;
			int i;
			int resultado;
			Scanner tabuu = new Scanner(System.in);
			opcao = tabuu.nextInt();
			
			for(i=1; i<=10; i++) {
				resultado = (opcao*i);
				System.out.println("o resultado é: " +resultado);
			}
			
		}


}
