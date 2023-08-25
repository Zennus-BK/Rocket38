public class Exercise3 {
//    Question 1:
//    Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//    Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//    float có 2 số sau dấu thập phân)
    public static void E3_Q1() {
        System.out.println("E3 Question 1");
        Integer Salary = 5000;
        System.out.printf("Lương: %.2f",(float) Salary);
    }
//    Question 2:
//    Khai báo 1 String có value = "1234567"
//    Hãy convert String đó ra số int
    public static void E3_Q2() {
        System.out.println("E3 Question 2");
        String s = "1234567";
        int i = Integer.parseInt(s);
        System.out.println("i");
    }
//    Question 3:
//    Khởi tạo 1 số Integer có value là chữ "1234567"
//    Sau đó convert số trên thành datatype int
    public static void E3_Q3() {
        System.out.println("E3 Question 3");
        Integer i = 1234567;
        int j = i.intValue();
        System.out.println(j);
    }
}
