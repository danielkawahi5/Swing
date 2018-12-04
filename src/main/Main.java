package main;

import javax.swing.JFrame;

public class Main extends JFrame {
	
	Main() {
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("WELCOME");
		setSize(1000, 1000);
	}
	
	
	public static void main(String[] args) {
		
		new LoginForm();
		
		/*SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				JFrame frame = new JFrame("FC Barcelona || Mes Que Un Club");
				frame.setSize(800, 800);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				
			}
		});*/
	}
}
