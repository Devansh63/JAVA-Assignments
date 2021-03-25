package StudentMVC;

import java.util.Observable;

public class StudentModel extends Observable {
	private int rollNo;
	private String name;
	
	public StudentModel() {
		name = "";
		rollNo = 0;
	}
	
	public StudentModel(int rn, String n) {
		rollNo = rn;
		name = n;
	}
	public void updateModelData(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		setChanged(); 
		notifyObservers(); 
	}
	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}
	
	
	public String toString() {
		return name + " #" + rollNo;
	}
	
	

}