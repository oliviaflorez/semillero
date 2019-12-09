package com.hbt.semillero.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.entidad.Personaje;

public class GestionarRolPersonajeComicBean {

	final static Logger logger = Logger.getLogger(GestionarRolPersonajeComicBean.class);

	@PersistenceContext
	private EntityManager entitymanager;
	
	public void crearRolPersonaje(PersonajeDTO personajeDTO ) {
		logger.debug("Inicio del metodo crearRolPersonaje");
		

		
		logger.debug("fin del metodo crearRolPersonaje");
	}		
	
	public void modificarRolPersonaje() {
		
		logger.debug("Inicio del metodo modificarRolPersonaje");
		
		logger.debug("fin del metodo modificarRolPersonaje");
	}		
	
	public void eliminarRolPersonaje() {
		logger.debug("Inicio del metodo eliminarRolPersonaje");
	
		logger.debug("fin del metodo eliminarRolPersonaje");		
	
	}
	
	public void consultarRolPersonajes() {
		logger.debug("Inicio del metodo consultarRolPersonaje");
	
		logger.debug("fin del metodo consultarRolPersonaje");		
	
	}
	
	
}
