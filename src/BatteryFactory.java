
public class BatteryFactory {
	private BatteryFactory() {
		 
	}
	
	public static Battery getBattery(Manufacturer Manufacturer) {
		return Manufacturer.createBattery();
	}
}
