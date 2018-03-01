package br.unipe.cc.aula03;

import java.util.Scanner;

public class ParouImpar {
	public static void main(String[] args) {
		int vari = 10;
		int atribuir;
		
		
		while(vari != 0) {
			vari--;
			Scanner variavel = new Scanner(System.in);
			System.out.println("informe um numero> ");
			atribuir = variavel.nextInt();
		
			if ((atribuir % 2 ) == 0 ){
				System.out.println("é par");
			}
			else {
				System.out.println("é impar!");
			
			}
			
		}

}

}
