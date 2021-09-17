package com.soap.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soap.api.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
