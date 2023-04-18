package modelo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Curso {
	private String nombre;
	private int tiempo;
	private List<Aula>claseList = new ArrayList<>();
	
	public Curso(String nombre, int tiempo) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	public Curso(String nombre, int tiempo, List<Aula>claselist) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.claseList = claselist;
	}
	
	
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
	
	public void addClase(Aula clase) {
		this.claseList.add(clase);
	}
	
	public List<Aula> getClaseList() {
		return claseList;
	}
	public void setClaseList(List<Aula> claseList) {
		this.claseList = claseList;
	}
	@Override
	public String toString() {
		return this.nombre;
	}
	
	

}
