package application;

import entities.Conta;
import entities.GerenciadorUsuarios;
import entities.Usuario;

public class SistemaBanco {
    public static void main(String[] args) {
        Usuario u = new Usuario("Carlos",-25);
        GerenciadorUsuarios g = new GerenciadorUsuarios();
        g.adicionarUsuario(u);
        u.setConta(new Conta(12345));
        u.getConta().depositar(-100);
        u.getConta().sacar(50);
        u.getRelatorio().gerarRelatorioUsuario(g);
    }
}
