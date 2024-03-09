package Pessoas;

import java.util.Scanner;

public class chama {

    public static void main(String[] Args) {
        Scanner leia = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Mauricio";
        pessoa1.idade = 32;
        pessoa1.cpf = "077.779.429-21";
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("CPF: " + pessoa1.cpf);
        pessoa1.corre();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Gustavo";
        pessoa2.idade = 32;
        pessoa2.cpf = "077.779.429-21";
        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
        System.out.println("CPF: " + pessoa2.cpf);
        pessoa2.treinando();


    }
}
