import java.util.ArrayList;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String variable1 = "clase1";
		 String variable2 = "clase2";
		 String variable3 = "clase3";
		 String variable4 = "clase4";
		 
		 ArrayList<String> lista = new ArrayList<>();
		 
		 lista.add(variable1);
		 lista.add(variable2);
		 lista.add(variable3);
		 lista.add(variable4);
		 
		 System.out.println(lista);
		 
		 for(int i =0; i <lista.size(); i++) {               //clasic
			 System.out.println(lista.get(i));
		 }
		 
		 for(String variableEach: lista) {                  //for each
			 System.out.println(variableEach);
		 }
		 
		 lista.forEach(claseRef ->{                         //lambdas
			 System.out.println(claseRef);
		 });
	}

}
