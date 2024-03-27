class exemplo {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        //c1.status();

        //c1.fecharConta(); //testa mensagem de erro conta aberta
        //c1.depositar(40); //testa mensagem de erro conta aberta
        //c1.pagarMensalidade();//testa mensagem de erro conta aberta
        //c1.sacar(0);//testa mensagem de erro conta aberta

        c1.abrirConta(10,"CC","Neemias");
        //c1.status();//ve as informaçoes da conta

        //c1.fecharConta(); //testa mensagem de erro saldo cheio
        
        
        //c1.pagarMensalidade();//testa funcionalidade

        //c1.depositar(40);//testa funcionalidade
        //c1.sacar(38);//testa funcionalidade
        //c1.pagarMensalidade();//testa funcionalidade com saldo no limite    
        //c1.pagarMensalidade();//testa mensagem de erro saldo insuficiente    
        //c1.fecharConta();//testa funcionalidade
        //c1.status();
            
        //c1.sacar(9000);//testa mensagem de erro saldo insuficiente

    }
}

public class Conta {
    public int numeroconta;
    protected String tipoConta;
    private String titularConta;
    private float  saldo;
    private boolean status;

   
    public Conta(){       
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getnumeroConta(){
        return this.numeroconta;
    }
    public void setnumeroConta(int numeroconta){
        this.numeroconta = numeroconta;
    } 
    public String getTipoConta(){
        return this.tipoConta;
    }
    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    } 
    public String getTitularConta(){
        return this.titularConta;
    }
    public void setTitularConta(String titularConta){
        this.titularConta = titularConta;
    } 
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    } 
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
        this.status = status;
    } 
 
    public void status(){
        System.out.println("NumeroConta: " + this.getnumeroConta());
        System.out.println("tipoConta: " + this.getTipoConta());
        System.out.println("TitularConta: " + this.getTitularConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }


    public void abrirConta(int numeroconta, String tipoConta, String titularConta){
        this.setnumeroConta(numeroconta);
        this.setTipoConta(tipoConta);
        this.setTitularConta(titularConta);
        this.setStatus(true);
        if(getTipoConta() == "CC"){
            this.setSaldo(50);
        }
        else{
            
            this.setSaldo(150);
        }
        System.out.println("Conta Criada com sucesso!");
        
    }
    public void fecharConta(){
    if(getStatus() == true){
        if(getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Conta fechado com sucesso!");
        }
        else{
            System.out.println("A conta precisa ter o saldo zerado");
        }
    }
    else{
        System.out.println("A conta precisa estar aberta");
    }
    }
    public void depositar(float deposito){
        if(getStatus() == true){
            deposito = getSaldo() + deposito;
            this.setSaldo(deposito);
            status();
        }
        else{
            System.out.println("A conta precisa estar aberta");
        }
    }
    public void sacar(float sacar){
        if(getStatus() == true){
        if(getSaldo() >= sacar){
            sacar = getSaldo() - sacar;
            this.setSaldo(sacar);
            status();
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
        }
        else{
            System.out.println("A conta precisa estar aberta");
        }
    }
    public void pagarMensalidade(){
        if(getStatus() == true){
        
        float mensalidade = 0;
        
        if(getTipoConta() == "CC"){
            mensalidade = 12;
        
        }
        else{
            mensalidade = 20;
            
        }

        if(getSaldo() >= mensalidade){
            mensalidade = getSaldo() - mensalidade;
            this.setSaldo(mensalidade);
            status();
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
        }
        else{
            System.out.println("A conta precisa estar aberta");
        }

    }

    
}
