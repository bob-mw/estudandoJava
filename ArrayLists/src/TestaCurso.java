import java.util.*;

public class TestaCurso {
	public static void main(String[] args) {
		Curso ingles = new Curso("Ingles para todos", "Cherosa");
		List<Aula> aulas = ingles.getAulas();
		
		ingles.adicionar(new Aula("verbs", 34));
		ingles.adicionar(new Aula("verbs", 34));
		
		System.out.println(ingles);
		System.out.println(aulas);
	}
}
