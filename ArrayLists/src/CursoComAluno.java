
public class CursoComAluno {
	public static void main(String[] args) {
		Curso dog_treiner = new Curso("Treinamento Canino", "João");
		
		dog_treiner.matricularAluno(new Aluno("Pedro Emilio", 21));
		dog_treiner.matricularAluno(new Aluno("Macaê Fernandez", 28));
		
		System.out.println(dog_treiner.getAlunos());
	}
}
