package com.hbt.semillero.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.hbt.semillero.dto.PersonajeDTO;
import com.hbt.semillero.ejb.IGestionarPersonajeLocal;


@Path("/GestionarPersonaje")
public class GestionarPersonajeRest {
	
	@EJB
	private IGestionarPersonajeLocal GestionarPersonajeBean;
	
	
	/**
	 * Metodo encargado de crear un personaje y persistirlo
	 * @author oliviaflorez
	 * 
	 */
	@POST
	@Path("/crear")
	public void crearPersonaje(PersonajeDTO personajeDTO) {
		
		GestionarPersonajeBean.crearPersonaje(personajeDTO);
	}
	
	/**
	 * 
	 * Metodo encargado de consultar una lista de personajes
	 * 
	 */
	
	@GET
	@Path("/consultarPersonajes")
	public List<PersonajeDTO> consultarPersonajes(){
		return GestionarPersonajeBean.consultarPersonajes();
	}
	
		
	@GET
	@Path("/consultarPersonajes")
	
	public List<PersonajeDTO> consultarPersonajes(@QueryParam("idComic") Long idComic){
		
		return GestionarPersonajeBean.consultarPersonajes(idComic);
		
	}
}
