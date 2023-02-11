package com.globes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.globes.entity.Resv;
import com.globes.service.ResvService;


@RestController						//use rest-controller for frameworks like angular, etc
@RequestMapping("resv") 		//map url to products webpage = http://localhost:7171/cab
@CrossOrigin						//to address CORS issues
public class ResvController {
	//instantiates class using autowired
	@Autowired
	ResvService resvService;
	
	// http://localhost:7171/cab/storeResv 
	@PostMapping(value = "storeResv",consumes = MediaType.APPLICATION_JSON_VALUE)	//pass data in json format 
	//@request-body binds the http request values to the entity class
	public String storeResv(@RequestBody Resv resv) {
		System.out.println(resv);
		//return "done";
		return resvService.storeResv(resv);
	}
	
	// http://localhost:7171/resv/findAllResv
	@GetMapping(value = "findAllResv",produces = MediaType.APPLICATION_JSON_VALUE)		//pass data in json format
	public List<Resv> findAllResv() {
		return resvService.findAllResv();
	}
	
	// http://localhost:8383/resv/findResvById/1 or // http://localhost:7171/resv/findResvById/100
	@GetMapping(value = "findResvById/{pid}")
	//@pathvariable extracts data directly from the url e.g: pid = 1 or 100 as above
	public String findResvById(@PathVariable("pid") int pid) {
		return resvService.findResvById(pid);
	}
	
	// http://localhost:7171/resv/findResvByPrice/35000
	@GetMapping(value = "findResvByPrice/{price}")
	//@pathvariable extracts data directly from the url e.g: price = 35000 as above
	public List<Resv> findResvByPrice(@PathVariable("price") int price) {
		return resvService.findResvByPrice(price);
	}
	
	// http://localhost:7171/resv/updateResv
	@PutMapping(value = "updateResv",consumes = MediaType.APPLICATION_JSON_VALUE)		//pass data in json format
	//@request-body binds the http request values to the entity class
	public String updateResv(@RequestBody Resv resv) {
		return resvService.updateResvDetails(resv);
	}
	
	// http://localhost:7171/resv/deleteResvById/1
	@DeleteMapping(value = "deleteResvById/{pid}")
	//@pathvariable extracts data directly from the url e.g: pid = 1 as above
	public String deletetResvById(@PathVariable("pid") int pid) {
		return resvService.deleteResvUsingId(pid);
	}
	
	// http://localhost:7171/resv/deleteAll
	@DeleteMapping(value = "deleteAll")
	public String deletetAll() {
		return resvService.deleteAllResv();
	}
}
