package Repetiçao;
import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double maior; 
        double menor;
        
        System.out.println("informe um numero: ");
        double entrada = input.nextFloat();
        maior = menor = entrada;
        do{
            
            if(entrada > maior)
            {
                maior = entrada;
            }
            if(entrada< menor)
            {
                menor = entrada;
            }
            System.out.println("informe um numero: ");
            entrada = input.nextFloat();
        }while(entrada != 0);

        System.out.println(maior - menor);
        input.close();
    }
}
