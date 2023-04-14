import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Curso curso1 =new Curso( "Geometria", 30);
		 Curso curso2 =new Curso( "Fisica", 30);
		 Curso curso3 =new Curso( "Quimica", 30);
		 Curso curso4 = new Curso( "History", 30);
		 ArrayList<Curso> cursos = new ArrayList<>();
		 
		 cursos.add(curso1);
		 cursos.add(curso2);
		 cursos.add(curso3);
		 cursos.add(curso4);
		 
		 System.out.println(cursos);
		 
	
		 
		
	}

}
