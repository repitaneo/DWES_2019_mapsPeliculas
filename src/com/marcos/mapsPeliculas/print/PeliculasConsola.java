package com.marcos.mapsPeliculas.print;

import java.util.Iterator;
import com.marcos.mapsPeliculas.beans.Pelicula;




public class PeliculasConsola {

	
	
	/**
	 * Operación para im primir a través de consola
	 * 
	 * Recoge un iterador de peliculas es imprime lo que haya en dicho iterador
	 * 
	 * @param datos Iterator 
	 */
	public static void imprimir(Iterator<Pelicula> datos) {
		
		System.out.println("***************************");
		System.out.println("Peliculas disponibles");
		while(datos.hasNext()) {
			
			Pelicula pelicula = datos.next();
			System.out.println(pelicula);
		}
	}
	
	
	
	
	
	
	
	
}
