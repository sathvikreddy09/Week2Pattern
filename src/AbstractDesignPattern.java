
public class AbstractDesignPattern {

	public static void main(String[] args) {
		Manufacture toy = ManufactureFactory.getManufacture(new ToyFactory("500 MaH","500 v","10"));
		Manufacture car = ManufactureFactory.getManufacture(new CarFactory("200 MaH","1330 v","29"));
		Manufacture tesla = ManufactureFactory.getManufacture(new TeslaFactory("2000 MaH","15555 v","50"));
		System.out.println("Toy battery with specifications "+toy);
		System.out.println("Car battery with specifications "+car);
		System.out.println("Tesla battery with specifications "+tesla);
		System.out.println("Toy battery with specifications "+toy);
		System.out.println("Car battery with specifications "+car);
		System.out.println("Tesla battery with specifications "+tesla);
	}


}
