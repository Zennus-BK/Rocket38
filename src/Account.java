import java.time.LocalDate;

public class Account {
	int accountid;
	String email;
	String username;
	String fullname;
	Department department;
	Position position;
	LocalDate createdate;
	Group [] group;
	
	public Account(int accountid, String email, String username, String fullname, Department department, Position position, LocalDate createdate) {
		this.accountid = accountid;
		this.email = email;
		this.username = username;
		this.fullname = fullname;
		this.department = department;
		this.position = position;
		this.createdate = createdate;
	}
}

