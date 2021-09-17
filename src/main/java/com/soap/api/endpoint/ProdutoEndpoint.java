package com.soap.api.endpoint;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.api.IdProdutoRequest;
import com.soap.api.IdProdutoResponse;
import com.soap.api.entity.Produto;
import com.soap.api.service.ProdutoService;

@Endpoint
public class ProdutoEndpoint {
	
	@Autowired
	private ProdutoService produtoService;
	
	private static final String NAMESPACE = "http://api.soap.com";
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "IdProdutoRequest")
	@ResponsePayload
	public IdProdutoResponse processCustumerDetailRequest(@RequestPayload IdProdutoRequest req) {
		
		Optional<Produto> p = produtoService.findById(req.getId());
		
		
		IdProdutoResponse resp = new IdProdutoResponse();
		resp.setDescricao(p.get().getDescricao());
		resp.setId(p.get().getId());
		resp.setName(p.get().getNome());
		resp.setPreco(p.get().getPreco());
		
		return resp;
	}

}
