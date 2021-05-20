import java.util.*;

public class TestaAula {
	public static void main(String[] args) {
		Aula aula1 = new Aula("matem�tica", 12);
		Aula aula2 = new Aula("Portug�s", 50);
		Aula aula3 = new Aula("Ingl�s", 30);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}
}
