package kodlama.io_Gun3Odev2;

public class Instructor extends User{
	
	private String[] coursesGiven;
	
	public Instructor() {
		
	}

	public Instructor(String[] coursesGiven) {
		super();
		this.coursesGiven = coursesGiven;
	}

	public String[] getCoursesGiven() {
		return coursesGiven;
	}

	public void setCoursesGiven(String[] coursesGiven) {
		this.coursesGiven = coursesGiven;
	}
	
	
}
