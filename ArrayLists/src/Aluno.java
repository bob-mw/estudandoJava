
public class Aluno {
	private String name;
	private String last_name;
	
	public Aluno (String name, String last_name) {
		this.name = name;
		this.last_name = last_name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	@Override
	public String toString() {
		return name + " " + last_name;
	}
}
