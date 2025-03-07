package Biblioteca;

public class Libro implements Prestado {

//	ATRIBUTOS
	private String idLibro;
	private String nombre;
	private boolean devuelto;
	
//	CONSTRUCTORES
	public Libro () {
		
	}
	public Libro (String idLibro, String nombre, boolean devuelto) {
		this.idLibro = idLibro;
		this.nombre = nombre;
		this.devuelto = devuelto;
	}
	
//	GETTERS SETTERS
	public String getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(String idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isDevuelto() {
		return devuelto;
	}
	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
	
//	METODOS
	@Override
	public boolean prestarLibro() {

		if (!devuelto) {
			
			devuelto = true;
			return devuelto;
		
		}
		
		return false;
	}

	@Override
	public boolean devolverLibro() {

		if (devuelto) {
			
			devuelto = false;
			return devuelto;
		
		}
		
		return false;
	}
	
}
