package br.org.abmnet.apiAutenticacao.repositorios;

import br.org.abmnet.apiAutenticacao.dominio.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
