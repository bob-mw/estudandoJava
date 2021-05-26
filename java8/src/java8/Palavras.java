package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palavras {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>(Arrays.asList (new String[]{"Iniciando", "ArrayList", "Com", "Elementos"}));
		
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(palavras);
		
		palavras.forEach(System.out::println);
		

	}

}
