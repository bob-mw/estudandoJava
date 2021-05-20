import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Joao Patrik");
		alunos.add("Maria Oliva");
		alunos.add("Fer Lamisk");
		alunos.add("Crot Wolovin");
		alunos.add("Fer Lamisk");
		
		System.out.println(alunos);
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos.size());
		
		boolean registred = alunos.contains("Joao Patrik");
		
		if (registred) alunos.remove("Joao Patrik");
		
		System.out.println(registred);
		
		System.out.println(alunos);
		
		
	}
}
