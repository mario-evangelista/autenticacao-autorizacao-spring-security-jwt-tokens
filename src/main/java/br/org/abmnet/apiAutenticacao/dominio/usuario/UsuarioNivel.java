package br.org.abmnet.apiAutenticacao.dominio.usuario;

public enum UsuarioNivel {
    ADMIN("admin"),
    USUARIO("usuario");

    private String role;

    UsuarioNivel(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}