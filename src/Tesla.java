
public class Tesla extends Manufacture {

	 private String size;
	    private String volt;
	    private String hour;
	     
	    public Tesla(String size, String volt, String hour){
	        this.size=size;
	        this.volt=volt;
	        this.hour=hour;
	    }
	    @Override
	    public String getSize() {
	        return this.size;
	    }
	 
	    @Override
	    public String getVoltage() {
	        return this.volt;
	    }
	 
	    @Override
	    public String getBackup() {
	        return this.hour;
	    }

}
