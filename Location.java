
public class Location extends Employee implements Money  {
	
	private float stateTax;
	private float minSaleForTransfer;
	public float getStateTax() {
		return stateTax;
	}
	public void setStateTax(float stateTax) {
		this.stateTax = stateTax;
	}
	public float getMinSaleForTransfer() {
		return minSaleForTransfer;
	}
	public void setMinSaleForTransfer(float minSaleForTransfer) {
		this.minSaleForTransfer = minSaleForTransfer;
	}
	
	public void transferLocation() {
		
	}
}
