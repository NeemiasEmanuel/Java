/*class Pessoa{
    
    String nome;
    int idade;
    boolean falando = false;
    boolean comendo = false;
    
    public void status(){
        System.out.println("Nome: " + this.nome + ".");
        System.out.println("Idade " + this.idade + ".");
        System.out.println("Falando: " + this.falando + ".");
        System.out.println("Comendo: " + this.comendo);
    }
    
    public void falar(){
        if(this.comendo == true){
            System.out.println(this.nome + " nao pode falar comendo.");
        }
        else if (this.falando == true){
            System.out.println(this.nome + " ja esta falando.");
        }
        else{
            this.falando = true;
            System.out.println(this.nome + " esta falando.");
        }
    }
    
    public void parar_falar(){
        if (this.falando == false){
            System.out.println(this.nome + " nao esta falando.");
        }
        else{
            this.falando = false;
            System.out.println(this.nome + " parou de falar.");
        }
    }
 
    public void comer(String alimento){
        if(this.falando == true){
            System.out.println(this.nome + " nao pode comer falando.");
        }
        else if (this.comendo == true){
            System.out.println(this.nome + " ja esta comendo.");
        }
        else{
            this.comendo = true;
            System.out.println(this.nome + " esta comendo " + alimento +".");
        }
    }
    
    public void parar_comer(){
        if(this.comendo == false){
            System.out.println(this.nome + " nao esta comendo.");
        }
        else{
            this.comendo = false;
            System.out.println(this.nome + " parou de comer.");
        }
    }
}
    
class exemplo{
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Marcelo";
        p1.idade = 55;
        
        p1.falar();
        
        p1.comer("pao");
        p1.status();
        Pessoa p2 = new Pessoa();
        p2.nome = "Pedro";
        p2.idade = 24;
        
    }
}*/