import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class Exercise_4 {
//    Question 1:
//    In ngẫu nhiên ra 1 số nguyên
    public static void Exercise4Question1() {
        System.out.println("Question 1");
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);
    }
//    Question 2:
//    In ngẫu nhiên ra 1 số thực
    public static void Exercise4Question2() {
        System.out.println("Question 2");
        Random random = new Random();
        float f = random.nextFloat();
        System.out.println(f);
    }
//    Question 3:
//    Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên
//    ra tên của 1 bạn
    public static void Exercise4Question3() {
        System.out.println("Question 3");
        String[] name = {"Chi", "Dũng", "Hùng", "Hương", "Mai"};
        Random random = new Random();
        System.out.println(name[random.nextInt(name.length)]);
    }
//    Question 4:
//    Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
    public static void Exercise4Question4() {
        System.out.println("Question 4");
        int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
        Random random = new Random();
        System.out.println(LocalDate.ofEpochDay(minDay + random.nextInt(maxDay-minDay)));
    }
//    Question 5:
//    Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
    public static void Exercise4Question5() {
        System.out.println("Question 5");
        int currentDate = (int) LocalDate.now().toEpochDay();
        Random random = new Random();
        System.out.println(LocalDate.ofEpochDay(currentDate-random.nextInt(365)));
    }
//    Question 6:
//    Lấy ngẫu nhiên 1 ngày trong quá khứ
    public static void Exercise4Question6() {
        System.out.println("Question 6");
        int currentDate = (int) LocalDate.now().toEpochDay();
        Random random = new Random();
        System.out.println(LocalDate.ofEpochDay(random.nextInt(currentDate)));
    }
//    Question 7:
//    Lấy ngẫu nhiên 1 số có 3 chữ số
    public static void Exercise4Question7() {
        System.out.println("Question 7");
        Random random = new Random();
        int i = 100 + random.nextInt(900);
        System.out.println(i);
    }
}
