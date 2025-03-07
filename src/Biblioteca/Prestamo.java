package Biblioteca;

import Usuario.Usuario;

public class Prestamo {

//	ATRIBUTOS
	private Usuario usuario;
	private Libro libro;
	private String fechaInicio;
	private String fechaFin;
	
//	CONSTRUCTORES
	public Prestamo () {
		
	}
	public Prestamo (Usuario usuario, Libro libro, String fechaInicio, String fechaFin) {
		this.usuario = usuario;
		this.libro = libro;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	
//	GETTERS SETTERS
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

//	METODOS
	
}
