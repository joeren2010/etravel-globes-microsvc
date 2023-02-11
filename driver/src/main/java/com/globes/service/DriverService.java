package com.globes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globes.entity.Driver;
import com.globes.repository.DriverRepository;


@Service
public class DriverService {
	//instantiates interface using autowired
	@Autowired
	DriverRepository driverRepository;
	
	
	//code for driver sign-up
	public String signUp(Driver driver) {
		driverRepository.save(driver);			//insert query = similar to pojo
		return "Driver Details stored successfully";
	}
	
	//code for driver sign-in
	public String signInDriver(Driver driver) {
		if(driverRepository.signIn(driver.getEmail(), driver.getPassword())!=null) {
			return "success";
		}else {
			return "failure";
		}
	}
}
