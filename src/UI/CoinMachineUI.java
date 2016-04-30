package UI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

public class CoinMachineUI extends JFrame implements Observer {
	public CoinMachineUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
//		setVisible(true);
	}
	
	public void initComponents() {
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
