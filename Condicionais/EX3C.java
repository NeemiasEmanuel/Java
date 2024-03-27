package Condicionais;

import java.util.Scanner;

public class EX3C {
    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);    
     System.out.println("informe o primeiro numero: ");
     int numero1 = input.nextInt();
        if(numero1 % 2 == 0 && numero1 % 3 == 0 )
        {
            System.out.println("numero é divisivel por 2 e 3");

        }
  
        
     input.close();
    }
}
