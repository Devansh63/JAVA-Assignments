package Project1;
import javax.swing.JOptionPane;
import java.util.Scanner;
/*
 * Devansh Agrawal
 * CS 160-07/Fall Semester 2018
 * Project 1: Compute the Projectile Motion
 * 
 * Description: 
 * 
 */

public class Projectile
{
	public static void main(String []args) 
	{
		String task,title;             
		String trajectory;
		double distancetotarget;     //Declaration of variables 
		double initialvelocity;
		double initialangle;
		final double GRAVITATION=32;
		
		
		//1st attempt
		task="Enter Distance to target in feet:";
		title="input";
		distancetotarget = Double.parseDouble(JOptionPane.showInputDialog(null,task,title,JOptionPane.OK_CANCEL_OPTION));
		task="Enter initial velocity in feet/sec:";
		initialvelocity = Double.parseDouble(JOptionPane.showInputDialog(null,task,title,JOptionPane.QUESTION_MESSAGE));   // Getting input from the user 
		task="Enter the launch angle";
		initialangle = Double.parseDouble(JOptionPane.showInputDialog(null,task,title,JOptionPane.QUESTION_MESSAGE));
		
		double radian=initialangle*Math.PI/180;
		double flighttime=((2*initialvelocity*Math.sin(radian))/GRAVITATION);
		double maxh=(initialvelocity*Math.sin(radian))*(flighttime/2)-(GRAVITATION*(Math.pow(flighttime/2,2.0)))/2.0;  //Calculation of value 
		double range=(initialvelocity*Math.cos(radian))*flighttime;	
		double error = range-distancetotarget;
		trajectory = String.format("initial velocity: %.2f feet/second" + 
								   "\nlaunch angle: %.2f degrees" + 
				                   "\nflight time: %.2f seconds" +                       //Output String 
			                       "\nmaximum height: %.2f feet" + 
		                           "\ndistance traveled: %.2f feet" +
				                   "\ntaget missed by: %.2f feet",initialvelocity
				                   ,initialangle,flighttime,maxh,range,error); 
		if(error<0)
		{
			if(initialangle==45)
				{
					title="Modification needed";
					JOptionPane.showMessageDialog(null,"Target is too far\n" + 
					"Restart the program with greater initial velocity",title, JOptionPane.WARNING_MESSAGE);  //To check if the object is in range
					System.exit(0);
				};
		}
		
		
		if(error>=-1 && error<=1)
		{	
			title = "Message";
			JOptionPane.showMessageDialog(null,"Target is hit within an error of 1 foot!\n" +      //check if the target has been hit
					"the program is terminated",title, JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		
		
		Double minError = Math.abs(error);                //To calculate the minimum value 
		minError = Math.min(error,minError);
		
		
		System.out.printf(trajectory);			
		JOptionPane.showMessageDialog(null,trajectory);		//To display the output
		
		if(error<-1)
		{
			System.out.println("\nShot fell short of the target. Increase the launch angle!");           // To print out advice
		}
		
		else
		{
			if(error>1)System.out.println("\nShot went beyond the target. Decrease the launch angle!");
		}
		
		
		//2nd attempt
		task="Enter Distance to target in feet:";
		title="input";
		
		distancetotarget = Double.parseDouble(JOptionPane.showInputDialog(null,task,title,JOptionPane.OK_CANCEL_OPTION));
		task="Enter initial velocity in feet/sec:";
		
		initialvelocity = Double.parseDouble(JOptionPane.showInputDialog(null,task,title,JOptionPane.QUESTION_MESSAGE));
		task="Enter the launch angle";
		
		initialangle = Double.parseDouble(JOptionPane.showInputDialog(null,task,title,JOptionPane.QUESTION_MESSAGE));
		radian=initialangle*Math.PI/180;
		
		
		flighttime=((2*initialvelocity*Math.sin(radian))/GRAVITATION);
		maxh=(initialvelocity*Math.sin(radian))*(flighttime/2)-(GRAVITATION*(Math.pow(flighttime/2,2.0)))/2.0;
		range=(initialvelocity*Math.cos(radian))*flighttime;	
		error = range-distancetotarget;
		
		
		if(error>=-1 && error<=1)
		{	
			title = "Message";
			JOptionPane.showMessageDialog(null,"Target is hit within an error of 1 fott!\n" + 
					"the program is terminated",title, JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		
		trajectory = String.format("initial velocity: %.2f feet/second" + 
				   "\nlaunch angle: %.2f degrees" + 
                "\nflight time: %.2f seconds" + 
                "\nmaximum height: %.2f feet" + 
                "\ndistance traveled: %.2f feet" +
                "\ntaget missed by: %.2f feet",initialvelocity
                ,initialangle,flighttime,maxh,range,error); 
		
		System.out.printf(trajectory);
		JOptionPane.showMessageDialog(null,trajectory);
	
		error = Math.abs(error);
		minError = Math.min(error,minError);
		
		if(error<-1)
		{
			System.out.println("\nShot fell short of the target. Increase the launch angle!");
		}
		else
		{
			if(error>1)System.out.println("\nShot went beyond the target. Decrease the launch angle!");
				
		}
		
		
		//3rd attempt
		task="Enter Distance to target in feet:";
		title="input";
		
		distancetotarget = Double.parseDouble(JOptionPane.showInputDialog(null,task,title,JOptionPane.OK_CANCEL_OPTION));
		task="Enter initial velocity in feet/sec:";
		
		initialvelocity = Double.parseDouble(JOptionPane.showInputDialog(null,task,title,JOptionPane.QUESTION_MESSAGE));
		task="Enter the launch angle";
		
		initialangle = Double.parseDouble(JOptionPane.showInputDialog(null,task,title,JOptionPane.QUESTION_MESSAGE));
		
		
		radian=initialangle*Math.PI/180;
		flighttime=((2*initialvelocity*Math.sin(radian))/GRAVITATION);
		maxh=(initialvelocity*Math.sin(radian))*(flighttime/2)-(GRAVITATION*(Math.pow(flighttime/2,2.0)))/2.0;
		range=(initialvelocity*Math.cos(radian))*flighttime;	
		error = range-distancetotarget;
		
		
		if(error>=-1 && error<=1)
		{	
			title = "Message";
			JOptionPane.showMessageDialog(null,"Target is hit within an error of 1 fott!\n" + 
					"the program is terminated",title, JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		
		trajectory = String.format("initial velocity: %.2f feet/second" + 
				   "\nlaunch angle: %.2f degrees" + 
                "\nflight time: %.2f seconds" + 
                "\nmaximum height: %.2f feet" + 
                "\ndistance traveled: %.2f feet" +
                "\ntaget missed by: %.2f feet",initialvelocity
                ,initialangle,flighttime,maxh,range,error); 
		
		System.out.printf(trajectory);
		JOptionPane.showMessageDialog(null,trajectory);
		
		if(error<-1)
		{
			System.out.println("\nShot fell short of the target. Increase the launch angle!");
		}
		else
		{
			if(error>1)System.out.println("\nShot went beyond the target. Decrease the launch angle!");
				
		}
		
		error = Math.abs(error);
		minError = Math.min(error,minError);
			
		//4th attempt
		task="Enter Distance to target in feet:";
		title="input";
		
		distancetotarget = Double.parseDouble(JOptionPane.showInputDialog(null,task,title,JOptionPane.OK_CANCEL_OPTION));
		task="Enter initial velocity in feet/sec:";
		
		initialvelocity = Double.parseDouble(JOptionPane.showInputDialog(null,task,title,JOptionPane.QUESTION_MESSAGE));
		task="Enter the launch angle";
		
		initialangle = Double.parseDouble(JOptionPane.showInputDialog(null,task,title,JOptionPane.QUESTION_MESSAGE));
		radian=initialangle*Math.PI/180;
		
		
		flighttime=((2*initialvelocity*Math.sin(radian))/GRAVITATION);
		maxh=(initialvelocity*Math.sin(radian))*(flighttime/2)-(GRAVITATION*(Math.pow(flighttime/2,2.0)))/2.0;
		range=(initialvelocity*Math.cos(radian))*flighttime;	
		error = range-distancetotarget;
		
		
		if(error>=-1 && error<=1)
		{	
			title = "Message";
			JOptionPane.showMessageDialog(null,"Target is hit within an error of 1 fott!\n" + 
					"the program is terminated",title, JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		
		trajectory = String.format("initial velocity: %.2f feet/second" + 
				   "\nlaunch angle: %.2f degrees" + 
                "\nflight time: %.2f seconds" + 
                "\nmaximum height: %.2f feet" + 
                "\ndistance traveled: %.2f feet" +
                "\ntaget missed by: %.2f feet",initialvelocity
                ,initialangle,flighttime,maxh,range,error); 
		
		
		System.out.println(trajectory);
		JOptionPane.showMessageDialog(null,trajectory);
		
		
		if(error<-1)
		{
			System.out.println("\nShot fell short of the target. Increase the launch angle!");
		}
		else
		{
			if(error>1)System.out.println("\nShot went beyond the target. Decrease the launch angle!");
				
		}
		
		error = Math.abs(error);
		minError = Math.min(error,minError);
		
		System.out.println("\nYour best shot missed the target with " + minError + " feet");
		
		
		/*initial velocity: 250.00 feet/second
		launch angle: 45.00 degrees
		flight time: 11.05 seconds
		maximum height: 488.28 feet
		distance traveled: 1953.12 feet
		taget missed by: 1452.12 feet
		Shot went beyond the target. Decrease the launch angle!
		initial velocity: 250.00 feet/second
		launch angle: 30.00 degrees
		flight time: 7.81 seconds
		maximum height: 244.14 feet
		distance traveled: 1691.46 feet
		taget missed by: 1189.46 feet
		Shot went beyond the target. Decrease the launch angle!
		initial velocity: 250.00 feet/second
		launch angle: 20.00 degrees
		flight time: 5.34 seconds
		maximum height: 114.24 feet
		distance traveled: 1255.44 feet
		taget missed by: 753.44 feet
		Shot went beyond the target. Decrease the launch angle!
		initial velocity: 250.00 feet/second
		launch angle: 10.00 degrees
		flight time: 2.71 seconds
		maximum height: 29.45 feet
		distance traveled: 668.01 feet
		taget missed by: 166.01 feet
		
		Shot went beyond the target. Decrease the launch angle!
		
		Your best shot missed the target with 166.00809243294668 feet
		*/
	
		
	
}





	
}
