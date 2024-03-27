package Metodos;

import java.util.Scanner;

public class EX2me {

    public static double salario(int N, float H)
    {
        if (N == 1) {
            return 20.0 * H;
        }
        else if( N == 2)
        {
            
            return 25.0 * H;
        }
        else{
            
            return 30.0 * H;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nivel do professor.");
        int nivel = input.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas");
        float horas = input.nextFloat();

        System.out.println(salario(nivel, horas));

        input.close();
    }
}
