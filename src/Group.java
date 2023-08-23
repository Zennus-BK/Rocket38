import java.time.LocalDate;

public class Group {
	int groupid;
	String groupname;
	Account creator;
	LocalDate createdate;
	Account[] account;

	public Group(int groupid, String groupname,	Account creator, LocalDate createdate) {
		this.groupid = groupid;
		this.groupname = groupname;
		this.creator = creator;
		this.createdate = createdate;
	}
}
