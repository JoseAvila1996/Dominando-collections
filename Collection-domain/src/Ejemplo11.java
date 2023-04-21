import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String variable1 = "Carlos andrade";
		 String variable2 = "Jose sanches";
		 String variable3 = "Luis mendez";
		 String variable4 = "Aldo villanueva";
		 String variable5 = "Guadalupe reyes";
		 String variable6 = "Juan picapiedra";
		 
		 Set<String>listaAlumnos = new HashSet<>();
		 listaAlumnos.add(variable1);
		 listaAlumnos.add(variable2);
		 listaAlumnos.add(variable3);
		 listaAlumnos.add(variable4);
		 listaAlumnos.add(variable5);
		 listaAlumnos.add(variable6);
		 
		 for(String alumno: listaAlumnos) {
			 System.out.println(alumno);
		 }
		 
	}

}
