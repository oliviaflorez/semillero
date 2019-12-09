package com.hbt.semillero.ejb;

import com.hbt.semillero.dto.PersonajeDTO;

public interface IGestionarRolPersonajeComicLocal {
	/**
	 * Metodo encargado de crear el rol de un personaje 
	 * @author oliviaflorez
	 * 
	 */
	public void  crearRolPersonaje(PersonajeDTO personajeDTO);
	
	/**
	 * Metodo encargado de consultar un rol del personaje modificarlo y guardarlo
	 * @author oliviaflorez
	 * 
	 */		
	public void modificarRolPersonaje();

	/**
	 * Metodo encargado de eliminar el rol de un personaje
	 * @author oliviaflorez
	 * 
	 */
	public void eliminarRolPersonaje();

	/**
	 * Metodo encargado de retornar la informacion de un personaje
	 * @param idpersonaje identificador del comic a ser consultado
	 * @return personaje Resultado de la consulta
	 * @throws Exception si no se recibe idpersonaje
	 */
	
	public void consultarRolPersonajes();
	/**
	 * Metodo encargado de consultar los roles existentes 
	 * @author oliviaflorez
	 * 
	 */
}
