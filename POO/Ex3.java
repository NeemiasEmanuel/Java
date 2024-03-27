class caneta{
    String marca;
    String cor;
    Boolean tampada;
    public void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void escrever(){
        System.out.println("Caneta esta escrevendo");
    }
}

public class Ex3 {
    public static void main(String[] args) {
    caneta bic = new caneta();
    bic.marca = "bic";
    bic.cor = "azul";
    bic.tampada = true;
    bic.status();


    }
}
