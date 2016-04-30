package coinmachine;
/**
 * 
 * @author Akarachai Passavoranan
 * This object class is used for being (Observer)update method's parameter
 */
public class MachineStatus {
	private String coinAmount;
	private boolean isFull;
	private int balance;
	public MachineStatus(boolean isFull, String coinAmount, int balance) {
		this.isFull = isFull;
		this.coinAmount = coinAmount;
		this.balance = balance;
	}
	/**
	 * 
	 * @return balance of a machine
	 */
	public int getBalance() {
		return balance;
	}
	/**
	 * 
	 * @return amount of coins in a machine
	 */
	public String getCoinAmount() {
		return coinAmount;
	}
	/**
	 * 
	 * @return machine's state telling that it is full or not
	 */
	public boolean getIsFull() {
		return isFull;
	}
	
}
