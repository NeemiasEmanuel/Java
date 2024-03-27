package Repetiçao;
public class EX6 {
    public static void main(String[] args) {
        int atual = 1;
        int antecessor = 1;
        System.out.print("1  1 ");
        for(int i = 3; i <= 10; i++)
        {
            
            atual = atual + antecessor;            
            antecessor = atual - antecessor;
            System.out.print(atual + " ");
        }
    }
}
