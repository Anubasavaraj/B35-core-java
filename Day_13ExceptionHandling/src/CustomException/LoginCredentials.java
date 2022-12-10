package CustomException;

public class LoginCredentials extends Exception {

	

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String id;
		private String password;

		

		public LoginCredentials(String id, String password) {
			super();
			this.id = id;
			this.password = password;
		}



		@Override
		public String toString() {
			return "LoginCredentials [id=" + id + ", password=" + password + "]";

	}

}
