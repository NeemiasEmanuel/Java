class Bomba{
    int numero_bomba;
    String tipo_combustivel;
    double valor_litro;
    double quantidade;
    public void status(){
        System.out.println("Numero da bomba: " + this.numero_bomba);
        System.out.println("Tipo do combustivel: " + this.tipo_combustivel);
        System.out.println("Valor litro: R$" + this.valor_litro);
        System.out.println("Quantidade litros: " + this.quantidade + "L\n");
    }
    public void abastecer_valor(double valor){
    double litros = valor/this.valor_litro;
    
        System.out.println("Foram abastecido " + litros +"\n");
    this.quantidade -=  litros;
     
    }
    public void abastecer_litros
}


public class EX3po {
    public static void main(String[] args) {
        Bomba b1 = new Bomba();
        b1.numero_bomba = 1;
        b1.tipo_combustivel = "Gasolina";
        b1.valor_litro = 6.29;
        b1.quantidade = 10000;
        b1.status();
        b1.abastecer_valor(10);
        b1.status();
    }
}
