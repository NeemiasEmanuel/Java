package Repetiçao;
public class EX7 {
    public static void main(String[] args) {
        float num = 100;
        float resultado = 0 ;
        for(int i = 1; i <=100 ; i++)
        {
            resultado += i/ num;
            
            num--;
        }
        System.out.println(resultado);
    }
}
