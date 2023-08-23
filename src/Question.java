import java.time.LocalDate;

public class Question {
	int questionid;
	String content;
	CategoryQuestion category;
	TypeQuestion type;
	Account creator;
	LocalDate createdate;
	
	public Question(int questionid,	String content,	CategoryQuestion category, TypeQuestion type, Account creator, LocalDate createdate) {
		this.questionid = questionid;
		this.content = content;
		this.category = category;
		this.type = type;
		this.creator = creator;
		this.createdate = createdate;
	}
}
