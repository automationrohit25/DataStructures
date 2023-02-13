package enums;

public class EnumConstructorExample {

	public static void main(String[] args) {
		
		TrafficSignal[] signals = TrafficSignal.values();
		
		for(TrafficSignal signal : signals) {
			System.out.println("signal: " + signal.name() + " action: " + signal.getAction());
		}

	}

}
