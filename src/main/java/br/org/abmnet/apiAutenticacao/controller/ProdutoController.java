package br.org.abmnet.apiAutenticacao.controller;

import br.org.abmnet.apiAutenticacao.dominio.produto.Produto;
import br.org.abmnet.apiAutenticacao.dominio.produto.ProdutoRequestDTO;
import br.org.abmnet.apiAutenticacao.dominio.produto.ProdutoResponseDTO;
import br.org.abmnet.apiAutenticacao.repositorios.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    ProdutoRepository repository;

    @PostMapping
    public ResponseEntity postProduto(@RequestBody @Valid ProdutoRequestDTO body) {
        Produto newProduto = new Produto(body);

        this.repository.save(newProduto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllProdutos() {
        List<ProdutoResponseDTO> productList = this.repository.findAll().stream().map(ProdutoResponseDTO::new).toList();

        return ResponseEntity.ok(productList);
    }
}
