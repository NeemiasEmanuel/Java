package ColecoesAtividades;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class lista {
    public static void main(String[] args) {
         List <Integer> numeros = new ArrayList<>();

        numeros.add(50);
        numeros.add(40);
        numeros.add(30);
        numeros.add(21);
        numeros.add(20);
        numeros.add(10);
        numeros.add(1);
        if(numeros.contains(30)){
            System.out.println("O numero 30 esta presente no conjunto");
        }
        else{
            System.out.println("O numero 30 esta nao presente no conjunto");
        }
        
        
        if(numeros.contains(15)){
            System.out.println("O numero 15 esta presente no conjunto");
        }
        else{
            System.out.println("O numero 15 esta nao presente no conjunto");
        }
        
        numeros.add(60);
        
        System.out.println("Elemtetos da lista: " + numeros);
        Collections.sort(numeros);
        
        System.out.println("Elemtetos da lista: " + numeros);
        Collections.sort(numeros, Collections.reverseOrder());
        
        System.out.println("Elemtetos da lista: " + numeros);

        List <Integer> numerosPares = new ArrayList<>();

        for(int num : numeros){
            if(num%2==0){
                numerosPares.add(num);
            }
        }
        System.out.println("Elemtetos da lista pares: " + numerosPares);
        numerosPares.clear();
        numeros.clear();
        
        System.out.println("Elemtetos da lista pares: " + numerosPares);
        
        System.out.println("Elemtetos da lista: " + numeros);
    }
}
