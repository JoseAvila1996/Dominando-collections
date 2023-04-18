package modelo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Curso {
	private String nombre;
	private int tiempo;
	private List<Aula>AluraList = new ArrayList<>();
	
	public Curso(String nombre, int tiempo) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	public Curso(String nombre, int tiempo, List<Aula>claselist) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.AluraList = claselist;
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
	
	public void addAula(Aula aula) {		//manera para encapsular algo que no quieres que sea accedido por otro medio, en este caso "aulalist.add"
		this.AluraList.add(aula);
	}
	
	public List<Aula> getAulaList() {
		return Collections.unmodifiableList(AluraList);
	}
	public void setAulaList(List<Aula> claseList) {
		this.AluraList = claseList;
	}
	@Override
	public String toString() {
		return this.nombre;
	}
	
	

}
