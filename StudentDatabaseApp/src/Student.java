import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses;
	private String studentID;
	private int tuitionBalance=0;
	private static int costOfCourse=600;
	private static int idGenerator=1000;
	
	// basic constructor-------------------------------------------------------------------------------------
	public Student(String firstName, String lastName, int gradeYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeYear = gradeYear;
		setStudentID();
	}
	
	// constructor that prompts the user to input from keyboard----------------------------------------------
	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student's first name:");
		this.firstName= input.nextLine();
		
		System.out.println("Enter student's last name:");
		this.lastName= input.nextLine();
		
		System.out.println("Enter student's class level:\n 1.Freshmen\n 2.Sophmore\n 3.Junior\n 4.Senior");
		this.gradeYear= input.nextInt();
		
		setStudentID();
	}
	
	// Setters and Getters ---------------------------------------------------------------------------------
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID() {
		idGenerator++;
		this.studentID = gradeYear+""+idGenerator;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGradeYear() {
		return gradeYear;
	}

	public void setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public int getTuitionBalance() {
		return tuitionBalance;
	}

	public void setTuitionBalance(int tuitionBalance) {
		this.tuitionBalance = tuitionBalance;
	}

	public int getCostOfCourse() {
		return costOfCourse;
	}

	public void setCostOfCourse(int costOfCourse) {
		this.costOfCourse = costOfCourse;
	}
	
	public static int getIdGenerator() {
		return idGenerator;
	}

	public static void setIdGenerator(int idGenerator) {
		Student.idGenerator = idGenerator;
	}
	
	// toString method---------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Student " + firstName + " " + lastName + ", year: " + gradeYear+", ID: "+studentID;
	}
}
