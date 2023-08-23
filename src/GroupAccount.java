import java.time.LocalDate;

public class GroupAccount {
	Group group;
	Account account;
	LocalDate joindate;
	
	public GroupAccount(Group group, Account account, LocalDate joindate) {
		this.group = group;
		this.account = account;
		this.joindate = joindate;
	}
}
