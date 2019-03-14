package com.imaquio.sms.dao;

import org.springframework.data.repository.CrudRepository;

import com.imaquio.sms.dto.Contacto;

public interface IContactoDao extends CrudRepository<Contacto, String> {

}
