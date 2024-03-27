package Matrix;

import java.util.Scanner;

public class EX1M {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Matrix[][] = new int[2][3];
        int i, j;
        int soma = 0;
        for(i = 0; i < 2; i ++)
        {
            for(j = 0; j < 3; j++)
            {
                System.out.printf("informe o numero [%d] [%d]: \n", i,j);
                soma += Matrix[i][j]= input.nextInt();
                
            }
        }
        System.out.println("Soma total: " + soma);




input.close();
    }
}
