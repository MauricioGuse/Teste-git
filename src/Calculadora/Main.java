package Calculadora;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double subtrair, n1, n2 = 0;
        Calculadora calculadora = new Calculadora();
        System.out.print("Digite o primeiro numero: ");
        n1 = leia.nextDouble();
        System.out.print("Digite o segundo numero: ");
        n2 = leia.nextDouble();
        subtrair = calculadora.subtrair(n1,n2);
        System.out.println("O resultado é: " + subtrair);

    }
}