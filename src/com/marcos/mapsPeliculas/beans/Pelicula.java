package com.marcos.mapsPeliculas.beans;

public class Pelicula {

	
	private String titulo;
	private int anio;
	private Director director;
	private double presupuesto;
	
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", anio=" + anio + ", director=" + director + ", presupuesto="
				+ presupuesto + "]";
	}
	


}
