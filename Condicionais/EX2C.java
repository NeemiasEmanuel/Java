package Condicionais;

import java.util.Scanner;

public class EX2C {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);    
     System.out.println("informe o primeiro numero: ");
     int numero1 = input.nextInt();
     System.out.println("informe o segundo numero: ");
     int numero2 = input.nextInt();
     System.out.println("informe o terceiro numero: ");
     int numero3 = input.nextInt();
    if(numero1<numero2 && numero1<numero3)
    {
        System.out.println(numero1);
    }
    else if(numero2<numero3)
    {
        System.out.println(numero2);
    }
    else
    {
        System.out.println(numero3);
    }
    input.close();
    }
}
