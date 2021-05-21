import java.util.*;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void adicionar(Aula aula) {
		this.aulas.add(aula);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public void matricularAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public int tempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	public Aluno verificaMatricula(int matricula) {
		for (Aluno aluno : alunos) {
			if (aluno.getEstudant_id() == matricula) {
				System.out.println("A matricula:  " + matricula + " pertence a pessoa estudante " + aluno.getName());
				return aluno;
			}
		}
		throw new NoSuchElementException("Matricula " + matricula + " não encontrada");
	}
	

	@Override
	public String toString() {
		return "{" + "curso: " + nome + "," + " instrutor: " + instrutor + "}";
	}
}
