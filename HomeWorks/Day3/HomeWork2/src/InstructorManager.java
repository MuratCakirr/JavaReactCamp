
public class InstructorManager extends UserManager {
	public void giveCourse(Instructor instructor) {
		System.out.println("\n" + instructor.getGivenCourse() + 
				" kursu " + instructor.getFirstName() + " " + 
				instructor.getLastName() + " e�itmeni taraf�ndan verildi.");
	}
}
