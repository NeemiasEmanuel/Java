package Metodos;

import java.util.Scanner;

public class EX5me {
    public static int Maior(int numero[])
    {
        if(numero[0] > numero[1] && numero[0] > numero[2])
        {
            return numero[0];
        }
        else if(numero[1]> numero[2])
        {
            return numero[1];
        
        }
        else 
        {
            return numero[2];
        }

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o valor do " + i + " numero");
            numero[i]= input.nextInt();
        }
        System.out.println(Maior(numero));
    
        input.close();
    }
}
