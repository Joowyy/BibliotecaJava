package GestionArray;

import java.util.ArrayList;

import Biblioteca.Libro;

public class GestionLibro {
    
	private static ArrayList<Libro> libros = new ArrayList<Libro>();

	public static ArrayList<Libro> getLibros() {
		return libros;
	}

	public static void setLibros(ArrayList<Libro> libros) {
		GestionLibro.libros = libros;
	}
	
}
