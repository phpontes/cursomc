package com.paulohenrique.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulohenrique.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
