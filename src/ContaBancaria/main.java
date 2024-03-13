package ContaBancaria;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double valor;
        double saque;

        ContaBancaria conta1 = new ContaBancaria();
        System.out.println("Informe o valor: ");
        valor = leia.nextDouble();
        conta1.depositar(valor);
        conta1.exibirSaldo();

        ContaBancaria saque1 = new ContaBancaria();
        System.out.println("Qual o valor deseja sacar? ");
        saque = leia.nextDouble();
        saque1.sacar(saque);
        conta1.exibirSaldo();

    }
}
