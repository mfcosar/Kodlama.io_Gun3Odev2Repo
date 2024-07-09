package kodlama.io_Gun3Odev2;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Yeni Kullanıcı" , "yenikullanici@biremail.com");
		User instructor1 = new User(2, "Engin Demiroğ", "engindemirog@birmail.com");
		User student1 = new User(3, "Mf Cosar", "biremail@hotmail.com");
		
		User[] users = new User[] {user1, instructor1, student1};
		
		for (User user: users) {
			System.out.println(user.getFullName());
		}
		
		UserManager[] userManagers = new UserManager[] {new UserManager(), new InstructorManager(), new StudentManager()};
		
		for(UserManager userManager: userManagers) {
			userManager.add();
		}
		
	}

}
