package Splashmander;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TheApplication extends JFrame{

	public TheApplication() {
		setSize(300,300);
		setTitle("THE APPLICATION");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JLabel myLabel = new JLabel(makeIcon("004Charmander.png",300,300));
		add(myLabel);
	}
	
	private ImageIcon makeIcon(String img, int i, int j) {
		//The process of scaling an image!
		ImageIcon ico = new ImageIcon(img);
		Image image = ico.getImage(); // transform it 
		Image newimg = image.getScaledInstance(i, j,  Image.SCALE_SMOOTH); // scale it the smooth way  
		return new ImageIcon(newimg);  // transform it back
	}

}
