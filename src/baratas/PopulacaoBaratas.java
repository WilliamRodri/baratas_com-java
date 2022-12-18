package baratas;

import java.util.Scanner;

public class PopulacaoBaratas {
    
    private int baratas;
    
    public PopulacaoBaratas() {
    }
    
    public PopulacaoBaratas(int tamanhoPopulacao) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de baratas: ");
        int valor = input.nextInt();
        tamanhoPopulacao = valor;
        this.baratas = tamanhoPopulacao;
        input.close();
        
    }
    /*
    public int getBaratas() {
        return baratas;
    }

    public void setBaratas(int baratas) {
        this.baratas = baratas;
    }
    */
    public int dobrarPopulacao() {
        System.out.println("**População Dobrada**");
        return baratas *= 2;
        
    }
    
    public int sprayVeneno() {
        // reduz 10%
        System.out.println("**Inseticida utilizado**");
        return baratas *= 0.1;
        //return baratas = baratas *= 0.1;
    }

    
    public int obterBaratas() {
        return baratas; 
    }
    
    
    
}