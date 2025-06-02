package entities;

import java.util.List;

public class Relatorio{

    public void gerarRelatorioUsuario(GerenciadorUsuarios g) {
        System.out.println("Relatório de Usuários:");
        for (Usuario u : g.getUsuarios()) {
            System.out.println(u);
        }
    }
}
