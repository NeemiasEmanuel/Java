class AV1{
    public static void main(String[] args) {
        Lampada lamp = new Lampada("Philips", 80);
        Lampada osram = new Lampada("Osran", 60);
        
        osram.ligarLampada();
        lamp.ligarLampada();
        osram.quebrarLampada();
        osram.quebrarLampada();
        osram.mostrarInformacoes();
       
        lamp.mostrarInformacoes();
    }
}
class Lampada{
    public String marca;
    public int potencia;
    public boolean ligada;
    public boolean quebrada;

    public Lampada(String marca, int potencia){
        this.marca = marca;
        this.potencia = potencia;
        this.ligada = false;
        this.quebrada = false;

    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public int getPotencia(){
        return this.potencia;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public boolean getLigada(){
        return this.ligada;
    }
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    public boolean getQuebrada(){
        return this.quebrada;
    }
    public void setQuebrada(boolean quebrada){
        this.quebrada = quebrada;
    }
    public void mostrarInformacoes(){
        System.out.println("Marca:"+ this.getMarca());
        System.out.println("Potencia:"+this.getPotencia());
        System.out.println("Ligada:"+this.getLigada());
        System.out.println("Quebrada:"+this.getQuebrada());
    }
    public void ligarLampada(){
        if(this.getQuebrada() == false){
            if(this.getLigada() == false){
                this.setLigada(true);
                System.out.println("A lampada foi ligada!");
            }
            else{
                System.out.println("A Lampada ja esta ligada!");
            }
        }
        else{
            System.out.println("Lampada esta quebrada!");
        }
    }
    public void desligarLampada(){
        if(this.getQuebrada() == false){
            if(this.getLigada() == true){
                this.setLigada(false);
                System.out.println("A lampada foi desligada!");
            }
            else{
                System.out.println("A Lampada ja esta desligada!");
            }
        }
        else{
            System.out.println("Lampada esta quebrada!");
        }
    }
    public void quebrarLampada(){
        if(this.getQuebrada()== false){
            this.setQuebrada(true);
            this.setLigada(false);//nao faz setido uma lampada quebrada estar ligada
            System.out.println("A lampada foi quebrada!");
            
        }
        else{
            System.out.println("A lampada ja esta quebrada!");
        }
    }
}