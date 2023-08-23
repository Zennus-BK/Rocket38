
public class Answer {
	int answerid;
	String content;
	Question question;
	boolean iscorrect;
	
	public Answer(int answerid, String content, Question question, boolean iscorrect) {
		this.answerid = answerid;
		this.content = content;
		this.question = question;
		this.iscorrect = iscorrect;
	}
}
