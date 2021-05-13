import java.util.*;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	
	public Curso (String nome, String instrutor) {
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
	
	public int tempoTotal() {
		/*
		int tempo = 0;
		  for (Aula aula : aulas) {
			tempo += aula.getTempo();
		return tempo;
		}*/
		
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
		
	}
	
	@Override
	public String toString() {
		return "{" + "curso: " + nome + ","+ " instrutor: " + instrutor + "}";
	}
}
