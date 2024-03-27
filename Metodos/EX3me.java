package Metodos;

import java.util.Scanner;

public class EX3me {

    public static float Consumo(int consumidor, float Kw)
    {
        
        if(consumidor == 1)
        {
        return 0.60f * Kw;
            
        }
        else if(consumidor == 2)
        {
            return 0.48f * Kw;
        }
        else
        {
            return 1.29f * Kw;
        }
        
    }
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    System.out.println("Informe o tipo do consumidor.\n1.Para pessoa fisica\n2.Para comercio\n3.Para industria");
    
    int consumidor = input.nextInt();
    
    System.out.println("Informe a quantidade de kw consumidas");
    
    float Kw = input.nextFloat();

    System.out.println(Consumo(consumidor,Kw));

    input.close();
    }
}
