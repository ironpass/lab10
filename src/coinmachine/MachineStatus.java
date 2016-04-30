package coinmachine;

public class MachineStatus {
	private String coinAmount;
	private boolean isFull;
	public MachineStatus(boolean isFull, String coinAmount) {
		this.isFull = isFull;
		this.coinAmount = coinAmount;
	}
	public String getCoinAmount() {
		return coinAmount;
	}
	public void setCoinAmount(String coinAmount) {
		this.coinAmount = coinAmount;
	}
	public boolean getIsFull() {
		return isFull;
	}
	public void setIsFull(boolean isFull) {
		this.isFull = isFull;
	}
	
}
