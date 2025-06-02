package entities;

public class Conta {
    private int numeroConta;
    private double saldo;

    public Conta() {
    }
    public Conta(int numeroConta) {
        this.numeroConta = numeroConta;
        saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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

