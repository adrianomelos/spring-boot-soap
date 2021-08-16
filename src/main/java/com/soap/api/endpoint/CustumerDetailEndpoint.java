package com.soap.api.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.soap.api.CustomDetail;
import com.soap.api.GetCustomDetailRequest;
import com.soap.api.GetCustomDetailResponse;

@Endpoint
public class CustumerDetailEndpoint {
	
	private static final String NAMESPACE = "http://api.soap.com";
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "GetCustomDetailRequest")
	@ResponsePayload
	public GetCustomDetailResponse processCustumerDetailRequest(@RequestPayload GetCustomDetailRequest req) {
		
		CustomDetail obj = new CustomDetail();
		obj.setEmail("adrianoshout@gmail.com");
		obj.setId(1);
		obj.setName("adriano");
		obj.setPhone("79 999953-0291");
		
		GetCustomDetailResponse response = new GetCustomDetailResponse();
		response.setCustomDetail(obj);
		
		return response;
	}

}
