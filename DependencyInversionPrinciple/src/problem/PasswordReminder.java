package problem;


//PasswordReminder depends on the MySqlConnection concrete class
//PasswordReminder shouldn't care about the which database we are using
public class PasswordReminder {
	private int dbConnection;
	
	public PasswordReminder(MySqlConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
}
