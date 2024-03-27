class Livro{
    String titulo;
    String autor;
    int ano;

    public void status(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicacao: " + ano);
    }
    
}

public class Ex1 {
    
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "Harry Potter";
        l1.autor = "J K Rowling";
        l1.ano = 1997;
        l1.status();
    }
}
