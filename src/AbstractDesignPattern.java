
public class AbstractDesignPattern {

	public static void main(String[] args) {
		Battery Car = BatteryFactory.getBattery(new CarFactory("454", "632", "100"));
		System.out.println("Car battery with specifications "+Car);
		
		Battery Tesla = BatteryFactory.getBattery(new TeslaFactory("9000", "1400", "1000"));
		System.out.println("Tesla battery with specifications "+Tesla);
		
		Battery Toy = BatteryFactory.getBattery(new ToyFactory("160 MaH", "1400", "223"));
		System.out.println("Toy battery with specifications "+Toy);
	}


}
