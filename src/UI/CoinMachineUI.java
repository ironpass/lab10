package UI;
import java.awt.*;
import javax.swing.*;

import coinmachine.MachineStatus;

import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

public class CoinMachineUI extends JFrame implements Observer {
	JLabel balanceLabel;
	
	public CoinMachineUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
	}
	
	public void initComponents() {
		setBounds(500,200,250,100);
		setResizable(false);
		Container mainFrame = new Container();
		mainFrame.setLayout(new GridLayout(2, 1));
		Container topRow = new Container();
		topRow.setLayout(new FlowLayout());
		Container botRow = new Container();
		
		balanceLabel = new JLabel("Balance: ");
		topRow.add(balanceLabel);
		mainFrame.add(topRow);
		mainFrame.add(botRow);
		add(mainFrame);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		balanceLabel.setText("Balance: "+((MachineStatus) arg).getBalance());
	}
}
