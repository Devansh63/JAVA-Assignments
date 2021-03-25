package StudentMVC;

public class StudentMain {

	public static void main(String[] students) {
		//Making the views, models, and connecting accordingly
		StudentModel sm = new StudentModel();
		StudentView svc = new StudentView(sm);
		StudentController sc = new StudentController(svc,sm);
		svc.addController(sc);
		sm.addObserver(svc);
		svc.setVisible(true);
	}
	
	private StudentMain() {
		//Guarantees ONLY static access
	}
}
