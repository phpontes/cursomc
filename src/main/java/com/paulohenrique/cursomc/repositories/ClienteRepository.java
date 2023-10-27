package com.paulohenrique.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulohenrique.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
