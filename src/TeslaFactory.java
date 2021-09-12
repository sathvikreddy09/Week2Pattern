
public class TeslaFactory implements Manufacturer {

	private String size;
	private String voltage;
	private String backup;
	
	public TeslaFactory(String size, String voltage, String backup) {
		super();
		this.size = size;
		this.voltage = voltage;
		this.backup = backup;
	}
 
	@Override
	public Battery createBattery() {
		return new Tesla(size, voltage, backup);
	}
}
