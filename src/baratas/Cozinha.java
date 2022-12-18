package baratas;

import java.util.Scanner;

public class Cozinha {
	public static void main(String[] args) {
		PopulacaoBaratas pb1 = new PopulacaoBaratas(10);
		System.out.println("");
		pb1.sprayVeneno();
		System.out.println("Contagem de baratas Atuais: " + pb1.obterBaratas());
		
		System.out.println("");
		pb1.dobrarPopulacao();
		System.out.println("Contagem de baratas Atuais: " + pb1.obterBaratas());
		
		System.out.println("");
		pb1.dobrarPopulacao();
		System.out.println("Contagem de baratas Atuais: " + pb1.obterBaratas());
		
		System.out.println("");
		pb1.sprayVeneno();
		System.out.println("Contagem de baratas Atuais: " + pb1.obterBaratas());
		
		System.out.println("");
		pb1.dobrarPopulacao();
		System.out.println("Contagem de baratas Atuais: " + pb1.obterBaratas());
		
		System.out.println("");
		pb1.sprayVeneno();
		System.out.println("Contagem de baratas Atuais: " + pb1.obterBaratas());
		
		if(pb1.obterBaratas() <= 0) {
			System.out.println("==================================");
			System.out.println("----TODAS AS BARATAS MORRERAM!----");
			System.out.println("==================================");
		}else{
			/*
			Scanner ler = new Scanner(System.in);
			System.out.println("Deseja usar o incetissida?\nDigite [1] Para Sim ou [2] para Não");
			int numero = ler.nextInt();
			ler.close();
			
			switch(numero) {
			case 1:
				System.out.println("==================================");
				pb1.sprayVeneno();
				System.out.println("Contagem de baratas: " + pb1.obterBaratas());
				System.out.println("==================================");
				System.out.println(" ");
				System.out.println("Todas as Baratas Morreram!!!");
				break;
			case 2:
				System.out.println("As Baratas Dominaram o mundo!!!");
			} 
			*/
			
			System.out.println("==================================");
			System.out.println("----AS BARATAS SE MULTIPLICARAM\nE DOMINARAM O MUNDO!!!----");
			System.out.println("==================================");
			
		}
	}
}
