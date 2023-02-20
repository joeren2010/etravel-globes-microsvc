package com.globes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.globes.entity.Resv;
import com.globes.repository.ResvRepository;


@Service
public class ResvService {
	//instantiates interface using autowired
	@Autowired
	ResvRepository resvRepository;
	@Autowired
	ApiCall apiCall;
	
	public String storeResv(Resv resv) {
		resvRepository.save(resv);			//insert query = similar to pojo
		return "Resv Details stored successfully";
	}
	
	public List<Resv> findAllResv() {
		return resvRepository.findAll();			//select query 
	}
	
	public List<Resv> findResvByPrice(int price){
		return resvRepository.searchResvByPrice(price);
	}
	
	public String findResvById(int resvid) {
		//using "optional" method
		Optional<Resv> result = resvRepository.findById(resvid);			//using primary key
		if(result.isPresent()) {
			Resv pp = result.get();
			return pp.toString();
		}else {
			return "Resv not present";
		}
	}
	
	public String updateResvDetails(Resv resv) {
		//using "optional" method
		Optional<Resv> result = resvRepository.findById(resv.getResvId());		//using primary key
		if(result.isPresent()) {
			Resv pp	= result.get();
			pp.setTotalAmount(resv.getTotalAmount());
			/*
			 * 	we can update more property 
			 * 
			 */
			resvRepository.saveAndFlush(pp);			//flush = clears-out the repo of any buffer data
			return "Resv Details updated successfully";
		}else {
			return "Resv not present";
		}
	}
	
	public String deleteResvUsingId(int resvid) {
		//using "optional" method
		Optional<Resv> result = resvRepository.findById(resvid);              //using primary key
		if(result.isPresent()) {
			Resv pp = result.get();
			resvRepository.deleteById(pp.getResvId());
			return "Resv details deleted successfully";
		}else {
			return "Resv not present";
		}
	}
	
	public String deleteAllResv() {
		resvRepository.deleteAll();
		return "Add resv deleted";
	}
}
