package com.hbt.semillero.ejb;
import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.Personaje;

import antlr.collections.List;
/**
 * <b>Descripción:<b> Clase que determina el bean para la gestion de personajes
 * @author olivia florez
 * @version
 */
@Stateless

public class GestionarPersonajeBean {
	
	final static Logger logger = Logger.getLogger(GestionarPersonajeBean.class);

	@PersistenceContext
	private EntityManager entitymanager;
	
	public void crearPersonaje(PersonajeDTO personajeDTO ) {
		logger.debug("Inicio del metodo crearPersonaje");
		
		Personaje personaje= convertirDtoEntidad(personajeDTO);
		entitymanager.persist(personaje);
		
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
	
	/*public  java.util.List<PersonajeDTO> consultarPersonaje() {
		
		logger.debug("Inicio del metodo consultarPersonaje");
		
		logger.debug("fin del metodo consultarPersonaje");		
		}*/	
		
	
	public List<PersonajeDTO> consultarPersonajes() {
		
		logger.debug("Inicio del metodo consultarPersonajes");
		
		String query = "Select Personaje"
				+ " from Personaje personaje";
		
		List<Personaje> Listapersonajes= entitymanager.createQuery(query).getResultList();
		
		List<PersonajeDTO> ListapersonajeDTO = new ArrayList<>(); 
		
		for(Personaje personaje : Listapersonajes) {
			
			ListapersonajeDTO.add(convertirEntidadDto(personaje));	
		}		
		
		logger.debug("fin del metodo consultarPersonajes");		
			
		return ListapersonajeDTO;
	}
	
	public List<PersonajeDTO> consultarPersonajes(long idComic){
		
		logger.debug("Inicio del metodo consultarPersonajes");
		
		String query = "Select Personaje"
				+ " from Personaje personaje"
				+"where personaje.Comic.Id =:IdComic";
		
		List<Personaje> Listapersonaje= entitymanager.createQuery(query).setParameter("IdComic", IdComic).getResultList();
		
		List<PersonajeDTO> ListapersonajeDTO = new ArrayList<>();
		
		for(Personaje personaje : ListapersonajeDTO) {
			
			ListapersonajeDTO.add(convertirEntidadDto(personaje));
		}		
		
		logger.debug("fin del metodo consultarPersonajes");		
			
		return ListapersonajeDTO;
	}
	
	
	private Personaje convertirDtoEntidad(PersonajeDTO personajeDTO) {
		
		Personaje personaje= new Personaje();
		personaje.setId(personajeDTO.getId());
		personaje.setNombre(personajeDTO.getNombre());
		personaje.setComic(new Comic());
		personaje.getComic().setId(personajeDTO.getIdComic());
		personaje.setEstado(personajeDTO.getEstado());
		personaje.setSuperPoder(personajeDTO.getSuperPoder());
		return personaje;
		
	}
	
	private PersonajeDTO convertirEntidadDto(Personaje personaje) {
		
		PersonajeDTO personajeDTO= new PersonajeDTO();
		personajeDTO.setId(personajeDTO.getId());
		personajeDTO.setNombre(personajeDTO.getNombre());
		personajeDTO.setIdComic(personaje.getComic().getId());
		personajeDTO.setEstado(personajeDTO.getEstado());
		personajeDTO.setSuperPoder(personajeDTO.getSuperPoder());
		return personajeDTO;
		
	}
	

}
