package Condicionais;

import java.util.Scanner;

public class EX1C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.println("informe o primeiro numero: ");
        int numero1 = input.nextInt();
        System.out.println("informe o segundo numero: ");
        int numero2 = input.nextInt();
        if(numero1<numero2)
        {
            System.out.println(numero1 +" "+ numero2);
        }
        else if(numero1>numero2)
        {
            System.out.println(numero2 + " " + numero1);
        }
        else{
            System.out.println(numero1 + " " + numero2);
        }
        input.close();
    
    }
}
