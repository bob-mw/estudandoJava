import java.util.*;

public class TestaAula {
	public static void main(String[] args) {
		Aula aula1 = new Aula("matemática", 12);
		Aula aula2 = new Aula("Portugês", 50);
		Aula aula3 = new Aula("Inglês", 30);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}
}
