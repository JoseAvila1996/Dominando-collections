package modelo;
import java.util.Comparator;

public class Alumno {
	private String nombre;
	private String code;
	
	public Alumno(String nombre, String code) {  //Constructor
		this.nombre = nombre;
		this.code = code;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	

}
