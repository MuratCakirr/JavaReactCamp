
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanýcý eklendi");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			this.add(user);
		}
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý kullanýcý silindi");
	}
}
