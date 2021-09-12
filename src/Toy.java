
public class Toy implements Battery {
	private String size;
	private String voltage;
	private String backup;

	
	public Toy(String size, String voltage, String backup) {
		super();
		this.size = size;
		this.voltage = voltage;
		this.backup = backup;
	}
 
	@Override
	public String size() {
		return this.size;
	}
 
	@Override
	public String voltage() {
		return this.voltage;
	}
 
	@Override
	public String backup() {
		return this.backup;
	}
 
 
	@Override
	public String toString() {
		return "size :" + size + ", volts:" + voltage + ", hours :" + backup;
	}

}
