
public class CarFactory implements Battery {

	private String size;
	private String volt;
	private String hour;
	
	public CarFactory(String size, String volt, String hour){
		this.size=size;
		this.volt=volt;
		this.hour=hour;
	}
	
	@Override
	public Manufacture createNewBattery() {
		return new Car(size,volt,hour);
	}

}
