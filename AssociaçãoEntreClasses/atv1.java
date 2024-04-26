package AssociaçãoEntreClasses;

public class atv1 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Maca", 3.0);
        Produto produto2 = new Produto("Banana", 2.0);
        Produto produto3 = new Produto("Biscoito", 5.0);
        Produto produto4 = new Produto("Bolacha", 8.0);

        Secao secao1 = new Secao("Frutaria");
        secao1.adicionarProduto(produto1);
        secao1.adicionarProduto(produto2);

        Secao secao2 = new Secao("Biscoiteria");
        secao1.adicionarProduto(produto3);
        secao1.adicionarProduto(produto4);

        Loja loja1 = new Loja("Mulfato");
        loja1.adicionarSecao(secao1);
        loja1.adicionarSecao(secao2);
        
        loja1.listarProdutos();
    }
}
class Produto{
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }

}
class Secao{
    String nome;
    private Produto[] produtos;
    private int numProduto;
    
    public Secao(String nome){
        this.nome = nome;
        this.produtos = new Produto[10];
        this.numProduto = 0;
    }
    public void adicionarProduto(Produto produto){
       produtos[numProduto] = produto;
       numProduto++;
    }
    public void listarProdutos(){
        System.out.println("Secao " + nome);
        for (int i = 0; i < this.numProduto; i++) {
            System.out.println("Produto:" + produtos[i].getNome() + " R$" + produtos[i].getPreco() );
            
        }
        System.out.println(); 
    }
    
}
class Loja {
    private String nome;
    private Secao[] Secoes;
    private int numSecao;
    
    public Loja(String nome){
        this.nome = nome;
        this.Secoes = new Secao[10];
        this.numSecao = 0;
    }

    public void adicionarSecao(Secao secao){
       Secoes[numSecao] = secao;
        numSecao++;
    }

    public void listarProdutos(){
        System.out.println("Loja " + this.nome);
        for (int i = 0; i < numSecao; i++) {
            Secoes[i].listarProdutos(); 
        }
        
    }

}