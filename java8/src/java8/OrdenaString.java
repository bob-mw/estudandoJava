package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Comparator<String> comparator = new CompadorDeStringPorTamanho();
		Consumer<String> consumer = new ConsumidorDeString();
		
		list.add("Tereza");
		list.add("Bartolomeu");
		list.add("Berculino");
		
		Collections.sort(list, comparator);
		
		System.out.println(list);
		
		list.forEach(consumer);
		
		

	}

}
