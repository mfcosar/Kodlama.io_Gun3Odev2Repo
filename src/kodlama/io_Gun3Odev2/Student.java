package kodlama.io_Gun3Odev2;

public class Student extends User{
	
	private String[] coursesTaken;
	
	public Student() {
		
	}
	
	public String[] getCoursesTaken() {
		return coursesTaken;
	}

	public void setCoursesTaken(String[] coursesTaken) {
		this.coursesTaken = coursesTaken;
	}

	public Student(String[] coursesTaken) {
		super();
		this.coursesTaken = coursesTaken;
	}
	
}
