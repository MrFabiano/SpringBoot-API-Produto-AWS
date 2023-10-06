package br.com.apiproduto.service.impl;

import br.com.apiproduto.entity.Produto;
import br.com.apiproduto.repository.ProdutoRepository;
import br.com.apiproduto.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Override
    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void delete(Long id) {
       try{
           produtoRepository.deleteById(id);
       }catch (Exception e){
           throw new RuntimeException("Ocorreu um erro ao excluir o produto");
       }
    }
}

