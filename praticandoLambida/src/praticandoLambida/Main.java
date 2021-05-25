package praticandoLambida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main implements Comparator<String> {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Tereza");
		list.add("Bartolomeu");
		list.add("Miguelito");
		
		Collections.sort(list);
		
		System.out.println(list);
	}

	@Override
	public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) 
            return -1;
        if(s1.length() > s2.length()) 
            return 1;

		return 0;
	}
}
