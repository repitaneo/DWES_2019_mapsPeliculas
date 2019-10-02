package com.marcos.mapsPeliculas.negocio;

import java.util.HashMap;

import com.marcos.mapsPeliculas.beans.Director;
import com.marcos.mapsPeliculas.beans.Pelicula;

public class Netflix {
	
	
	private HashMap<String,Pelicula> peliculasTitulo;
	private HashMap<Director,Pelicula> peliculasDirector;
	private HashMap<Integer,Pelicula> peliculasAnio;
	

	
	public Netflix() {
		
		peliculasTitulo = new HashMap<String,Pelicula>();
		peliculasDirector = new HashMap<Director,Pelicula>();
		peliculasAnio = new HashMap<Integer,Pelicula>();
	}
	
	
	
	
	/**
	 * Añade a la base de datos peliculas para su búsqueda mas eficiente
	 * @param pelicula pelicula añadir
	 */
	public void addPelicula(Pelicula pelicula) {
		
		peliculasTitulo.put(pelicula.getTitulo(), pelicula);
		peliculasDirector.put(pelicula.getDirector(), pelicula);
		peliculasAnio.put(pelicula.getAnio(), pelicula);
	}
	
	
	
	
	
	
	/**
	 * Busca y devuelve, si existe, una pelicula por su título
	 * @param titulo parámetro de búsqueda
	 * @return la Pelicula o null
	 */
	public Pelicula getPelicula(String titulo) {
		
		return peliculasTitulo.get(titulo);
	}
	

	
	/**
	 * Busca y devuelve, si existe, una pelicula por su año
	 * @param anio parámetro de búsqueda
	 * @return la Pelicula o null
	 */
	public Pelicula getPelicula(int anio) {
		
		return peliculasAnio.get(anio);
	}

	
	
	/**
	 * Busca y devuelve, si existe, una pelicula por su Director
	 * @param director parámetro de búsqueda
	 * @return la Pelicula o null
	 */
	public Pelicula getPelicula(Director director) {
		
		return peliculasDirector.get(director);
	}	
}
