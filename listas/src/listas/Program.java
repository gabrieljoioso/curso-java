package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		// Não aceita tipos primitivos(int por exemplo), tem que usar a wrapper class
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		// add o marco na posição 2
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		
		//laço for each para mostrar a lista.
        for (String x : list) {
        System.out.println(x);
		
		}
		
        
        System.out.println("------------------");
		
		// remover da lista
		// list.remove("Anna");
		// list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
			
			
		System.out.println("------------------");
		
		// encontrar a posição de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		
		
		System.out.println("------------------");
		// Filtrar a lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());		
		
		for (String x : result) {
			System.out.println(x);
		}
		
		
		//encontrar elemento da lista que atenda um certo predicado
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
