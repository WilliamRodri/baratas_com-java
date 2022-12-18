package baratas;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		
		/*
		Scanner ler = new Scanner(System.in);
		System.out.println("Deseja usar o incetissida?\nDigite [1] Para Sim ou [2] para Não");
		int numero = ler.nextInt();
		ler.close();
		
		if (numero == 1) {
			System.out.println("==================================");
			pb1.sprayVeneno();
			System.out.println("Contagem de baratas: " + pb1.obterBaratas());
			System.out.println("==================================");
			System.out.println(" ");
			System.out.println("Todas as Baratas Morreram!!!");
		} else if (numero == 2){
			System.out.println("As Baratas Dominaram o mundo!!!");
		}
		
		
		switch(numero) {
		case 1:
			System.out.println("==================================");
			//pb1.sprayVeneno();
			//System.out.println("Contagem de baratas: " + pb1.obterBaratas());
			System.out.println("==================================");
			System.out.println(" ");
			System.out.println("Todas as Baratas Morreram!!!");
			break;
		case 2:
			System.out.println("As Baratas Dominaram o mundo!!!");
		}
		*/
		if(1 <= 0) {
			System.out.println("==================================");
			System.out.println("----TODAS AS BARATAS MORRERAM!----");
			System.out.println("==================================");
		}else{
			Scanner ler = new Scanner(System.in);
			System.out.println("Deseja usar o incetissida?\nDigite [1] Para Sim ou [2] para Não");
			int numero = ler.nextInt();
			ler.close();
			
			switch(numero) {
			case 1:
				System.out.println("==================================");
				//pb1.sprayVeneno();
				//System.out.println("Contagem de baratas: " + pb1.obterBaratas());
				System.out.println("==================================");
				System.out.println(" ");
				System.out.println("Todas as Baratas Morreram!!!");
				break;
			case 2:
				System.out.println("As Baratas Dominaram o mundo!!!");
			}
			
		}
		
		
		
	}
}
