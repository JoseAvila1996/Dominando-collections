import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String variable1 = "Carlos andrade";
		 String variable2 = "Jose sanches";
		 String variable3 = "Luis mendez";
		 String variable4 = "Aldo villanueva";
		 String variable5 = "Guadalupe reyes";
		 String variable6 = "Juan picapiedra";
		 String variable7 = "Guadalupe reyes";
		 String variable8 = "Juan picapiedra";
		 
		 Collection<String>listaAlumnos = new HashSet<>();
		 listaAlumnos.add(variable1);
		 listaAlumnos.add(variable2);
		 listaAlumnos.add(variable3);
		 listaAlumnos.add(variable4);
		 listaAlumnos.add(variable5);
		 listaAlumnos.add(variable6);
		 listaAlumnos.add(variable7);
		 listaAlumnos.add(variable8);
		 
		 for(String alumno: listaAlumnos) {
			 System.out.println(alumno);
		 }
		 
	}

}
