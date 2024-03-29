package Bus;

public abstract class User{
	private String firstName;
	private String lastName; 
	private String email; 
	private String password; 
	private String userID;
	private String profilePicture;
	
	public User(String userID, String firstName, String lastName, String email, String password, String profilePicture) {
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.email = email; 
		this.password = password; 
		this.userID = userID;
		this.profilePicture = profilePicture;
	}

	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public void setPassword(String password) {
		this.password = password;
	}


	public String getProfilePicture() {
		return profilePicture;
	}


	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	
}
