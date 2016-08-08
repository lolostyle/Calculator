import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainWindow {


	private JButton button0 = new JButton("0");
	private JButton button1 = new JButton("0");
	private JButton button2 = new JButton("0");
	private JButton button3 = new JButton("0");
	private JButton button4 = new JButton("0");
	private JButton button5 = new JButton("0");
	private JButton button6 = new JButton("0");
	private JButton button7 = new JButton("0");
	private JButton button8 = new JButton("0");
	private JButton button9 = new JButton("0");
	private JButton buttonPoint = new JButton("0");
	private JButton buttonEquals = new JButton("0");
	private JButton buttonPlus = new JButton("0");
	private JButton buttonMinus = new JButton("0");
	private JButton buttonDivide = new JButton("0");
	private JButton buttonMultime = new JButton("0");
	
	private JPanel window = new JPanel();
	private JTextField textField = new JTextField(30);
	private JButton buttonDelete = new JButton("<-");
	
	private MainWindow() {
		
		JPanel panel = new JPanel();
		panel.add(textField);
		panel.add(buttonDelete);
		
		BorderLayout b1 = new BorderLayout();
		window.setLayout(b1);
		window.add("North", panel);
		
		JPanel panelButton = new JPanel();
		GridLayout g1 = new GridLayout(4, 3);
		
		panelButton.setLayout(g1);
		panelButton.add(button7);
		panelButton.add(button8);
		panelButton.add(button9);
		panelButton.add(button4);
		panelButton.add(button5);
		panelButton.add(button6);
		panelButton.add(button1);
		panelButton.add(button2);
		panelButton.add(button3);
		panelButton.add(button0);
		panelButton.add(buttonPoint);
		panelButton.add(buttonEquals);
		
		JPanel panelButton2 = new JPanel();
		GridLayout g2 = new GridLayout(4, 1);
		
		panelButton2.setLayout(g2);
		panelButton.add(buttonPlus);
		panelButton.add(buttonMinus);
		panelButton.add(buttonDivide);
		panelButton.add(buttonMultime);
		
		window.add("Center", panelButton);
		window.add("East", panelButton2);
		
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(window);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		MainWindow calculator = new MainWindow();
		

	}

}
