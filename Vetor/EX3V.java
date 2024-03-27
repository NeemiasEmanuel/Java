package Vetor;

import java.util.Scanner;

public class EX3V {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int vetor[] = new int[5];
        boolean encontrado = false;
        
            
        
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.println("Informe o valor do " + i + " numero: ");
            vetor[i]= input.nextInt();

        }
        System.out.println("Qual numero deseja verificar?");
        int numero = input.nextInt();
        for(int i = 0; i < vetor.length; i++)
        {
            if(vetor[i] == numero)
            {
                System.out.println("aparece na linha de indice" + i + " ");
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("Valor nao encontrado");
        }
        input.close(); 




 
    }
}
