package Repetiçao;
import java.util.Scanner;
class Repeticao {
    public static void main(String[] args) {
             
         Scanner input = new Scanner(System.in);
         int num = 100;
        
         for(int i = 1 ; i<=100 ; i++)
         {
           
            System.out.println(num + " "+ i);
             num--;

         }

         input.close();
    }
}