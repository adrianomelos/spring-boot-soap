package com.soap.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soap.api.entity.Produto;
import com.soap.api.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	public Optional<Produto> findById(int id) {
		return produtoRepository.findById(Long.valueOf(id));
	}

}
