package Contador;

import java.util.Scanner;

public class main {
    public static void main(String[] Args){
        Scanner leia = new Scanner(System.in);
        Contador contador1 = new Contador();
        System.out.println("Digite um valor: ");

        contador1.valor = 1;
        contador1.incrementar();
        contador1.exibir();

        contador1.valor = 5;
        contador1.decrementar();
        contador1.exibir();
    }
}
