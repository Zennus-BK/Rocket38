import java.time.LocalDate;

public class Account {
	String email;
	String username;
	String fullname;
	LocalDate createdate;
	public Account(String email, String username, String fullname, LocalDate createdate) {
		this.email = email;
		this.username = username;
		this.fullname = fullname;
		this.createdate = createdate;
	}
}

