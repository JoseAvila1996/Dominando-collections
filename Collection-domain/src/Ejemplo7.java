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
		 Curso curso1 = new Curso("java", 30);		//crea un objeto curso1 de la clase Curso 
		 curso1.addAula(new Aula("Arraylist"));		//usa el metodo addAula para ingesar un objeto Aula y colocarle "arraylist"
		 curso1.addAula(new Aula("linkedList"));
		 curso1.addAula(new Aula("List"));
		 curso1.addAula(new Aula("Inmutable"));
		 
		 List<Aula>aulalist = curso1.getAulaList(); //crea una lista de tipo Aula y esta es igual al contenido de curso1
		 
		 //aulalist.add(new Aula("inmutable"));		//agrega "inmutable" por medio de add a la lista creada anteriormente
		 
		 
		 
		 ArrayList<Curso>cursos = new ArrayList<>();       //crea un array de Cursos 
		 cursos.add(curso1);								//agrega lo de cursos1 en cursos	
		
		System.out.println(cursos.get(0).getAulaList());	//imprime lo que hay en cursos por medio de get0 . getaulalist
		System.out.println(aulalist);							//imprime lo que hay en cursos1
	}

}
