import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Student student1 = new Student("John", "Snow", 2);
		System.out.println(student1);

		// Student student2 = new Student();
		// System.out.println(student2);

		enroll(student1);
	}

	public static void enroll(Student s) {
		System.out.println("Courses available to enroll: (press q to quit):\n	History 101\r\n" + "	Mathematics 101\r\n"
				+ "	English 101\n" + "	Chemistry 101\r\n" + "	Computer science 101");
		do {
			System.out.print("Enter courses to enroll: ");

			Scanner input = new Scanner(System.in);
			String c = input.next();
			if (!c.equals("q")) {
				s.setCourses(c+"\n"+s.getCourses());
				s.setTuitionBalance(s.getTuitionBalance() + s.getCostOfCourse());
			} else {break;}
		} while (1 != 0);
		
		System.out.println("Enrolled in: " + s.getCourses());
		System.out.println("Tuition Balance: " + s.getTuitionBalance());
	}

}
