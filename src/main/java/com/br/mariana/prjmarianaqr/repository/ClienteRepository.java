package com.br.mariana.prjmarianaqr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.mariana.prjmarianaqr.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
