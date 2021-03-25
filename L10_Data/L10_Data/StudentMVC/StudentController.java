package StudentMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * This is dumb - just do an inner class like we always do
 * :) :)
 * @author fowlml01
 *
 */
public class StudentController implements ActionListener{
	private JFrame mySourceFrame;
	private StudentModel myModel;
	public StudentController(JFrame mySourceFrame, StudentModel sm) {
		this.mySourceFrame = mySourceFrame;
		myModel = sm;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//THIS IS A SPECIFIC PART...for now
		if(e.getActionCommand().equals("Change Details")) {
			//Get student data and then update my model
			String studentName = JOptionPane.showInputDialog(mySourceFrame,"Enter student name:","Student Name");
			int rollNo = Integer.parseInt(JOptionPane.showInputDialog(mySourceFrame,"Enter student roll no","0"));
			myModel.updateModelData(rollNo,studentName);
		}
		
	}

}
