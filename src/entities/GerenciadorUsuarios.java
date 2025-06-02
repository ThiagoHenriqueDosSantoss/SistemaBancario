package entities;

import java.util.ArrayList;

public class GerenciadorUsuarios {
    public ArrayList<Usuario> usuarios = new ArrayList<>();
    public void adicionarUsuario(Usuario u) {
        usuarios.add(u);
    }
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}

