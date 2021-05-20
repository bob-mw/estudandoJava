import java.util.Iterator;
import java.util.Set;


public class TestIterator {
	public static void main(String[] args) {
		Curso ecologia = new Curso("Ecologicamente", "Fernanda");
		Set<Aluno> alunos = ecologia.getAlunos();
		ecologia.adicionar(new Aula("Reciclagem", 30));
		
		System.out.println(ecologia.getAulas());
		
		
		
		ecologia.matricularAluno(new Aluno("Tereza", 12));
		ecologia.matricularAluno(new Aluno("Bartholomeo", 33));
		ecologia.matricularAluno(new Aluno("Maurilho", 15));
		ecologia.matricularAluno(new Aluno("Oakley", 121));
		
		
		System.out.println("FOREACH");
	    alunos.forEach(aluno -> {
	    	System.out.println("A pessoa estudante " + aluno + " está matriculada no curso " + ecologia.getNome());
	    });
	    
	    System.out.println("FOR: ainda não consegui");
	    for (int index = 0; index < alunos.size(); index++) {
	    	System.out.println("A pessoa estudante " + ecologia.getAlunos() + " está matriculada no curso " + ecologia.getNome());
	    }
	    
	    System.out.println("Iterator");
	    Iterator<Aluno> iterator = alunos.iterator();
	    
	    while (iterator.hasNext()) {
	    	System.out.println("A pessoa estudante " + iterator.next() + " está matriculada no curso " + ecologia.getNome());
	    }
	    
		
	}
}
