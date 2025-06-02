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
            System.out.println("ERRO: Valor para deposito precisa ser maior que zero!");
            System.exit(0);
        }
        saldo += valor;

    }
    public void sacar(double valor) {
        if (valor < 0){
            System.out.println("ERRO: Valor para saque precisa ser maior que zero!");
            System.exit(0);
        }else {
            if (valor > saldo){
                System.out.println("ERRO: Saldo insuficiente!");
                System.exit(0);
            }else{
                saldo -= valor;
            }
        }
    }
}

