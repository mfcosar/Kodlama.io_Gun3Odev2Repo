package kodlama.io_Gun3Odev2;

public class User {

		private int id;
		private String fullName;
		private String email;
		private String password;

		public User() {
			
		}		

		public User(int id, String fullName, String email) {
			super();
			this.id = id;
			this.fullName = fullName;
			this.email = email;
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		

		
		
}
