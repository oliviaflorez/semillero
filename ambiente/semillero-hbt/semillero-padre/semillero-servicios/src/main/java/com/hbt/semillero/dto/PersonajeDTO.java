package com.hbt.semillero.dto;

import java.io.Serializable;

import com.hbt.semillero.entidad.EstadoEnum;

public class PersonajeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String nombre;
	private long IdComic;
	private EstadoEnum estado;
	private String superPoder;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getIdComic() {
		return IdComic;
	}
	public void setIdComic(long idComic) {
		IdComic = idComic;
	}
	public EstadoEnum getEstado() {
		return estado;
	}
	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
	}
	public String getSuperPoder() {
		return superPoder;
	}
	public void setSuperPoder(String superPoder) {
		this.superPoder = superPoder;
	}
	
	/**
	 * Método encargado de convertir los datos recibidos en JSON al tipo PersonajeDTO.
	 * <b>Caso de Uso:</b>
	 * 
	 * @param arg Cadena que representa el objeto complejo JSON.
	 * @return Instancia con los datos recibidos.
	 */
	public static PersonajeDTO valueOf(String arg) {
		return JsonUtils.valueOf(arg, PersonajeDTO.class);
	}

	/**
	 * Método encargado de convertir los datos recibidos en PersonajeDTO al JSON
	 * esperado
	 * 
	 * @param dto DTO
	 * 
	 * @return Json
	 */
	@Override
	public String toString() {
		return JsonUtils.toStringJson(this);
	}

}
