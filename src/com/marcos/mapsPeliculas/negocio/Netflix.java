package com.marcos.mapsPeliculas.negocio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

import com.marcos.mapsPeliculas.beans.Director;
import com.marcos.mapsPeliculas.beans.Pelicula;

public class Netflix {
	
	
	private LinkedHashMap<String,Pelicula> peliculasTitulo;
	private LinkedHashMap<Director,Pelicula> peliculasDirector;
	private LinkedHashMap<Integer,Pelicula> peliculasAnio;
	

	
	public Netflix() {
		
		peliculasTitulo = new LinkedHashMap<String,Pelicula>();
		peliculasDirector = new LinkedHashMap<Director,Pelicula>();
		peliculasAnio = new LinkedHashMap<Integer,Pelicula>();
	}
	
	
	
	
	/**
	 * A�ade a la base de datos peliculas para su b�squeda mas eficiente
	 * @param pelicula pelicula a�adir
	 */
	public void addPelicula(Pelicula pelicula) {
		
		peliculasTitulo.put(pelicula.getTitulo(), pelicula);
		peliculasDirector.put(pelicula.getDirector(), pelicula);
		peliculasAnio.put(pelicula.getAnio(), pelicula);
	}
	
	
	
	
	
	
	/**
	 * Busca y devuelve, si existe, una pelicula por su t�tulo
	 * @param titulo par�metro de b�squeda
	 * @return la Pelicula o null
	 */
	public Pelicula getPelicula(String titulo) {
		
		return peliculasTitulo.get(titulo);
	}
	

	
	/**
	 * Busca y devuelve, si existe, una pelicula por su a�o
	 * @param anio par�metro de b�squeda
	 * @return la Pelicula o null
	 */
	public Pelicula getPelicula(int anio) {
		
		return peliculasAnio.get(anio);
	}

	
	
	/**
	 * Busca y devuelve, si existe, una pelicula por su Director
	 * @param director par�metro de b�squeda
	 * @return la Pelicula o null
	 */
	public Pelicula getPelicula(Director director) {
		
		return peliculasDirector.get(director);
	}	
	
	
	
	
	
	
	public Iterator<Pelicula> getPeliculas() {
		
		return peliculasDirector.values().iterator();
	}
	
	
	
}
