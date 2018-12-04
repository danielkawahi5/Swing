package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginForm extends JFrame implements ActionListener {
	JLabel l1, l2, l3;
	JTextField tf1;
	JButton btn1;
	JTextField tf2;
	
	LoginForm() {
		JFrame jFrame = new JFrame("LOGIN FORM");
		
		l1 = new JLabel("--login form--");
		l1.setForeground(Color.GREEN);
		l1.setFont(new Font("Serif", Font.BOLD, 30));
		
		l2 = new JLabel("USERNAME:");
		l3 = new JLabel("PASSWORD:");
		tf1 = new JTextField();
		tf2 = new JTextField();
		btn1 = new JButton("LOGIN");
		
		/*btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("jebac biede");
			}
		});*/
		
		btn1.addActionListener(e -> System.out.println("co do chuja?"));
		
		l1.setBounds(100, 30, 400, 30);
		l2.setBounds(80, 70, 200, 30);
		l3.setBounds(80, 110, 200, 30);
		tf1.setBounds(300, 70, 200, 30);
		tf2.setBounds(300, 110, 200, 30);
		btn1.setBounds(150, 160, 100, 30);
		
		jFrame.add(l1);
		jFrame.add(l2);
		jFrame.add(l3);
		jFrame.add(tf1);
		jFrame.add(btn1);
		jFrame.add(tf2);
		
		jFrame.setSize(1200, 1200);
		jFrame.setLayout(null);
		jFrame.setVisible(true);
	}
	
	private void addActionEvent() {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent ae) {
		String username = tf1.getText();
		String password = tf2.getText();
		
		if(username.equals("admin") && password.equals("admin")) {
			
			Main welcome = new Main();
			welcome.setVisible(true);
			JLabel label = new JLabel("Welcome -- " + username);
			welcome.getContentPane().add(label);
			
		} else {
			JOptionPane.showMessageDialog(this, "KURWA èle! èLE FCHUJ!",
					"Jakie jest has≥o? INNE! INNE KURWA!", JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
