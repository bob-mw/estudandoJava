
public class Aula implements Comparable<Aula> {
	private String aulas;
	private int tempo;
	public Aula(String aulas, int tempo) {
		super();
		this.aulas = aulas;
		this.tempo = tempo;
	}
	public String getAulas() {
		return aulas;
	}
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		return "Aula: " + this.aulas + " " +"Tempo: " + this.tempo;
	}
	
	@Override
	public int compareTo(Aula outraAula) {
		return this.aulas.compareTo(outraAula.getAulas());
	}
}
