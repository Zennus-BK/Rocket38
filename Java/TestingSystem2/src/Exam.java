import java.time.LocalDate;

public class Exam {
	int examid;
	int code;
	String title;
	CategoryQuestion category;
	int duration;
	Account creator;
	LocalDate createDate;
	Question[] question;
	
	public Exam(int examid, int code, String title, CategoryQuestion category, int duration, Account creator, LocalDate createdate) {
		this.examid = examid;
		this.code = code;
		this.title = title;
		this.category = category;
		this.duration = duration;
		this.creator = creator;
		this.createDate = createdate;
	}
}
