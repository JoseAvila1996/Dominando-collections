import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import modelo.Curso;

public class Ejemplo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Curso curso1 = new Curso("java", 30);
		 Curso curso2 = new Curso("python", 20);
		 Curso curso3 = new Curso("ruby", 40);
		 Curso curso4 = new Curso("html", 33);
		 
		 ArrayList<Curso> cursos = new ArrayList<>();
		 
		 cursos.add(curso1);
		 cursos.add(curso2);
		 cursos.add(curso3);
		 cursos.add(curso4);
		 
		 System.out.println(cursos);
		 
		 Collections.sort(cursos,Comparator.comparing(Curso::getNombre));          // para imprimir ordendo  
		 System.out.println(cursos);
		 Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed()); //para imprirmir ordenando de reversa
		 System.out.println(cursos);
		 
		 List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("ruby")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
		 System.out.println(cursoList);
		
	}

}
