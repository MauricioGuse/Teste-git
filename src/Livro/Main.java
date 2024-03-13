package Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        String titulo;

        Titulo titulo1 = new Titulo();
        System.out.println("Digite o titulo do livro: ");
        titulo = leia.next();
        System.out.println("Titulo do livro: " + titulo);
        titulo1.autor = "Rafael";
        titulo1.exibir();

        System.out.println("\n******************************\n");
    }
}
