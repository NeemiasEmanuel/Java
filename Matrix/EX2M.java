package Matrix;

public class EX2M {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 6, 4 , 5}, {1, 2, 6, 4 , 5}, {1, 2, 6, 4 , 5}, {1, 2, 6, 4 , 5}, {1, 2, 6, 4 , 5}};
        int soma = 0;
        for(int i = 0; i < 5; i++)
        {
            soma += matriz[i][2];
        }
        System.out.println(soma);

    }
}
