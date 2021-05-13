import java.util.*;

public class TestaCurso2 {
	public static void main(String[] args) {
		Curso curso = new Curso("Comunicação", "Karla");
		List<Aula> aulas = curso.getAulas();
		
		
		curso.adicionar(new Aula("Escuta ativa", 40));		
		curso.adicionar(new Aula("Paciência", 120));
		curso.adicionar(new Aula("Transmitir", 30));
		
		int tempoTotal = curso.tempoTotal();
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(curso);
		System.out.println(aulas);
		System.out.println(tempoTotal);
	}
}
