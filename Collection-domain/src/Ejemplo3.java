import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String curso1 = "geometria";
		 String curso2 = "fisica";
		 String curso3 = "quimica";
		 String curso4 = "historia";
		 
		 ArrayList<String> cursos = new ArrayList<>();
		 
		 cursos.add(curso1);
		 cursos.add(curso2);
		 cursos.add(curso3);
		 cursos.add(curso4);
		 
		 //System.out.println(cursos);
		 
		 //Collections.sort(cursos);
		 
		 //System.out.println(cursos);
		 
		 //Collections.sort(cursos, Collections.reverseOrder());
		 //System.out.println(cursos);
		 
		 List<String> cursosList = cursos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 System.out.println(cursosList);
	}

}
