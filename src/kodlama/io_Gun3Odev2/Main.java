package kodlama.io_Gun3Odev2;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Yeni Kullanıcı" , "yenikullanici@biremail.com");
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setFullName("Engin Demiroğ");
		instructor1.setEmail("engindemirog@birmail.com");
				
		Student student1 = new Student();
		student1.setId(3);
		student1.setFullName("Mf Cosar");
		student1.setEmail("biremail@hotmail.com");
		
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
