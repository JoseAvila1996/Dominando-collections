import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import modelo.Aula;
import modelo.Curso;

public class Ejemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Curso curso1 = new Curso("java", 30);
		 curso1.addClase(new Aula("Arraylis"));
		 curso1.addClase(new Aula("linkedList"));
		 curso1.addClase(new Aula("List"));
		 
		 
		 ArrayList<Curso>cursos = new ArrayList<>();
		 
		cursos.add(curso1);
		
		System.out.println(cursos.get(0).getClaseList());
		System.out.println(curso1);
	}

}
