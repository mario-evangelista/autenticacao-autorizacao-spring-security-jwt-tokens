package br.org.abmnet.apiAutenticacao.dominio.produto;

import br.org.abmnet.apiAutenticacao.dominio.produto.Produto;

public record ProdutoResponseDTO(String id, String name, Integer price) {
    public ProdutoResponseDTO(Produto produto) {
        this(produto.getId(), produto.getNome(), produto.getPreco());
    }
}
