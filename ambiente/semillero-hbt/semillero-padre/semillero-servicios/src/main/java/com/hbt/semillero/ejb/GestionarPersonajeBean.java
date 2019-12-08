package com.hbt.semillero.ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

/**
 * <b>Descripción:<b> Clase que determina el bean para la gestion de personajes
 * @author olivia florez
 * @version
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)

public class GestionarPersonajeBean {
	
	final static Logger logger = Logger.getLogger(GestionarPersonajeBean.class);

	@PersistenceContext
	private EntityManager em;
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	
	public void crearPersonaje() {
		logger.debug("Inicio del metodo crearPersonaje");
		
		logger.debug("fin del metodo crearPersonaje");
	}	
	public void modificarPersonaje() {
	
			logger.debug("Inicio del metodo modificarPersonaje");
			
			logger.debug("fin del metodo modificarPersonaje");
	}		
		
	public void eliminarPersonaje() {
		logger.debug("Inicio del metodo eliminarPersonaje");
		
		logger.debug("fin del metodo eliminarPersonaje");		
		
	}
	
	public PersonajeDTO consultarPersonaje(String idpersonaje) {
		
		logger.debug("Inicio del metodo consultarPersonaje");
		
		logger.debug("fin del metodo consultarPersonaje");		
			
		
	}
	
	
	
	

}
