
public abstract class Manufacture {
	 public abstract String getSize();
	    public abstract String getVoltage();
	    public abstract String getBackup();
	     
	    @Override
	    public String toString(){
	        return "size : "+this.getSize()+", volts :"+this.getVoltage()+", hours :"+this.getBackup();
	    }
}
