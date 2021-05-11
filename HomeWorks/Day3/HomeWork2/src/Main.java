public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.seteMail("engin.demirog@hotmail.com");
		instructor1.setId(12345);
		instructor1.setGivenCourse("Java React Camp");
		
		Student student1 = new Student();
		student1.setFirstName("Murat");
		student1.setLastName("Çakır");
		student1.seteMail("murat-cakir@outlook.com.tr");
		student1.setId(67891);
		student1.setTakenCourse("Java React Camp");
		
		System.out.println("Tek tek ekleme \n");
		
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.add(student1);
		userManager.delete(student1);
		
		System.out.println("\nÇoklu ekleme \n");
		
		User[] users = {instructor1,student1}; 
		userManager.addMultiple(users);
		
		StudentManager studentManager = new StudentManager();
		studentManager.takeCourse(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.giveCourse(instructor1);
		
	}

}
