package paquete2;

public class persona {
	private int edad;
	private String nombre;
	private String genero;
	
	public persona(int edad, String nombre, String genero) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.genero = genero;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
