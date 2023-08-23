import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main (String[] args) {
//      Thêm data
        Department d1 = new Department(1, "Marketing");
        Department d2 = new Department(2, "Sale");
        Department d3 = new Department(3, "Finance");

        Position p1 = new Position(1, "Giám đốc");
        Position p2 = new Position(2, "DEV");
        Position p3 = new Position(3, "Thư ký");

        Account a1 = new Account(1, "vana@gmail.com", "vana", "Trần Văn A", d1, p2, LocalDate.parse("2011-01-01"));
        Account a2 = new Account(2, "vanb@gmail.com", "vanb", "Trần Văn B", d2, p3, LocalDate.parse("2011-02-02"));
        Account a3 = new Account(3, "vanc@gmail.com", "vanc", "Trần Văn C", d3, p1, LocalDate.parse("2011-03-03"));

        Group g1 = new Group(1, "A", a1, LocalDate.parse("2011-01-02"));
        Group g2 = new Group(1, "B", a2, LocalDate.parse("2011-02-03"));
        Group g3 = new Group(1, "C", a3, LocalDate.parse("2011-03-04"));

        GroupAccount ga1 = new GroupAccount(g1, a2, LocalDate.parse("2011-01-03"));
        GroupAccount ga2 = new GroupAccount(g2, a3, LocalDate.parse("2011-02-04"));
        GroupAccount ga3 = new GroupAccount(g3, a1, LocalDate.parse("2011-03-05"));

        TypeQuestion tq1 = new TypeQuestion(1, "Essay");
        TypeQuestion tq2 = new TypeQuestion(2, "Multiple-Choice");

        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");
        CategoryQuestion cq2 = new CategoryQuestion(2, "PHP");
        CategoryQuestion cq3 = new CategoryQuestion(3, "SQL");

        Question q1 = new Question(1, "abc", cq1, tq1, a1, LocalDate.parse("2012-05-01"));
        Question q2 = new Question(2, "def", cq2, tq2, a2, LocalDate.parse("2012-05-02"));
        Question q3 = new Question(3, "ghj", cq3, tq1, a3, LocalDate.parse("2012-05-03"));

        Answer an1 = new Answer(1, "abc", q1, true);
        Answer an2 = new Answer(2, "def", q2, false);
        Answer an3 = new Answer(3, "ghj", q3, true);


        Exam e1 = new Exam(1, 201, "abc", cq1, 60, a1, LocalDate.parse("2012-06-01"));
        Exam e2 = new Exam(2, 202, "def", cq2, 90, a1, LocalDate.parse("2012-06-02"));
        Exam e3 = new Exam(3, 203, "ghj", cq3, 120, a3, LocalDate.parse("2012-06-03"));

        ExamQuestion eq1 = new ExamQuestion(e1, q2);
        ExamQuestion eq2 = new ExamQuestion(e2, q3);
        ExamQuestion eq3 = new ExamQuestion(e3, q1);

        Account[] acc = {a1, a2, a3};
        Department[] dep = {d1, d2, d3};
        Exam[] exam = {e1, e2, e3};

//      Test
//        Exercise_1.Exercise1Question1(a2);
//        Exercise_1.Exercise1Question2(a2);
//        Exercise_1.Exercise1Question3(a2);
//        Exercise_1.Exercise1Question4(a1);
//        Exercise_1.Exercise1Question5(g1);
//        Exercise_1.Exercise1Question6(a2);
//        Exercise_1.Exercise1Question7(a1);
//        Exercise_1.Exercise1Question8(acc);
//        Exercise_1.Exercise1Question9(dep);
//        Exercise_1.Exercise1Question10(acc);
//        Exercise_1.Exercise1Question11(dep);
//        Exercise_1.Exercise1Question12(dep);
//        Exercise_1.Exercise1Question13(acc);
//        Exercise_1.Exercise1Question14(acc);
//        Exercise_1.Exercise1Question15();
//        Exercise_1.Exercise1Question16_10(acc);
//        Exercise_1.Exercise1Question16_11(dep);
//        Exercise_1.Exercise1Question16_12(dep);
//        Exercise_1.Exercise1Question16_13(acc);
//        Exercise_1.Exercise1Question16_14(acc);
//        Exercise_1.Exercise1Question16_15();
//        Exercise_1.Exercise1Question17_10(acc);
//        Exercise_1.Exercise1Question17_11(dep);
//        Exercise_1.Exercise1Question17_12(dep);
//        Exercise_1.Exercise1Question17_13(acc);
//        Exercise_1.Exercise1Question17_14(acc);
//        Exercise_1.Exercise1Question17_15();
//        Exercise_2.Exercise2Question1();
//        Exercise_2.Exercise2Question2();
//        Exercise_2.Exercise2Question3();
//        Exercise_2.Exercise2Question4();
//        Exercise_2.Exercise2Question5();
//        Exercise_2.Exercise2Question6(acc);
//        Exercise_3.Exercise3Question1(e1);
//        Exercise_3.Exercise3Question2(exam);
//        Exercise_3.Exercise3Question3(exam);
//        Exercise_3.Exercise3Question4(exam);
//        Exercise_3.Exercise3Question5(exam);
//        Exercise_4.Exercise4Question1();
//        Exercise_4.Exercise4Question2();
//        Exercise_4.Exercise4Question3();
//        Exercise_4.Exercise4Question4();
//        Exercise_4.Exercise4Question5();
//        Exercise_4.Exercise4Question6();
//        Exercise_4.Exercise4Question7();
        Exercise_5.Exercise5Question8();
    }
}
