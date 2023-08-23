import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise_3 {
//    Question 1:
//    In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//    dạng vietnamese
    public static void Exercise3Question1(Exam e) {
        System.out.printf("Question 1");
        Locale locale = new Locale("vn", "VN");
        DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        Date date = java.sql.Date.valueOf(e.createDate);
        System.out.println("Id: " + e.examid + " Code: " + e.code + " Create date: " + dateformat.format(date));
    }
//    Question 2:
//    In ra thông tin: Exam đã tạo ngày nào theo định dạng
//    Năm – tháng – ngày – giờ – phút – giây
    public static void Exercise3Question2(Exam[] e) {
        System.out.println("Question 2");
        String pattern = "yyyy-MM-dd-HH-mm-ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        for (Exam exam : e) {
            Date date = java.sql.Date.valueOf(exam.createDate);
            System.out.println("Id: " + exam.examid + " Code: " + exam.code + " Create date: " + simpleDateFormat.format(date));
        }
    }
//    Question 3:
//    Chỉ in ra năm của create date property trong Question 2
    public static void Exercise3Question3(Exam[] e) {
        System.out.println("Question 3");
        String pattern = "yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        for (Exam exam : e) {
            Date date = java.sql.Date.valueOf(exam.createDate);
            System.out.println("Id: " + exam.examid + " Code: " + exam.code + " Create date: " + simpleDateFormat.format(date));
        }
    }
//    Question 4:
//    Chỉ in ra tháng và năm của create date property trong Question 2
    public static void Exercise3Question4(Exam[] e) {
        System.out.println("Question 4");
        String pattern = "MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        for (Exam exam : e) {
            Date date = java.sql.Date.valueOf(exam.createDate);
            System.out.println("Id: " + exam.examid + " Code: " + exam.code + " Create date: " + simpleDateFormat.format(date));
        }
    }
//    Question 5:
//    Chỉ in ra "MM-DD" của create date trong Question 2
    public static void Exercise3Question5(Exam[] e) {
        System.out.println("Question 5");
        String pattern = "MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        for (Exam exam : e) {
            Date date = java.sql.Date.valueOf(exam.createDate);
            System.out.println("Id: " + exam.examid + " Code: " + exam.code + " Create date: " + simpleDateFormat.format(date));
        }
    }
}
