
public class TeslaFactory implements Battery {

	private String size;
	private String volt;
	private String hour;
	
	public TeslaFactory(String size, String volt, String hour){
		this.size=size;
		this.volt=volt;
		this.hour=hour;
	}
	
	@Override
	public Manufacture createNewBattery() {
		return new Tesla(size,volt,hour);
	}

}
