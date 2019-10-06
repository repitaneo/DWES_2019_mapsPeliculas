package com.marcos.mapsPeliculas.inicio;

import java.util.Iterator;

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
		
		
		Pelicula elPadrino = new Pelicula();
		elPadrino.setDirector(copola);
		elPadrino.setAnio(1972);
		elPadrino.setTitulo("El padrino");
		elPadrino.setPresupuesto(45067.34);
		
		
		Pelicula et = new Pelicula();
		et.setDirector(spilberg);
		et.setAnio(1982);
		et.setTitulo("E.T.");
		et.setPresupuesto(4567.34);

		
		Pelicula tiburon = new Pelicula();
		tiburon.setDirector(spilberg);
		tiburon.setAnio(1975);
		tiburon.setTitulo("Tiburón");
		tiburon.setPresupuesto(46567.34);
		
		
		Netflix baseDatosPeliculas = new Netflix();
		baseDatosPeliculas.addPelicula(et);
		baseDatosPeliculas.addPelicula(tiburon);
		baseDatosPeliculas.addPelicula(elPadrino);
		
		PeliculasConsola.imprimir(baseDatosPeliculas.getPeliculas());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
