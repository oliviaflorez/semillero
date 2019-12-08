/**
 * GestionarPersonajeBean.java
 * @Author oliviaflorez
 */

package com.hbt.semillero.ejb;


import java.util.List;
import javax.ejb.Local;

//import com.hbt.semillero.dto.ComicDTO;

@Local
	public interface IGestionarPersonajeLocal {

		/**
		 * Metodo encargado de crear un personaje y persistirlo
		 * @author oliviaflorez
		 * 
		 */
		public void crearPersonaje();
		
		/**
		 * Metodo encargado de consultar un personaje modificarlo y guardarlo
		 * @author oliviaflorez
		 * 
		 */		
		public void modificarPersonaje();

		/**
		 * Metodo encargado de eliminar un personaje modificarlo y guardarlo
		 * @author oliviaflorez
		 * 
		 */
		public void eliminarPersonaje();

		/**
		 * Metodo encargado de retornar la informacion de un personaje
		 * @param idpersonaje identificador del comic a ser consultado
		 * @return personaje Resultado de la consulta
		 * @throws Exception si no se recibe idpersonaje
		 */
		public PersonajeDTO consultarPersonaje(String idpersonaje);

		/**
		 * 
		 * Metodo encargado de retornar una lista de personajes
		 * @return
		 */
		public List<PersonajeDTO> consultarPersonajes();
	}