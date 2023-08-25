import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
//    Question 1:
//    Khai báo 2 số lương có kiểu dữ liệu là float.
//    Khởi tạo Lương của Account 1 là 5240.5 $
//    Khởi tạo Lương của Account 2 là 10970.055$
//    Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//    Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
    public static void E1_Q1() {
        System.out.println("E1 Question 1");
        float Salary1 = 5240.5f;
        float Salary2 = 10970.055f;
        int intSalary1 = (int) Salary1;
        int intSalary2 = (int) Salary2;
        System.out.println("lương làm tròn Account 1: " + intSalary1 + " Account 2: " + intSalary2);
    }
//    Question 2:
//    Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//    có số 0 ở đầu cho đủ 5 chữ số)
    public static void E1_Q2() {
        System.out.println("E1 Question 2");
        Random random = new Random();
        int i = random.nextInt(99999);
        String s = Integer.valueOf(i).toString();
        for (int j = 5 - String.valueOf(i).toCharArray().length; j>0; j--) {
            s = "0".concat(s);
        }
        System.out.println(s);
    }
//    Question 3:
//    Lấy 2 số cuối của số ở Question 2 và in ra.
//    Gợi ý:
//    Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//    Cách 2: chia lấy dư số đó cho 100
    public static void E1_Q3() {
        System.out.println("E1 Question 3");
        Random random = new Random();
        int i = random.nextInt(99999);
        System.out.println("Số random: " + i);
        System.out.println("2 số cuối:" + String.valueOf(i).substring(3));
    }
//    Question 4:
//    Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
    public static void E1_Q4() {
        System.out.println("E1 Question 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a");
        int a = sc.nextInt();
        int b;
        while (true) {
            System.out.println("Nhập số nguyên b khác 0");
            b = sc.nextInt();
            if (b==0) {
                System.out.println("Nhập lại");
            }
            else {break;}
        }
        System.out.println("Thương :" + a/b);
        sc.close();
    }
}
