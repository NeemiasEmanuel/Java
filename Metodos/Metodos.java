package Metodos;

import java.util.Scanner;



public class Metodos {
    public static void asterisco(int quant, char caractere)
    {
        for (int i = 0; i <= quant; i++) {
            System.out.print(caractere);
        }
    System.out.printf("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        asterisco(654365423, '+');

        System.out.println("Numeros de 1 a 5: ");

        asterisco(15, '-');

        for (int i = 0; i < 5; i++) {    
                    System.out.print(i + " ");
        }

        System.out.printf("\n");
        
        asterisco(20, '+');


input.close();
    }
    
}
