import java.time.LocalDate;
import java.util.Scanner;

public class Exercise_5 {
//    Question 1:
//    Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
    public static void Exercise5Question1() {
        System.out.println("Question 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 3 số nguyên");
        System.out.println("Nhập vào số 1: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào số 2: ");
        int b = sc.nextInt();
        System.out.println("Nhập vào số 3: ");
        int c = sc.nextInt();
        System.out.println("Các số vừa nhập: " + a + " " + b + " " + c);
    }
//    Question 2:
//    Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
    public static void Exercise5Question2() {
        System.out.println("Question 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 2 số thực");
        System.out.println("Nhập vào số 1: ");
        float a = sc.nextFloat();
        System.out.println("Nhập vào số 2: ");
        float b = sc.nextFloat();
        System.out.println("Các số vừa nhập: " + a + " " + b);
    }
//    Question 3:
//    Viết lệnh cho phép người dùng nhập họ và tên
    public static void Exercise5Question3() {
        System.out.println("Question 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên:");
        String s = sc.nextLine();
        System.out.println("Họ và tên: " + s);
    }
//    Question 4:
//    Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
    public static void Exercise5Question4() {
        System.out.println("Question 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày sinh");
        int day = sc.nextInt();
        System.out.println("Nhập tháng sinh");
        int month = sc.nextInt();
        System.out.println("Nhập năm sinh");
        int year = sc.nextInt();
        LocalDate date = LocalDate.of(year,month,day);
        System.out.println("Sinh nhật: " + date);
    }
//    Question 5:
//    Viết lệnh cho phép người dùng tạo account (viết thành method)
//    Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//    chương trình sẽ chuyển thành Position.Dev, Position.Test,
//    Position.ScrumMaster, Position.PM
    public static void Exercise5Question5() {
        System.out.println("Question 5");
        System.out.println("Nhập thông tin Account");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID");
        int id = sc.nextInt();
        System.out.println("Nhập email");
        String email = sc.next();
        System.out.println("Nhập username");
        String user = sc.next();
        System.out.println("Nhập fullname");
        String fullname = sc.next();
        System.out.println("Nhập vị trí tương ứng 1.Dev, 2.Test, 3.Scrum_Master, 4.PM");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                Position p1 = new Position(1,"Dev");
                Account a1 = new Account(id,email,user,fullname,null,p1,null);
                System.out.println("ID: " + a1.accountid + " Email: " + a1.email + " User: " + a1.username + " Full name: " + a1.fullname + " Postion: " + a1.position.positionname);
                break;
            case 2:
                Position p2 = new Position(2,"Test");
                Account a2 = new Account(id,email,user,fullname,null,p2,null);
                System.out.println("ID: " + a2.accountid + " Email: " + a2.email + " User: " + a2.username + " Full name: " + a2.fullname + " Postion: " + a2.position.positionname);
                break;
            case 3:
                Position p3 = new Position(3,"Scrum_Master");
                Account a3 = new Account(id,email,user,fullname,null,p3,null);
                System.out.println("ID: " + a3.accountid + " Email: " + a3.email + " User: " + a3.username + " Full name: " + a3.fullname + " Postion: " + a3.position.positionname);
                break;
            case 4:
                Position p4 = new Position(4,"PM");
                Account a4 = new Account(id,email,user,fullname,null,p4,null);
                System.out.println("ID: " + a4.accountid + " Email: " + a4.email + " User: " + a4.username + " Full name: " + a4.fullname + " Postion: " + a4.position.positionname);
                break;
        }
    }

//    Question 6:
//    Viết lệnh cho phép người dùng tạo department (viết thành method)
    public static void Exercise5Question6() {
        System.out.println("Question 6");
        System.out.println("Nhập thông tin department");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        int id = sc.nextInt();
        System.out.println("Nhập tên");
        String name = sc.next();
        Department d = new Department(id,name);
        System.out.println("Id: " + d.departmentid + " Tên " + d.departmentname);
    }
//    Question 7:
//    Nhập số chẵn từ console
    public static void Exercise5Question7() {
        System.out.println("Question 7");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập số chẵn");
            int i = sc.nextInt();
            if (i%2==0) {
                System.out.println("Số vừa nhập: " + i);
                break;
            }
            else {
                System.out.println("Không phải số chắn");
            }
        }
    }
//    Question 8:
//    Viết chương trình thực hiện theo flow sau:
//    Bước 1:
//    Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
//    dụng"
//    Bước 2:
//    Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//    Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//            department
//    Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//    lại" và quay trở lại bước 1
//
//    Question 9:
//    Viết method cho phép người dùng thêm group vào account theo flow sau:
//    Bước 1:
//    In ra tên các usernames của user cho người dùng xem
//    Bước 2:
//    Yêu cầu người dùng nhập vào username của account
//    Bước 3:
//    In ra tên các group cho người dùng xem
//    Bước 4:
//    Yêu cầu người dùng nhập vào tên của group
//    Bước 5:
//    Dựa vào username và tên của group người dùng vừa chọn, hãy
//    thêm account vào group đó .
//            Question 10: Tiếp tục Question 8 và Question 9
//    Bổ sung thêm vào bước 2 của Question 8 như sau:
//    Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
//            account
//    Bổ sung thêm Bước 3 của Question 8 như sau:
//    Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
//    text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
//    không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
//    dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để
//            kết thúc chương trình)
//    Question 11: Tiếp tục Question 10
//    Bổ sung thêm vào bước 2 của Question 8 như sau:
//    Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account
//    vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
//    Bước 1:
//    In ra tên các usernames của user cho người dùng xem
//
//6
//
//    Bước 2:
//    Yêu cầu người dùng nhập vào username của account
//    Bước 3:
//    Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
//    Bước 4:
//    Thêm account vào group chương trình vừa chọn ngẫu
//            nhiên
}
