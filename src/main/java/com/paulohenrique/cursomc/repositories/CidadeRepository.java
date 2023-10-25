package com.paulohenrique.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulohenrique.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
