package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("maria");
		list.add("emerson");
		list.add("amanda");
		list.add("julio");
		list.add("lucas");
		
		list.add(3, "kaua");
		
		System.out.println(list.size());
		
		System.out.println("---------------------------");
		
		for(String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------------");
		list.remove(4);
		list.removeIf(x -> x.charAt(0) == 'l');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");

		System.out.println("index of maria: " + list.indexOf("maria"));
		System.out.println("index of julio: " + list.indexOf("julio"));

		System.out.println("---------------------------");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'm').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'e').findFirst().orElse(null);
		System.out.println(name );
		
	}

}
