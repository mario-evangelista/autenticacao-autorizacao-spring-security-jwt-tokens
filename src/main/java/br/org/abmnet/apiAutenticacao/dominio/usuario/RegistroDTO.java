package br.org.abmnet.apiAutenticacao.dominio.usuario;

public record RegistroDTO(String login, String senha, UsuarioNivel role) {
}
