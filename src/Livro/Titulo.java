package Livro;

public class Titulo {

    String titulo;
    String autor;
    int anoDePubli = 1985;
    int anoDePubli2 = 1991;

    public void exibir(){
        System.out.println("Autor do livro: " + this.autor);
        System.out.println("Ano de publicação: " + this.anoDePubli);
    }

}

