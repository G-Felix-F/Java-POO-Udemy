package capitulo12.arrays.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Hugo");
		list.add("Vitor");
		list.add("Mariafefanda");
		
		list.add(3, "Lindaaah");
		
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("-----------------");
		
		list.removeIf(x -> x.charAt(0) =='M');
		System.out.println(list);
		
		System.out.println("-----------------");

		System.out.println("Index of Hugo: " + list.indexOf("Hugo"));
		System.out.println("Index of Petter: " + list.indexOf("Petter"));
		
		System.out.println("-----------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'H').collect(Collectors.toList());
		System.out.println(result);
		
		System.out.println("-----------------");

		String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
		System.out.println(name);
		
	}
}