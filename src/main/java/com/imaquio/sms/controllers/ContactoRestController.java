package com.imaquio.sms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imaquio.sms.dto.Contacto;
import com.imaquio.sms.service.ContactoService;

//@CrossOrigin(origins= {"http://localhost:8100"})
@CrossOrigin
@RestController
@RequestMapping("/api")
public class ContactoRestController {

	@Autowired
	private ContactoService contactoService;
	
	@GetMapping("/contactos")
public List<Contacto> buscarContactos(){
		return contactoService.obtenerContactos();
		
	}
	

}
