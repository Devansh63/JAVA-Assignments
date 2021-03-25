package Splashmander;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class TheSplashDriver extends JFrame{

	private JFrame self;
	private Timer t;
	private int counter = 0;
	private JFrame currentTheApp;
	private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static void main(String[] literallyTheHardestCode) {
		TheSplashDriver tsd = new TheSplashDriver();
		tsd.setVisible(true);
	}
	
	public TheSplashDriver() {
		self = this;
		JLabel myLabel = new JLabel("Are you hype yet?");
		add(myLabel);
		setTitle("");
		setSize(200,200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		t = new Timer(1000,null);
		t.addActionListener(new TimerListener());
		t.start();
	}
	
	private class TimerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			TheApplication theApp = new TheApplication();
			//Put the app where the splash is
			if(counter == 0) {
				theApp.setBounds(self.getX(), self.getY(), 300, 300);
				counter++;
				currentTheApp = theApp;
				
			}else {
				//theApp.setBounds(currentTheApp.getX(), currentTheApp.getY(), 300, 300);
				
				//Random instead
				int newX = (int) (screenSize.getWidth()/2 * Math.random());
				int newY = (int) (screenSize.getHeight()/2 * Math.random());
				theApp.setBounds(newX, newY, 300, 300);
				
				currentTheApp = theApp;
				counter++;
			}
			theApp.setVisible(true);
			
			self.dispose();
			if(counter == 10) {
				t.stop();
			}
			
		}
		
	}
}
