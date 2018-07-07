
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// adding new students
		System.out.println("How many students do you want to add?");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Student[] student = new Student[n];
		
		for(int i=0;i<n;i++) {
			student[i] = new Student();
			// enroll
			enroll(student[i]);
			// pay tuition
			payTuition(student[i]);
		}
		
		for(int i=0;i<n;i++) {
			showInfo(student[i]);
		}
	}
	


	// enrollment method
	public static void enroll(Student s) {
		System.out.println("Courses available to enroll: (press q to quit):\n	History 101\r\n" + "	Mathematics 101\r\n"
				+ "	English 101\n" + "	Chemistry 101\r\n" + "	Computer science 101");
		do {
			System.out.print("Enter course to enroll: ");

			Scanner input = new Scanner(System.in);
			String c = input.next();
			if (!c.equals("q")) {
				s.setCourses(s.getCourses()+"\n"+c);
				s.setTuitionBalance(s.getTuitionBalance() + s.getCostOfCourse());
			} else {break;}
		} while (1 != 0);
		
		System.out.println("Enrolled in: " + s.getCourses());
		System.out.println("Cost: " + s.getTuitionBalance());
		System.out.println();
		
	}
	
	// view tuition balance  method
	public static void viewBalance(Student s) {
		System.out.println("Tuition Balance: $" + s.getTuitionBalance());
	}
	
	// pay tuition balance methods
	public static void payTuition(Student s) {
		System.out.println("How much do you want to pay?");
		Scanner input = new Scanner(System.in);
		int amount = input.nextInt();
		s.setTuitionBalance(s.getTuitionBalance()-amount);
		
		viewBalance(s);
		input.close();
	}
	
	// show info about a student
	public static void showInfo(Student s) {
		System.out.println("Printing the requested info:");
		System.out.println("Student: "+s.getFirstName()+" "+s.getLastName());
		System.out.println("Year: "+s.getGradeYear()+", ID: "+s.getStudentID());
		System.out.println("Enrolled in:"+s.getCourses()+"\nBalance: $"+s.getTuitionBalance());
	}
}
