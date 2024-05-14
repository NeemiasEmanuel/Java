package ColecoesAtividades;
import java.util.Set;
import java.util.TreeSet;

public class colecoes {
    
    public static void main(String[] args) {
    
    Set<Integer> numeros = new TreeSet<>();    

        numeros.add(50);
        numeros.add(40);
        numeros.add(30);
        numeros.add(20);
        numeros.add(10);
        
    System.out.println("Elemtetos da lista: " + numeros);

    if(numeros.contains(30)){
        System.out.println("O numero 30 esta presente no conjunto");
    }
    else{
        System.out.println("O numero 30 esta nao presente no conjunto");
    }

    numeros.add(20);
    numeros.add(60);
    numeros.add(70);
    
    numeros.remove(40);

    
    System.out.println("Tamanho do conjunto: " + numeros.size());
    
    System.out.println("Elemtetos da lista: " + numeros);
    numeros.clear();
    
    System.out.println("Elemtetos da lista: " + numeros);
}
    
}
