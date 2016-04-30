package coinmachine;

public class MachineStatus {
	private String coinAmount;
	private boolean isFull;
	private int balance;
	public MachineStatus(boolean isFull, String coinAmount, int balance) {
		this.isFull = isFull;
		this.coinAmount = coinAmount;
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
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
