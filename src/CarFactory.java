
public class CarFactory implements Manufacturer {

	private String size;
	private String voltage;
	private String backup;
	
	
	public CarFactory(String size, String voltage, String backup) {
		super();
		this.size = size;
		this.voltage = voltage;
		this.backup = backup;
	}

	@Override
	public Battery createBattery() {
		return new Car(size, voltage, backup);
	}

}
