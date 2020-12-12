package pckPersona;

public class Persona {
	
	private String nombre;
	private int edad;
	private String cedula;
	private int estaturacm;
	public String getNombre() {
		return nombre;
	}
	
	//Constructor sin parámetros
	public Persona() {
		
	}
	
	//Constructor con parámetros
	public Persona(String nombre, int edad, String cedula, int estaturacm) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
		this.estaturacm = estaturacm;
	}

	//Getters and setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getEstaturacm() {
		return estaturacm;
	}
	public void setEstaturacm(int estaturacm) {
		this.estaturacm = estaturacm;
	}

	@Override
	public String toString() {
		return "Los datos de la persona son: " + nombre + "\t , edad=" + edad + "\t , cedula=" + cedula + "\t, estaturacm=" + estaturacm;
	}
	
	
	
}
