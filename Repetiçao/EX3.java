package Repetiçao;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int num = 0;
        
         System.out.println("informe um numero: ");
         num =input.nextInt();
         for(int i = 2; i <= num; i+=2)
         {         
         System.out.println(i);    
         }
         input.close();
    }
    
}
