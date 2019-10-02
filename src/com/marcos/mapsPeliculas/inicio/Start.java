package com.marcos.mapsPeliculas.inicio;

import com.marcos.mapsPeliculas.beans.Director;
import com.marcos.mapsPeliculas.beans.Pelicula;
import com.marcos.mapsPeliculas.negocio.Netflix;
import com.marcos.mapsPeliculas.print.PeliculasConsola;

public class Start {

	public static void main(String[] args) {

		Director spilberg = new Director();
		spilberg.setNombre("Steven Spilberg");
		
		Director copola = new Director();
		copola.setNombre("Francis Ford Copola");
		
		
		Pelicula et = new Pelicula();
		et.setDirector(spilberg);
		et.setAnio(1982);
		et.setTitulo("E.T.");
		et.setPresupuesto(4567.34);

		
		Pelicula tiburon = new Pelicula();
		tiburon.setDirector(spilberg);
		tiburon.setAnio(1975);
		tiburon.setTitulo("Tibur�n");
		tiburon.setPresupuesto(46567.34);
		
		
		Netflix baseDatosPeliculas = new Netflix();
		baseDatosPeliculas.addPelicula(et);
		baseDatosPeliculas.addPelicula(tiburon);
		
		
		
		PeliculasConsola.imprimir(baseDatosPeliculas.getPeliculas());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
