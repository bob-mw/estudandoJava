package coursmanager;

import java.util.ArrayList;

public class TestandoListas {
	public static void main(String[] args) {
		String cours0 = "Primitive Types on Java";
		String cours1 = "Print | code Hello World in Java";
		String cours2 = "Conditional";
		
		ArrayList<String> coursList  = new ArrayList();
		
		coursList.add(cours0);
		coursList.add(cours1);
		coursList.add(cours2);
		
		System.out.println(coursList);
	}
}
