package com.globes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globes.entity.Client;
import com.globes.service.ClientService;


@RestController					//use rest-controller for frameworks like angular, etc
@RequestMapping("client") 		//map url to driver webpage = http://localhost:8181/client
@CrossOrigin					//to address CORS issues
public class ClientController {
	//instantiates class using autowired
	@Autowired
	ClientService clientService;
	
	
	//code for client sign-up
	//map url to client sign-up webpage = http://localhost:8181/client/signUp
	@PostMapping(value = "signUp",consumes = MediaType.APPLICATION_JSON_VALUE)	//pass data in json format 
	//@request-body binds the http request values to the entity class
	public String signUp(@RequestBody Client client) {
		System.out.println(client);
		return clientService.signUp(client);
	}
	
	//code for admin sign-in
	//map url to admin sign-in webpage = http://localhost:8181/client/signIn
	@PostMapping(value = "signIn")		
	//@request-body binds the http request values to the entity class
	public String signInClient(@RequestBody Client client) {
		return clientService.signInClient(client);
	}
}
