package Gestion;

import java.util.ArrayList;

import Biblioteca.Prestamo;

public class Biblioteca {

//	ATRIBUTOS
	private String idBiblioteca;
	private String nombre;
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	
//	CONSTRUCTORES
	public Biblioteca () {
		
	}
	public Biblioteca (String idBiblioteca, String nombre, ArrayList<Prestamo> prestamos) {
		this.idBiblioteca = idBiblioteca;
		this.nombre = nombre;
		this.prestamos = prestamos;
	}
	
//	GETTERS SETTERS
	public String getIdBiblioteca() {
		return idBiblioteca;
	}
	public void setIdBiblioteca(String idBiblioteca) {
		this.idBiblioteca = idBiblioteca;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	
//	METODOS
	
}
