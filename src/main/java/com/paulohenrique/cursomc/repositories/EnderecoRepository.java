package com.paulohenrique.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulohenrique.cursomc.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
