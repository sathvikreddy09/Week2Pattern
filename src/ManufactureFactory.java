
public class ManufactureFactory {

	public static Manufacture getManufacture(Battery factory){
		return factory.createNewBattery();
	}
}
