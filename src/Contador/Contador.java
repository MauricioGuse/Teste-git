package Contador;

public class Contador {
    double  valor;

    public void incrementar() {
        this.valor++;
    }
    public void decrementar() {
        this.valor--;
    }
    public void exibir(){
        System.out.println("O valor atual é: " + this.valor);

    }
}
