package Metodos;

import java.util.Scanner;

public class EX4me {

    public static void desconto(String P, float preco)
    {
        System.out.println("Você comprou um produto " + P + " por R$" + preco +  " e acaba de ganhar um desconto de 10%.\nAssim você vai pagar apenas R$"+ (preco - (preco*10/100)) +" pelo seu produto.\nVolte sempre!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome do produto.");
        String produto = input.next();
        System.out.println("Informe o preço do produto.");
        float preco = input.nextFloat();
        desconto(produto, preco);

        input.close();
    }
}
