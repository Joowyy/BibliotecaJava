package Usuario;

public class Socio extends Usuario {

//	ATRIBUTOS
	private double saldoSocio;

//	CONSTRUCTORES
	public Socio () {
		
	}
	public Socio (String codUsuario, String nombre, int edad, double saldoSocio) {
		super(codUsuario, nombre, edad);
		this.saldoSocio = saldoSocio;
	}
	
//	GETTERS SETTERS
	public double getSaldoSocio() {
		return saldoSocio;
	}
	public void setSaldoSocio(double saldoSocio) {
		this.saldoSocio = saldoSocio;
	}
	
//	METODOS
	@Override
	public void mostrarUsuario () {
		
		System.out.println("\nID -> " + idUsuario);
		System.out.println("Nombre -> " + nombre);
		System.out.println("Edad -> " + edad);
		System.out.println("Saldo -> " + saldoSocio + "\n");
		
	}
}
