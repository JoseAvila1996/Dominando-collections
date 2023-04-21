import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import modelo.Alumno;

public class Ejemplo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Alumno alumno1 =new Alumno("Carlos andrade", "001");
		 Alumno alumno2 =new Alumno("Jose sanches", "002");
		 Alumno alumno3 =new Alumno("Luis mendez", "003");
		 Alumno alumno4 =new Alumno("Aldo villanueva", "004");
		 Alumno alumno5 =new Alumno("Guadalupe reyes", "005");
		 Alumno alumno6 =new Alumno("Juan picapiedra", "006");
		 Alumno alumno7 =new Alumno("mMayra galvan", "007");
		 
		 
		 Collection<Alumno>listaAlumnos = new HashSet<>();
		 listaAlumnos.add(alumno1);
		 listaAlumnos.add(alumno2);
		 listaAlumnos.add(alumno3);
		 listaAlumnos.add(alumno4);
		 listaAlumnos.add(alumno5);
		 listaAlumnos.add(alumno6);
		 listaAlumnos.add(alumno7);
		 
		 Alumno nuevoAlumno = new Alumno("Carlos andrade", "001");
		 
		 System.out.println(listaAlumnos.contains(listaAlumnos)); 
		 
	}

}
