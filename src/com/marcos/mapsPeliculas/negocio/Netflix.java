package com.marcos.mapsPeliculas.negocio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import com.marcos.mapsPeliculas.beans.Director;
import com.marcos.mapsPeliculas.beans.Pelicula;
import com.marcos.mapsPeliculas.print.PeliculasConsola;

public class Netflix {
	
	
	private LinkedHashMap<String,Pelicula> peliculasTitulo;
	private LinkedHashMap<Director,ArrayList<Pelicula>> peliculasDirector;
	private LinkedHashMap<Integer,Pelicula> peliculasAnio;
	

	
	public Netflix() {
		
		peliculasTitulo = new LinkedHashMap<String,Pelicula>();
		peliculasDirector = new LinkedHashMap<Director,ArrayList<Pelicula>>();
		peliculasAnio = new LinkedHashMap<Integer,Pelicula>();
	}
	
	
	
	
	/**
	 * Añade a la base de datos peliculas para su búsqueda mas eficiente
	 * @param pelicula pelicula añadir
	 */
	public void addPelicula(Pelicula pelicula) {
		
		peliculasTitulo.put(pelicula.getTitulo(), pelicula);
		peliculasAnio.put(pelicula.getAnio(), pelicula);
		
		
		// si existe la key, obtiene la lista que guarda el hashmap y añade la pelicula
		if(peliculasDirector.containsKey(pelicula.getDirector())) {
			
			// extraer la lista de peliculas
			ArrayList<Pelicula> lista = peliculasDirector.get(pelicula.getDirector());
			
			// añadir la nueva pelicula
			lista.add(pelicula);
		}
		else {
			// si no existe la key crea la lista, añade la pelicula y coloca la lista en el hashmap
			
			// crear una nueva lista de peliculas
			ArrayList<Pelicula> lista = new ArrayList<Pelicula>();
			lista.add(pelicula);
			
			// colocarla en el hashMap 
			peliculasDirector.put(pelicula.getDirector(), lista);
		}
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
	 * Busca y devuelve, si existen, todas las peliculas que hay en el Hash de Director
	 * @param director parámetro de búsqueda
	 * @return la Pelicula o null
	 */
	public Iterator<Pelicula> getPeliculas() {

		
		ArrayList<Pelicula> peliculasTotales = new ArrayList<Pelicula>();
		
		for(Director key : peliculasDirector.keySet()) {
			
			ArrayList<Pelicula> listaPorDirector = peliculasDirector.get(key);
			
			// recorro cada lista que tiene cada director y la añado a la que
			// voy a devolver de peliculas totales
			
			for(Pelicula pelicula:  listaPorDirector) {
				
				peliculasTotales.add(pelicula);
			}
		}
		return peliculasTotales.iterator();
		
	}	
	

	
	
}
