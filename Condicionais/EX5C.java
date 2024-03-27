package Condicionais;

import java.util.Scanner;

public class EX5C {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  
        System.out.println("informe o numero de folhas: ");
        int folhas = input.nextInt();
        double valor = 0;
        if(folhas>100)
        {
            valor = 25 + 0.20*(folhas-100);
            System.out.println(valor);
        }
        else
        {
            valor = folhas * 0.25;
            System.out.println(valor);
        
        
        }



    input.close();
    }
}
