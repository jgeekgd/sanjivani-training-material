package constructors;

public class User {
	private char username;
	private String password;
	private String gender;

	public User() {

	}

	public User(char username, String password, String gender) {
		this.username = username;
		this.password = password;
		this.gender = gender;
	}

	public User(String password, String gender) {
		this.password = password;
		this.gender = gender;
	}

	public User(char username) {
		this("Passw0rd", "Unknown");
		this.username = username;
	}

	public char getUsername() {
		return username;
	}

	public void setUsername(char username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
