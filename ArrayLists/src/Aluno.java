
public class Aluno {
	private String name;
	private int estudant_id;
	
	public Aluno (String name, int estudant_id) {
		this.name = name;
		this.estudant_id = estudant_id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getEstudant_id() {
		return estudant_id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno other = (Aluno) obj;
		return this.name.equals(other.getName());
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	@Override
	public String toString() {
		return name;
	}
}
