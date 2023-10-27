package com.paulohenrique.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulohenrique.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
