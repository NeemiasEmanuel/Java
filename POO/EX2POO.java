/**
 * InnerEX2POO
 */
class Pessoa{
    String nome;
    int idade;
    double peso;
    double altura;

    public void status(){
        System.out.println("Nome: " + this.nome );
        System.out.println("Idade " + this.idade );
        System.out.println("Peso: " + this.peso );
        System.out.println("Altura: " + this.altura +"\n");
       
    }
    public void envelhecer()
    {
        
        if(this.idade < 21)
        {
        this.altura += 0.01;
        }
        this.idade++;
    }
    public void engordar(double kilo){
     this.peso += kilo;   
    }
    public void emagrecer(double kilo){
        this.peso -= kilo;
    }
}

public class EX2POO {
    
    
    
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Marcelo Fassina";
        p1.idade = 55;
        p1.peso = 84.93;
        p1.altura = 1.82;
        p1.status();
        p1.envelhecer();
        p1.status();
       
        p1.engordar(10);
        p1.status();
        p1.emagrecer(20);
        p1.status();
        /* 
        Pessoa p2 = new Pessoa();       
        p2.nome = "Joao Pedro";
        p2.idade = 24;
        p2.peso = 77;
        p2.altura = 1.71;
        p2.status();*/
    }
}
