package solution;


//PasswordReminder depends on the abstraction => DBConnectionInterface
//Any change in the impl class doesn't affect this class

public class PasswordReminder {
	private int dbConnection;
	
	public PasswordReminder(DBConnectionInterface dbConnection) {
		this.dbConnection = dbConnection.connect();
	}
}
