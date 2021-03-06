package com.example.tsreportingservice.controller;

import com.example.tsreportingservice.model.ClientActivity;
import com.example.tsreportingservice.model.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientActivityController {
	@Autowired
	private ClientRepository clientRepository;
	
	@PostMapping("/client-report")
	public ResponseEntity<Object> ReportClientActivity(@RequestBody ClientActivity clientActivity){
		System.out.println("%%%1***Client connectivity:: "+ clientActivity.getClientId() +"("+ clientActivity.getFullName()+") "+clientActivity.getAction());
		ClientActivity newClientActivity = new ClientActivity(clientActivity.getClientId(), clientActivity.getFullName(), clientActivity.getAction());
		System.out.println(newClientActivity);
		clientRepository.save(newClientActivity);
		
		return ResponseEntity.ok().build();
	}
}
