
public class StudentManager extends UserManager {
		public void takeCourse(Student student) {
			System.out.println("\n" + student.getTakenCourse() + 
					" kursu " + student.getFirstName() + " " + 
					student.getLastName() + " ��rencisi taraf�ndan al�nd�.");
		}
}
