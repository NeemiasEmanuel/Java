package Matrix;

import java.util.Scanner;

public class EX3M {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int matriz[][] = new int[3][3];
      int i, j;
    int soma = 0;
    int maior = 0;
    int menor = 0;
    System.out.println("informe o valor da matriz[0][0]: ");
    soma = menor = maior = matriz[0][0]= input.nextInt();
    for(i = 0; i < 3; i++)
    {
        for(j = 1;j < 3; j++)
        {
               System.out.printf("informe o numero [%d] [%d]: \n", i,j);
               soma += matriz[i][j] = input.nextInt();
               if(matriz[i][j]> maior)
               {
                maior = matriz[i][j];
               }
               else if(matriz[i][j]< menor)
               {
                menor = matriz[i][j];
               }


        }
    }
    System.out.println("Menor valor: " + menor);
    System.out.println("maior valor: " + maior);
    System.out.println("soma valor: " + soma);
    System.out.println("media valor: " + ((float)soma/9));

    input.close();  
    }
}
