package enums;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumRunner {

	public static void main(String[] args) {

//		Arrays.asList(Severity.values()).forEach(System.out::println);

		
//		  Map<Severity, String> map = new EnumMap<>(Severity.class);
//		  map.put(Severity.HIGH, "high");
//		  map.put(Severity.CRITICAL, "critical");
//		 System.out.println(map);
		
		Severity[] sev = Severity.values();
		
		for(Severity s : sev) {
			System.out.println(s + "at index" + s.ordinal());
		}
		
		System.out.println(Severity.valueOf("CRITICAL"));
		
//		System.out.println(Severity.CRITICAL.asLowercase());

		
//		System.out.println(svr);
	}

}
