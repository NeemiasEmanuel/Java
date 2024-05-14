import java.util.ArrayList;
import java.util.List;

public class AtividadeExtra {
    public static void main(String[] args) {
        Carro carro = new Carro("VW", "GOl", 2020, 2, 12);
        Moto moto = new Moto("Honda", "start", 2019, 20, 42);
        List<Veiculo> frota = new ArrayList<>();
        frota.add(moto);
        frota.add(carro);
        for(Veiculo elemento : frota){
            elemento.realizarViagem(200);
            elemento.mostrarDetalhes();
            //elemento.acelerar();
        }
        moto.acelerar();
        carro.frear();
        System.out.println(moto.calcularAutonomia());
        System.out.println("Precisa abastecimento? " + carro.precisaAbastecimento());
        frota.remove(moto);
        System.out.println(frota);
       // carro.realizarViagem(26);
       // carro.mostrarDetalhes();
       // moto.realizarViagem(200);
       // moto.mostrarDetalhes();


    }
     
}

class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double combustivel;
    private double consumoMedio;
 
    public Veiculo(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;
    }
 
    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }
 
    public String getModelo() {
        return modelo;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
 
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
 
    public double getCombustivel() {
        return combustivel;
    }
 
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
 
    public double getConsumoMedio() {
        return consumoMedio;
    }
 
    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }


    public double calcularAutonomia(){
        return this.combustivel * this.consumoMedio;
    }

    public boolean precisaAbastecimento(){
        if(calcularAutonomia() <= 30 ){
           return true; 
        }
        else{
            return false;
        }
    }

    public void realizarViagem(double distancia){
        if(calcularAutonomia() >= distancia){
       //     
            double litros = distancia /getConsumoMedio();
            setCombustivel(getCombustivel() - litros);
            
            System.out.println("Viagem realizada com sucesso! Restaram "+ getCombustivel() + " litros de combustível no veículo!");
        }
        else{
            System.out.println("Não foi possível realizar a viagem!");
        }
    }
    public void mostrarDetalhes(){
        System.out.println("Veiculo: " + getMarca() + " " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano fabricacao: " + getAnoFabricacao());
        System.out.println("Autonomia: " + calcularAutonomia() + " Km");
        System.out.println("Precisa de abastecimento? " + precisaAbastecimento());
    }


}
class Carro extends Veiculo{
    
    public Carro(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio){
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
    }
    public void acelerar(){
        System.out.println("Carro acelerando...");
    }
    public void frear(){
        System.out.println("Carro freando...");
    }

}
class Moto extends Veiculo{
    
    public Moto(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio){
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
    }
    public void acelerar(){
        System.out.println("Moto acelerando...");
    }
    public void frear(){
        System.out.println("Moto freando...");
    }

}