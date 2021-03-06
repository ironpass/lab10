package UI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import coinmachine.MachineStatus;

import java.util.Observable;
import java.util.Observer;
/**
 * This class is for coin counter GUI (The small window)
 * @author Akarachai Passavoranan
 *
 */
public class CoinCounterUI extends JFrame implements Observer {
	JTextField coinAmountTextField;
	JLabel statusLabel;
	/**
	 * Constructor
	 * and also showing-the-frame method is called in this constructor
	 */
	public CoinCounterUI(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
	}
	/**
	 * initialize GUI components
	 */
	public void initComponents() {
		setBounds(200,200,250,100);
		setResizable(false);
		Container mainFrame = new Container();
		mainFrame.setLayout(new GridLayout(2,1));
		Container topRow = new Container();
		topRow.setLayout(new GridLayout(1,2));
		JLabel coinAmountLabel = new JLabel("#Coins: ");
		coinAmountTextField = new JTextField(10);
		coinAmountTextField.setEditable(false);
		topRow.add(coinAmountLabel);
		topRow.add(coinAmountTextField);
		statusLabel = new JLabel("Machine is ready.");
		mainFrame.add(topRow);
		mainFrame.add(statusLabel);
		add(mainFrame);
	}
	/**
	 * update method for observer interface
	 */
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		coinAmountTextField.setText(((MachineStatus) arg1).getCoinAmount());
		if (((MachineStatus) arg1).getIsFull())
			statusLabel.setText("This machine is full.");
		else
			statusLabel.setText("Accepting Coins");
	}
}
