package View;

import java.util.*;

public class CrudList {
	private String name;
	private String age;
	ArrayList<String> list = new ArrayList<>();
	
	public ArrayList<String> setList(String name, String age) {
		this.list.add(name + " " + age);
		return list;
	}
	
	public ArrayList<String> getList() {
		return list;
	}
}
