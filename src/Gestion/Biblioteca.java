package Gestion;

import java.util.ArrayList;

import Biblioteca.Libro;
import Biblioteca.Prestamo;
import Usuario.Invitado;
import Usuario.Usuario;

public class Biblioteca {

//	ATRIBUTOS
	private String idBiblioteca;
	private String nombre;
	private static ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	
//	CONSTRUCTORES
	public Biblioteca () {
		
	}
	public Biblioteca (String idBiblioteca, String nombre, ArrayList<Prestamo> prestamos) {
		this.idBiblioteca = idBiblioteca;
		this.nombre = nombre;
		Biblioteca.prestamos = prestamos;
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
		Biblioteca.prestamos = prestamos;
	}
	
//	METODOS
	public void mostrarBiblioteca () {
		
		System.out.println("ID -> " + idBiblioteca);
		System.out.println("Nombre -> " + nombre);
		System.out.println("Prestamos -> " + prestamos + "\n"); 
		
	}
	
	public static Biblioteca crearBiblioteca () {

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Libro> libros = new ArrayList<Libro>();
		
		for (int i = 0; i < 6; i++) {
			
			for (int k = 0; k < 6; k++) {
				
				if (k == 0) {
					usuarios.add(new Invitado(String.valueOf(k), "Juan", 45, 2));
				}
				if (k == 1) {
					usuarios.add(new Invitado(String.valueOf(k), "Miguel", 23, 2));				
				}
				if (k == 2) {
					usuarios.add(new Invitado(String.valueOf(k), "Santiago", 19, 2));
				}
				if (k == 3) {
					usuarios.add(new Invitado(String.valueOf(k), "Adolfo", 77, 2));
				}
				if (k == 4) {
					usuarios.add(new Invitado(String.valueOf(k), "Paco", 52, 2));
				}
				if (k == 5) {
					usuarios.add(new Invitado(String.valueOf(k), "Francisco", 100, 2));
				}
				
			}

			if (i == 0) {
				libros.add(new Libro (String.valueOf(i), "Libros de Enoc", true));
			}
			if (i == 1) {
				libros.add(new Libro (String.valueOf(i), "Manolito Gafotas", true));
			}
			if (i == 2) {
				libros.add(new Libro (String.valueOf(i), "Miguel y sus aventuras", true));
			}
			if (i == 3) {
				libros.add(new Libro (String.valueOf(i), "Juanjo el valiente", true));
			}
			if (i == 4) {
				libros.add(new Libro (String.valueOf(i), "Don Quijote", true));
			}
			if (i == 5) {
				libros.add(new Libro (String.valueOf(i), "Los besos de Bulma", true));
			}

		}
		
		Biblioteca bibliotecaJowy = new Biblioteca ("1", "Jowy", prestamos);

		return bibliotecaJowy;
	}
	
}
