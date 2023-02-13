package practiceproblems1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateValuesFromHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 2);
		map.put("D", 4);
		map.put("E", 4);
		
		System.out.println("Before :" + map);
		
		Set<Integer> existing = new HashSet<>();
		
//		map = map.entrySet()
//				.stream().filter(entry -> existing.add(entry.getValue()))
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		map = map.entrySet()
			    .stream()
			    .filter(entry -> existing.add(entry.getValue()))
			    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		
		System.out.println("After :" + map);
		
	}

}
