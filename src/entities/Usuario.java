package entities;

public class Usuario {
    private String nome;
    private int idade;
    private  Conta conta;
    private  Relatorio relatorio;

    public Usuario() {

    }
    public Usuario(String nome, int idade) {
        if (idade < 0){
            System.out.println("ERRO: Idade não pode ser um valor menor que zero!");
        }
            this.nome = nome;
            this.idade = idade;
            this.conta = new Conta();
            this.relatorio = new Relatorio();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Relatorio getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "\nnome='" + nome + '\'' +
                "\nidade=" + idade +
                "\nconta=" + conta.getNumeroConta() +
                "\nsaldo=" + conta.getSaldo() +
                "\n}";
    }
}
