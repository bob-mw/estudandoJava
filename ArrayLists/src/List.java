import java.util.*;

public class List {
	public static void main(String[] args) {
		Aula aula1 = new Aula("matem�tica", 30);
		Aula aula2 = new Aula("Portug�s", 30);
		Aula aula3 = new Aula("Ingl�s", 30);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
	}
}
