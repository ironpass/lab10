package UI;

import java.awt.*;
import javax.swing.*;

import coinmachine.Coin;
import coinmachine.CoinMachine;
import coinmachine.MachineStatus;

import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

public class CoinMachineUI extends JFrame implements Observer {
	JLabel balanceLabel;
	JButton oneBahtButton;
	JButton fiveBahtButton;
	JButton tenBahtButton;
	CoinMachine machine;
	JProgressBar coinCap;
	
	public CoinMachineUI(CoinMachine machine) {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
		setVisible(true);
		this.machine = machine;
	}

	public void initComponents() {
		setBounds(500, 200, 500, 300);
		setResizable(false);
		Container mainFrame = new Container();
		mainFrame.setLayout(new GridLayout(2, 1));
		Container topRow = new Container();
		topRow.setLayout(new FlowLayout());
		balanceLabel = new JLabel("Balance: 0   ");
		topRow.add(balanceLabel);
		topRow.add(new JLabel("Status: "));
		
		coinCap = new JProgressBar(0, 10);
		coinCap.setStringPainted(true);
		coinCap.setString("0");
		topRow.add(coinCap);
		JPanel botRow = new JPanel();
		botRow.setBorder(BorderFactory.createTitledBorder("Insert Money"));
		oneBahtButton = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/1baht.png")));
		fiveBahtButton = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/5baht.png")));
		tenBahtButton = new JButton(new ImageIcon(getClass().getClassLoader().getResource("images/10baht.png")));
		oneBahtButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				machine.insert(new Coin(1, "Baht"));
				balanceLabel.setText("Balance: " + machine.getBalance() + "   ");
				updateBarColor();
			}
		});
		fiveBahtButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				machine.insert(new Coin(5, "Baht"));
				balanceLabel.setText("Balance: " + machine.getBalance() + "   ");
				updateBarColor();
			}
		});
		tenBahtButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				machine.insert(new Coin(10, "Baht"));
				balanceLabel.setText("Balance: " + machine.getBalance() + "   ");
				updateBarColor();
			}
		});
		botRow.add(oneBahtButton);
		botRow.add(fiveBahtButton);
		botRow.add(tenBahtButton);
		mainFrame.add(topRow);
		mainFrame.add(botRow);
		add(mainFrame);
	}
	public void updateBarColor() {
		if (machine.getCount()<3)
			coinCap.setForeground(Color.RED);
		else if (machine.getCount()<6)
			coinCap.setForeground(Color.ORANGE);
		else if (machine.getCount()<8) 
			coinCap.setForeground(Color.YELLOW);
		else
			coinCap.setForeground(Color.GREEN);
		
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		balanceLabel.setText("Balance: " + ((MachineStatus) arg).getBalance() + "   ");
		coinCap.setValue(Integer.parseInt(((MachineStatus) arg).getCoinAmount()));
		coinCap.setString(((MachineStatus) arg).getCoinAmount());
		updateBarColor();
	}
}
