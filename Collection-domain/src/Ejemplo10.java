import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import modelo.Curso;

public class Ejemplo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Curso curso1 = new Curso("Historia", 30);
		 Curso curso2 = new Curso("Fisica", 20);
		 Curso curso3 = new Curso("Prgramacion", 40);
		 Curso curso4 = new Curso("Maths", 33);
		 Curso curso5 = new Curso("English", 33);
		 Curso curso6 = new Curso("Ciencias", 30);
		 Curso curso7 = new Curso("Motores", 20);
		 Curso curso8 = new Curso("Español", 40);
		 
		 ArrayList<Curso> cursos = new ArrayList<>();
		 
		 cursos.add(curso1);
		 cursos.add(curso2);
		 cursos.add(curso3);
		 cursos.add(curso4);
		 cursos.add(curso5);
		 cursos.add(curso6);
		 cursos.add(curso7);
		 cursos.add(curso8);
		 
		 
		 List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Maths")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
		 System.out.println(cursoList);
		 
		 System.out.println(cursos.parallelStream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Motores")).mapToInt(Curso::getTiempo).sum());
		
	}

}
