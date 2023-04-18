package modelo;
import java.util.Comparator;

public class Clase {
	private String nombre;
	private int tiempo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public Clase(String nombre, int tiempo) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
	

}
