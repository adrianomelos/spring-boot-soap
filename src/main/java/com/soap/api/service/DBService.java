package com.soap.api.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soap.api.entity.Produto;
import com.soap.api.repository.ProdutoRepository;

@Service
public class DBService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public void start() {

		Produto p1 = new Produto(null, "Feijão", "feijão preto", 2.65);
		Produto p2 = new Produto(null, "Arroz", "branco parborizado", 4.5);
		Produto p3 = new Produto(null, "Macarrão", "espagete", 2.12);
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

	}

}
