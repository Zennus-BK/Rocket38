import java.util.Scanner;

public class Exercise4 {
//    Question 1:
//    Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//    thể cách nhau bằng nhiều khoảng trắng );
    public static void E4_Q1() {
        System.out.println("E4 Question 1");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] s1 = s.split(" ");
        int count = 0;
        for (String s2 : s1) {
            if (!s2.equals("")) {
                count++;
            }
        }
        System.out.println("Số từ là: " + count);
        sc.close();
    }
//    Question 2:
//    Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
    public static void E4_Q2() {
        System.out.println("E4 Question 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập xâu s1");
        String s1 = sc.nextLine();
        System.out.println("Nhập xâu s2");
        String s2 = sc.nextLine();
        System.out.println("s1 nối s2: " + s1.concat(s2));
        sc.close();
    }
//    Question 3:
//    Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa
//    viết hoa chữ cái đầu thì viết hoa lên
    public static void E4_Q3() {
        System.out.println("E4 Question 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine().trim();
        String upcase = name.substring(0,1).toUpperCase();
        System.out.println("Tên: " + upcase.concat(name.substring(1)));
        sc.close();
    }
//    Question 4:
//    Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
//    của người dùng ra
//    VD:
//    Người dùng nhập vào "Nam", hệ thống sẽ in ra
//        "Ký tự thứ 1 là: N"
//        "Ký tự thứ 1 là: A"
//        "Ký tự thứ 1 là: M"
    public static void E4_Q4() {
        System.out.println("E4 Question 4");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim().toUpperCase();
        for (int i=0; i<name.length(); i++) {
            System.out.println("Ký tự thứ " + (i+1) + " là: " + name.charAt(i));
        }
        sc.close();
    }
//    Question 5:
//    Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
//    dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
    public static void E4_Q5() {
        System.out.println("E4 Question 5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ");
        String ho = sc.nextLine().trim();
        System.out.println("Nhập tên");
        String ten = sc.nextLine().trim();
        System.out.println("Họ và tên: " + ho + " " + ten);
        sc.close();
    }
//    Question 6:
//    Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//    sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//    VD:
//    Người dùng nhập vào "Nguyễn Văn Nam"
//    Hệ thống sẽ in ra
//        "Họ là: Nguyễn"
//        "Tên đệm là: Văn"
//        "Tên là: Nam"
    public static void E4_Q6() {
        System.out.println("E4 Question 6");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên");
        String fullname = sc.nextLine().trim();
        String[] s = fullname.split(" ");
        int count = 1;
        for (int i=0; i<s.length; i++) {
            if (i==0) {
                System.out.println("Họ là: " + s[i]);
            }
            else if (i<s.length-1 && !s[i].equals("")) {
                System.out.println("Tên đệm thứ " + count + " là: " + s[i]);
                count++;
            }
            else if (i==s.length-1){
                System.out.println("Tên là: " + s[i]);
            }
        }
        sc.close();
    }
//    Question 7:
//    Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//    chuẩn hóa họ và tên của họ như sau:
//    a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập
//    vào
//    VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//    chuẩn hóa thành "nguyễn văn nam"
//    b) Viết hoa chữ cái mỗi từ của người dùng
//    VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//    chuẩn hóa thành "Nguyễn Văn Nam"
    public static void E4_Q7() {
        System.out.println("E4 Question 7");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên");
        String name = sc.nextLine().trim();
        while (name.contains("  ")) {
            name = name.replaceAll("  "," ");
        }
        String[] s = name.split(" ");
        String upcasename = "";
        for (String word : s) {
            upcasename = upcasename + word.substring(0,1).toUpperCase() + word.substring(1) + " ";
        }
        System.out.println("Họ và tên: " + upcasename.trim());
        sc.close();
    }
//    Question 8:
//    In ra tất cả các group có chứa chữ "Java"
    public static void E4_Q8() {
        System.out.println("E4 Question 8");
        String[] group = {"Java","Java basic","Java advance","PHP"};
        for (String s : group) {
            if (s.contains("Java")) {
                System.out.println(s);
            }
        }
    }
//    Question 9:
//    In ra tất cả các group "Java"
    public static void E4_Q9() {
        System.out.println("E4 Question 9");
        String[] group = {"Java","Java basic","Java advance","PHP"};
        for (String s : group) {
            if (s.equals("Java")) {
                System.out.println(s);
            }
        }
    }
//    Question 10 (Optional):
//    Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//    Nếu có xuất ra “OK” ngược lại “KO”.
//    Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
    public static void E4_Q10() {
        System.out.println("E4 Question 10");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất");
        String s1 = sc.nextLine().trim();
        System.out.println("Nhập chuỗi thứ hai");
        String s2 = sc.nextLine().trim();
        String reverses2 = "";
        char[] c = s2.toCharArray();
        for (int i = c.length-1; i>=0; i--) {
            reverses2+=c[i];
        }
        System.out.println(s1.equals(reverses2) ? "OK" : "KO");
        sc.close();
    }
//    Question 11 (Optional): Count special Character
//    Tìm số lần xuất hiện ký tự "a" trong chuỗi
    public static void E4_Q11() {
        System.out.println("E4 Question 11");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String s = sc.nextLine().trim();
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Số ký tự a: " + count);
        sc.close();
    }
//    Question 12 (Optional): Reverse String
//    Đảo ngược chuỗi sử dụng vòng lặp
    public static void E4_Q12() {
        System.out.println("E4 Question 12");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String s = sc.nextLine();
        String reverse = "";
        char[] c = s.toCharArray();
        for (int i = c.length-1; i>=0; i--) {
            reverse+=c[i];
        }
        System.out.println("Chuỗi đảo ngược: " + reverse);
        sc.close();
    }
//    Question 13 (Optional): String not contains digit
//    Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
//    lại true.
//    Ví dụ:
//            "abc" => true
//            "1abc", "abc1", "123", "a1bc", null => false
    public static void E4_Q13() {
        System.out.println("E4 Question 13");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String s = sc.nextLine();
        if (s == "") {
            System.out.println("false");
            return;
        }
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
        sc.close();
    }
//    Question 14 (Optional): Replace character
//    Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
//    cho trước.
//    Ví dụ:
//            "VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
    public static void E4_Q14() {
        System.out.println("E4 Question 14");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String s = sc.nextLine();
        System.out.println("Nhập ký tự cần đồi");
        String a = sc.next();
        System.out.println("Nhập ký tự thay thế");
        String b = sc.next();
        System.out.println("Chuỗi thay thế:" + s.replaceAll(a,b));
        sc.close();
    }
//    Question 15 (Optional): Revert string by word
//    Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
//    thư viện.
//    Ví dụ: " I am developer " => "developer am I".
//    Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//    Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
//    chuỗi theo dấu cách
    public static void E4_Q15() {
        System.out.println("E4 Question 15");
        Scanner sc = new Scanner(System.in);
        String[] s;
        System.out.println("Nhập xâu ký tự");
        s = sc.nextLine().trim().split(" ");
        String result = "";
        for (int i = s.length-1; i>=0; i--) {
            result = String.join(" ", result, s[i]);
        }
        System.out.println(result.trim());
        sc.close();
    }
//    Question 16 (Optional):
//    Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
//    bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn
//    hình “KO”.
    public static void E4_Q16() {
        System.out.println("E4 Question 16");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String s = sc.nextLine();
        System.out.println("Nhập số nguyên n:");
        int n = sc.nextInt();
        if (s.length()%n != 0 || s == "") {
            System.out.println("KO");
        }
        else {
            for (int i =0; i<s.length(); i+=n) {
                System.out.println(s.substring(i,i+n));
            }
        }
    }
}
