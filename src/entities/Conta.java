package entities;

public class Conta {
    public int numeroConta;
    public double saldo;

    public Conta(int numeroConta) {
        this.numeroConta = numeroConta;
        saldo = 0;
    }

    public void depositar(double valor) {
        if (valor < 0){
            System.out.println("ERRO: Valor precisa ser maior que zero!");
        }
        saldo += valor;

    }
    public void sacar(double valor) {
        if (valor < 0){
            System.out.println("ERRO: Valor precisa ser maior que zero!");
        }else {
            if (valor > saldo){
                System.out.println("ERRO: Saldo insuficiente!");
            }else{
                saldo -= valor;
            }
        }
    }
}

