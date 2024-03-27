package Repetiçao;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        
   Scanner input = new Scanner(System.in);
        
   int resultado = 0 ;
   int nume = 0 ;
    do{
        System.out.println("informe um numero");
        nume = input.nextInt();      
        resultado += nume;

    }while(nume != 0 );
   
    System.out.println("resultado: " + resultado );


    input.close();
    }
}
