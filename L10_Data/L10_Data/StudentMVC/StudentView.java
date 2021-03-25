package StudentMVC;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class StudentView extends JFrame implements Observer {

	private Observable ov;
	
	private JFrame self = this;
	private JTextField nameDisplay;
	private JTextField rollDisplay;
	private JButton editButton;
	
	public StudentView(Observable ov) {
		this.ov = ov;
		
		setTitle("Simple Sampy Student View");
		setSize(400,150);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBackground(new Color(199, 21, 133));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		nameDisplay = new JTextField();
		nameDisplay.setEditable(false);
		contentPanel.add(nameDisplay);
		nameDisplay.setColumns(10);
		
		editButton = new JButton("Change Details");
		contentPanel.add(editButton);
		
		rollDisplay = new JTextField();
		rollDisplay.setEditable(false);
		contentPanel.add(rollDisplay);
		rollDisplay.setColumns(10);
	}
	
	
	
	@Override
	public void update(Observable ob, Object obj) {
		if(ob == ov) {
			StudentModel sm = (StudentModel) ov;
			nameDisplay.setText(sm.getName());
			rollDisplay.setText(""+sm.getRollNo());
		}
		
	}



	public void addController(StudentController sc) {
		editButton.addActionListener(sc);
		
	}

}
