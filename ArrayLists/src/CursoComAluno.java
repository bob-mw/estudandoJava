
public class CursoComAluno {
	public static void main(String[] args) {
		
		Curso filosofia = new Curso("Filosofia", "Raquel");

		Aluno aluno1 = new Aluno("Pedro Emilio", 344);
		
		Aluno aluno2 = new Aluno("Vitória Gabriely", 21);
		
		filosofia.matricularAluno(aluno1);
		filosofia.matricularAluno(aluno2);
				
		filosofia.verificaMatricula(344);
		
		filosofia.buscaMatricula(21);
			
	}
}
