import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise_2 {
//    Question 1:
//    Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//    nguyên đó
    public static void Exercise2Question1() {
        System.out.println("Question 1");
        int i = 5;
        System.out.printf("%d%n",i);
    }
//    Question 2:
//    Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//    ra số nguyên đó thành định dạng như sau: 100,000,000
    public static void Exercise2Question2() {
        System.out.println("Question 2");
        int i = 100000000;
        System.out.printf("%,d%n", i);
    }
//    Question 3:
//    Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//    thực đó chỉ bao gồm 4 số đằng sau
    public static void Exercise2Question3() {
        float f = 5.567098f;
        System.out.printf("%.4f%n",f);
    }
//    Question 4:
//    Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//    dạng như sau:
//    Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//    Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
    public static void Exercise2Question4() {
        String name = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân%n", name);
    }
//    Question 5:
//    Lấy thời gian bây giờ và in ra theo định dạng sau:
//            24/04/2020 11h:16p:20s
    public static void Exercise2Question5() {
        String pattern = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat DateFormat = new SimpleDateFormat(pattern);
        String date = DateFormat.format(new Date());
        System.out.printf("%s%n",date);
    }
//    Question 6:
//    In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
//    table (giống trong Database)
    public static void Exercise2Question6(Account[] a) {
        System.out.printf("%-5s%-20s%-15s%-15s%n","Id","Email","Full Name","Phòng Ban");
        for (Account acc : a) {
            System.out.printf("%-5d%-20s%-15s%-15s%n",acc.accountid,acc.email,acc.fullname,acc.department.departmentname);
        }
    }
}
