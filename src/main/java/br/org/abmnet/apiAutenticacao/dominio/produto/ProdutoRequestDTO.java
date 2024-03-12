package br.org.abmnet.apiAutenticacao.dominio.produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoRequestDTO(
        @NotBlank
        String nome,

        @NotNull
        Integer preco
) {
}
