
public class ToyFactory implements Manufacturer {
	private String size;
	private String voltage;
	private String backup;
	
	public ToyFactory(String size, String voltage, String backup) {
		super();
		this.size = size;
		this.voltage = voltage;
		this.backup = backup;
	}

	@Override
	public Battery createBattery() {
		return new Toy(size, voltage, backup);
	}

}
