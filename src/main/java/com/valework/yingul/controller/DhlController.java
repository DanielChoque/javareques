package com.valework.yingul.controller;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("/dhl")
public class DhlController {
	private final String apiKey="46e903f2a3e1cb1933db836b99df089f91e9fd57";
	private final String secretKey="8a5b791c1e426a96650b54693f04aec02e89b280";
	private final String urlApi= "https://api.enviopack.com";
	private final String cotizarDomicilio="/cotizar/precio/a-domicilio?access_token=";
	private final String cotizarSucursal="/cotizar/precio/a-sucursal?access_token=";
	private final String cotizarCosto="/cotizar/costo?access_token=";
	@RequestMapping("/tokken")
	public String da(){
		Client client = ClientBuilder.newClient();
		Response response = client.target("https://private-anon-ee29acebcf-efulfillment1.apiary-proxy.com/efulfillment/v1/auth/accesstoken")
		  .request(MediaType.TEXT_PLAIN_TYPE)
		  .header("Accept", "application/json")
		  .header("Authorization", "Basic ZTllZDgyYTgtNDIzNy00MTg1LThlMzYtNDcyNjRhYTllNzE4OmIxZWQxYmZhLTY4OWItNGQ1Yi1iYmYyLTM5ZGRlNjRjY2I2NA==")
		  .get();

		System.out.println("status: " + response.getStatus());
		System.out.println("headers: " + response.getHeaders());
		System.out.println("body:" + response.readEntity(String.class));
		return "save";
	}
	
}
