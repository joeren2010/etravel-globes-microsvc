package com.globes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globes.entity.Client;
import com.globes.repository.ClientRepository;


@Service
public class ClientService {
	//instantiates interface using autowired
	@Autowired
	ClientRepository clientRepository;
	
	
	//code for client sign-up
	public String signUp(Client client) {
		clientRepository.save(client);			//insert query = similar to pojo
		return "Client Details stored successfully";
	}
	
	//code for client sign-in
	public String signInClient(Client client) {
		if(clientRepository.signIn(client.getEmail(), client.getPassword())!=null) {
			return "success";
		}else {
			return "failure";
		}
	}
}
