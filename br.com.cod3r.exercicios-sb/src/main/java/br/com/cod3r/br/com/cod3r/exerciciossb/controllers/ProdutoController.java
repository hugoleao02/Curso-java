package br.com.cod3r.br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT})
    public @ResponseBody Produto novoProduto(@Valid Produto produto){
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/nome/{parteNome}")
    public Iterable<Produto> obterProdutosNome(@PathVariable String parteNome) {
        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }

    @GetMapping("/pagina/{numeroPagina}")
    public Iterable<Produto> obterProdutoPorPagina( @PathVariable int numeroPagina ){
        PageRequest page = PageRequest.of(numeroPagina,2);
        return produtoRepository.findAll(page);
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }

//    @PutMapping
//    public Produto alterarProdutod(@Valid Produto produto){
//        produtoRepository.save(produto);
//        return produto;
//    }

    @DeleteMapping( "/{id}")
    public void excluirPoduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
}
