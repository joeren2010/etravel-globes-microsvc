package com.globes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class ApiCall {
	@Autowired
	private RestTemplate restTemplate;
	
	//api url for: cab
	private static final String urlPostCab = "http://localhost:7171/cab/storeCab";
	private static final String urlGetAllCab = "http://localhost:7171/cab/findAllCab";
	private static final String urlGetOneCab = "http://localhost:7171/cab/findCabById/{id}";
	private static final String urlDelAllCab = "http://localhost:7171/cab/deleteAll";
	private static final String urlDelOneCab = "http://localhost:7171/cab/deleteCabById/{cabid}";
	private static final String urlPutCab = "http://localhost:3000/meetings/";
	private static final String urlPatchCab = "http://localhost:3000/meetings/";
	
	//api url for: cart
	private static final String urlPostCart = "http://localhost:5151/cart/storeCart";
	private static final String urlGetAllCart = "http://localhost:5151/cart/findAllCart";
	private static final String urlGetOneCart = "http://localhost:5151/cart/findCartById/{cartid}";
	private static final String urlDelAllCart = "http://localhost:5151/cart/deleteAll";
	private static final String urlDelOneCart = "http://localhost:5151/cart/deleteCartById/{cartid}";
	private static final String urlPutCart = "http://localhost:3000/meetings/";
	private static final String urlPatchCart = "http://localhost:3000/meetings/";
	
	//api url for: client
	private static final String urlPostClts ="http://localhost:8181/client/signUp";
	private static final String urlPostClt ="http://localhost:8181/client/signIn";
	private static final String urlGetAllClt ="http://localhost:8181/client/findAllClient";
	private static final String urlGetOneClt ="http://localhost:8181/client/findClientById/{clientid}";
	private static final String urlDelAllClt ="http://localhost:8181/client/deleteAll";
	private static final String urlDelOneClt ="http://localhost:8181/client/deleteClientById/{clientid}";
	private static final String urlPutClt ="http://localhost:3000/meetings/";
	private static final String urlPatchClt ="http://localhost:3000/meetings/";
	
	//api url for: driver
	private static final String urlPostDvrs ="http://localhost:9191/driver/signUp";
	private static final String urlPostDvr ="http://localhost:9191/driver/signIn";
	private static final String urlGetAllDvr ="http://localhost:9191/driver/findAllDriver";
	private static final String urlGetOneDvr ="http://localhost:9191/driver/findDriverById/{driverid}";
	private static final String urlDelAllDvr ="http://localhost:6161/driver/deleteAll";
	private static final String urlDelOneDvr ="http://localhost:6161/driver/deleteDriverById/{driverid}";
	private static final String urlPutDvr ="http://localhost:3000/meetings/";
	private static final String urlPatchDvr ="http://localhost:3000/meetings/";
	
	//ResponseEntity<String> response = restTemplate.getForEngtity(Cab.class)
	
	public Cab getAllCab() {
		Cab cab = restTemplate.getForObject(urlGetAllCab, Cab.class);
		return cab;
	}
//	
//	public Category getCategoryDetails(int categoryId) {
//		Category category = restTemplate.getForObject(
//				urlCategory + "/category/id?id={categoryId}",
//				Category.class, categoryId);
//		return category;
//	}
}
