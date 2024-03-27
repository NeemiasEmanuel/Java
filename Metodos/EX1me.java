package Metodos;

import java.util.Scanner;

public class EX1me {
    
public static void aluno(String nome, float nota[])
{
    System.out.println(nome);
    
    float soma = 0;
    
    for (int i = 0; i < 3; i++) {
        soma += nota[i];
    }
    System.out.println((soma/3));
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Me diga o nome do aluno");
    
    String nome = input.next();

    float nota[]= new float[3];

    for (int i = 0; i < 3; i++) {
        System.out.println("Informe a "+ i + "nota do aluno");
        nota[i]= input.nextInt();
    }
    aluno(nome, nota);


    input.close();
}


}
