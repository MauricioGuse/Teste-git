package ContaBancaria;

public class ContaBancaria {
    String nome;
    int numeroDaConta;
    double saldo;
    double saque;


    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public double sacar(double valor) {
        if ((this.saldo >= saque) && (saque <= this.saldo)) {
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("Saldo insuficiente! ");
            return this.saldo;
        }
        return valor;
    }
    public void exibirSaldo(){

    }
}










