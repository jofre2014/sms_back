package com.imaquio.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.imaquio.sms.dao.IContactoDao;
import com.imaquio.sms.dto.Contacto;

@Service
public class ContactoService {
	
	@Autowired
	private IContactoDao contactoDao;
	
	@Transactional(readOnly=true)
	public List<Contacto> obtenerContactos(){
				
		return (List<Contacto>)contactoDao.findAll();
		
	}
	
}
