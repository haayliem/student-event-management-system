//User Model Class

package models;

//This model will represent a user (Student, Organizer, or Admin) who logs into the SEMS system
public class User {

	private int userID;
	private String firstName;
	private String lastName; 
	private String email;
	private String password; //just plain text
	private String role;  //role can be either student, organizer, or admin
	
//constructor
	public User(int userIDParam, String firstNameParam, String lastNameParam,
			String emailParam, String passwordParam, String roleParam)
	{
		userID = userIDParam;
		firstName = firstNameParam;
		lastName = lastNameParam;
		email = emailParam;
		password = passwordParam;
		role = roleParam;
	}
	
//Getter	
	public int getUserID()
	{
		return userID;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getRole()
	{
		return role;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	
//Setters	
	public void setFirstName(String firstNameParam)
	{
		firstName = firstNameParam;
	}
	
	public void setLastName(String lastNameParam)
	{
		lastName = lastNameParam;
	}
	
	public void setEmail(String emailParam)
	{
		email = emailParam;
	}
	
	public void setPassword(String passwordParam)
	{
		password = passwordParam;
	}
	
	public void setRole(String roleParam)
	{
		role = roleParam;
	}
	
//to show how the object looks when printed
	@Override
	public String toString()
	{
		return "User #" + userID + ": " + firstName + " " + lastName + " (" + role + ")";
	}
	
}
