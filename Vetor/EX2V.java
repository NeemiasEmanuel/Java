package Vetor;

import java.util.Scanner;

public class EX2V {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[5];
        float media = 0;
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.println("Informe o valor do " + i + " numero: ");
            vetor[i]= input.nextInt();
            media += vetor[i];
        }
        media = media / vetor.length;
        System.out.println("A media dos valores informados é " + media);
        System.out.print("valores maiores que a media:");
        for(int i = 0; i < vetor.length; i++)
        {
            if(vetor[i] >= media)
            {
                System.out.print(vetor[i]+ " ");
            }
        }


input.close();

    }
}
