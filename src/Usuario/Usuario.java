package Usuario;

public abstract class Usuario {

//	ATRIBUTOS
	protected String idUsuario;
	protected String nombre;
	protected int edad;
	
//	CONSTRUCTORES
	public Usuario () {
		
	}
	public Usuario (String codUsuario, String nombre, int edad) {
		this.idUsuario = codUsuario;
		this.nombre = nombre;
		this.edad = edad;
	}
	
//	SETTERS GETTERS
	public String getCodUsuario() {
		return idUsuario;
	}
	public void setCodUsuario(String codUsuario) {
		this.idUsuario = codUsuario;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
//	METODOS
	public abstract void mostrarUsuario();
	
}
