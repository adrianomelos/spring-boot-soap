package com.soap.api.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.api.IdProdutoRequest;
import com.soap.api.IdProdutoResponse;

@Endpoint
public class ProdutoEndpoint {
	
	private static final String NAMESPACE = "http://api.soap.com";
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "IdProdutoRequest")
	@ResponsePayload
	public IdProdutoResponse processCustumerDetailRequest(@RequestPayload IdProdutoRequest req) {
		IdProdutoResponse id = new IdProdutoResponse();
		id.setId(321);
		
		return id;
	}

}
