package Usuario;

public class Invitado extends Usuario {

//	ATRIBUTOS
	private int limiteLibros;
	
//	CONSTRUCTORES
	public Invitado () {
		
	}
	public Invitado (String codUsuario, String nombre, int edad, int limiteLibros) {
		super(codUsuario, nombre, edad);
		this.limiteLibros = limiteLibros;
	}
	
//	GETTERS SETTERS
	public int getLimiteLibros() {
		return limiteLibros;
	}
	public void setLimiteLibros(int limiteLibros) {
		this.limiteLibros = limiteLibros;
	}
	
//	METODOS
	@Override
	public void mostrarUsuario () {
		
		System.out.println("\nID -> " + idUsuario);
		System.out.println("Nombre -> " + nombre);
		System.out.println("Edad -> " + edad + "\n");
		
	}
	
}
