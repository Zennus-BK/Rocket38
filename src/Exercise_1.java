public class Exercise_1 {
    //		Question 1:
//		Kiểm tra account thứ 2
//		Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
//		"Nhân viên này chưa có phòng ban"
//		Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."
    public static void Exercise1Question1(Account a) {
        System.out.println("Question 1");
        if (a.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        }
        else {
            System.out.println("Phòng ban của nhân viên này là: " + a.department.departmentname);
        }
    }

    //		Question 2:
//		Kiểm tra account thứ 2
//		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//		này là Java Fresher, C# Fresher"
//		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//		quan trọng, tham gia nhiều group"
//		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//		người hóng chuyện, tham gia tất cả các group"
    public static void Exercise1Question2(Account a) {
        System.out.println("Question 2");
        if (a.group == null || a.group.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        }
        else if (a.group.length > 0 && a.group.length < 3) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        }
        else if (a.group.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        }
        else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    //		Question 3:
//		Sử dụng toán tử ternary để làm Question 1
    public static void Exercise1Question3(Account a) {
        System.out.println("Question 3");
        System.out.println(a.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là: " + a.department.departmentname);
    }

    //		Question 4:
//		Sử dụng toán tử ternary để làm yêu cầu sau:
//		Kiểm tra Position của account thứ 1
//		Nếu Position = Dev thì in ra text "Đây là Developer"
//		Nếu không phải thì in ra text "Người này không phải là Developer"
    public static void Exercise1Question4(Account a) {
        System.out.println("Question 4");
        System.out.println(a.position.positionname.equalsIgnoreCase("Dev") ? "Đây là Developer" : "Người này không phải Developer");
    }
//		SWITCH CASE
//		Question 5:
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//		Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//		Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//		Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//		Còn lại in ra "Nhóm có nhiều thành viên"
    public static void Exercise1Question5(Group g) {
        System.out.println("Question 5");
        if (g.account == null || g.account.length == 0) {
            System.out.println("Nhóm không có thành viên");
        }
        else {
            switch (g.account.length) {
                case 1:
                    System.out.println("Nhóm có một thành viên");
                    break;
                case 2:
                    System.out.println("Nhóm có hai thành viên");
                    break;
                case 3:
                    System.out.println("Nhóm có ba thành viên");
                    break;
                default:
                    System.out.println("Nhómc có nhiều thành viên");
                    break;
            }
        }
    }
//		Question 6:
//		Sử dụng switch case để làm lại Question 2
    public static void Exercise1Question6(Account a) {
        System.out.println("Question 6");
        if (a.group == null || a.group.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        }
        else {
            switch (a.group.length) {
                case 1:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 2:
                    System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                    break;
                case 3:
                    System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                    break;
                default:
                    System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                    break;

            }
        }
    }
//		Question 7:
//		Sử dụng switch case để làm lại Question 4
    public static void Exercise1Question7(Account a) {
        System.out.println("Question 7");
        switch (a.position.positionname) {
            case "Dev":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải Developer");
                break;
        }
    }
//		FOREACH
//		Question 8:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ
    public static void Exercise1Question8(Account[] a) {
        System.out.println("Question 8");
        for (Account acc : a) {
            System.out.println("AccountID: " + acc.accountid + "     Email: " + acc.email + "     Fullname: " + acc.fullname + "     Phòng ban: " + acc.department.departmentname);
        }
    }
//		Question 9:
//		In ra thông tin các phòng ban bao gồm: id và name
    public static void Exercise1Question9(Department[] d) {
        System.out.println("Question 9");
        for (Department dep : d) {
            System.out.println("DepartmentID: " + dep.departmentid +"    Department Name: " + dep.departmentname);
        }
    }
//		FOR
//		Question 10:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
//		Thông tin account thứ 2 là:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyễn Văn B
//		Phòng ban: Marketting
    public static void Exercise1Question10(Account[] a) {
        System.out.println("Question 10");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Thông tin account thứ %d là:%n", i+1);
            System.out.println("Email: " + a[i].email);
            System.out.println("Full name: " + a[i].fullname);
            System.out.println("Phòng ban: " + a[i].department.departmentname);
        }
    }
//		Question 11:
//		In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//		Thông tin department thứ 1 là:
//		Id: 1
//		Name: Sale
//		Thông tin department thứ 2 là:
//		Id: 2
//		Name: Marketing
    public static void Exercise1Question11(Department[] d) {
        System.out.println("Question 11");
        for (int i=0; i<d.length; i++) {
            System.out.printf("Thông tin department thứ %d là:%n", i+1);
            System.out.println("Id: " + d[i].departmentid);
            System.out.println("Name: " + d[i].departmentname);
        }
    }
//		Question 12:
//		Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
    public static void Exercise1Question12(Department[] d) {
        System.out.println("Question 12");
        for (int i=0; i<2; i++) {
            System.out.printf("Thông tin department thứ %d là:%n", i+1);
            System.out.println("Id: " + d[i].departmentid);
            System.out.println("Name: " + d[i].departmentname);
        }
    }
//		Question 13:
//		In ra thông tin tất cả các account ngoại trừ account thứ 2
    public static void Exercise1Question13(Account[] a) {
        System.out.println("Question 13");
        for (int i = 0; i < a.length; i++) {
            if (i==1) {continue;}
            System.out.printf("Thông tin account thứ %d là:%n", i+1);
            System.out.println("Email: " + a[i].email);
            System.out.println("Full name: " + a[i].fullname);
            System.out.println("Phòng ban: " + a[i].department.departmentname);
        }
    }
//		Question 14:
//		In ra thông tin tất cả các account có id < 4
    public static void Exercise1Question14(Account[] a) {
        System.out.println("Question 14");
        for (int i = 0; i < a.length; i++) {
            if (a[i].accountid > 3) {continue;}
            System.out.printf("Thông tin account thứ %d là:%n", i+1);
            System.out.println("Email: " + a[i].email);
            System.out.println("Full name: " + a[i].fullname);
            System.out.println("Phòng ban: " + a[i].department.departmentname);
        }
    }
//		Question 15:
//		In ra các số chẵn nhỏ hơn hoặc bằng 20
    public static void Exercise1Question15() {
        System.out.println("Question 15");
        for (int i=0; i<21; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
//		WHILE
//		Question 16:
//		Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//		lệnh break, continue
    public static void Exercise1Question16_10(Account[] a) {
        System.out.println("Question 16.10");
        int i = 0;
        while (i<a.length) {
            System.out.printf("Thông tin account thứ %d là:%n", i+1);
            System.out.println("Email: " + a[i].email);
            System.out.println("Full name: " + a[i].fullname);
            System.out.println("Phòng ban: " + a[i].department.departmentname);
            i++;
        }
    }
    public static void Exercise1Question16_11(Department[] d) {
        System.out.println("Question 16.11");
        int i = 0;
        while (i<d.length) {
            System.out.printf("Thông tin department thứ %d là:%n", i+1);
            System.out.println("Id: " + d[i].departmentid);
            System.out.println("Name: " + d[i].departmentname);
            i++;
        }
    }
    public static void Exercise1Question16_12(Department[] d) {
        System.out.println("Question 16.12");
        int i = 0;
        while (i<2) {
            System.out.printf("Thông tin department thứ %d là:%n", i+1);
            System.out.println("Id: " + d[i].departmentid);
            System.out.println("Name: " + d[i].departmentname);
            i++;
        }
    }
    public static void Exercise1Question16_13(Account[] a) {
        System.out.println("Question 16.13");
        int i = 0;
        while (i<a.length) {
            if (i==1) {
                i++;
                continue;}
            System.out.printf("Thông tin account thứ %d là:%n", i+1);
            System.out.println("Email: " + a[i].email);
            System.out.println("Full name: " + a[i].fullname);
            System.out.println("Phòng ban: " + a[i].department.departmentname);
            i++;
        }
    }
    public static void Exercise1Question16_14(Account[] a) {
        System.out.println("Question 16.14");
        int i = 0;
        while (i<a.length) {
            if (a[i].accountid > 3) {
                i++;
                continue;
            }
            System.out.printf("Thông tin account thứ %d là:%n", i + 1);
            System.out.println("Email: " + a[i].email);
            System.out.println("Full name: " + a[i].fullname);
            System.out.println("Phòng ban: " + a[i].department.departmentname);
            i++;
        }
    }
    public static void Exercise1Question16_15() {
        System.out.println("Question 16.15");
        int i = 0;
        while (i<=20) {
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
//		DO-WHILE
//		Question 17:
//		Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
//		lệnh break, continue
    public static void Exercise1Question17_10(Account[] a) {
        System.out.println("Question 17.10");
        int i = 0;
        do {
            System.out.printf("Thông tin account thứ %d là:%n", i+1);
            System.out.println("Email: " + a[i].email);
            System.out.println("Full name: " + a[i].fullname);
            System.out.println("Phòng ban: " + a[i].department.departmentname);
            i++;
        }
        while (i<a.length);
    }
    public static void Exercise1Question17_11(Department[] d) {
        System.out.println("Question 17.11");
        int i = 0;
        do {
            System.out.printf("Thông tin department thứ %d là:%n", i+1);
            System.out.println("Id: " + d[i].departmentid);
            System.out.println("Name: " + d[i].departmentname);
            i++;
        }
        while (i<d.length);
    }
    public static void Exercise1Question17_12(Department[] d) {
        System.out.println("Question 17.12");
        int i = 0;
        do {
            System.out.printf("Thông tin department thứ %d là:%n", i+1);
            System.out.println("Id: " + d[i].departmentid);
            System.out.println("Name: " + d[i].departmentname);
            i++;
        }
        while (i<2);
    }
    public static void Exercise1Question17_13(Account[] a) {
        System.out.println("Question 17.13");
        int i = 0;
        do {
            if (i==1) {
                i++;
                continue;}
            System.out.printf("Thông tin account thứ %d là:%n", i+1);
            System.out.println("Email: " + a[i].email);
            System.out.println("Full name: " + a[i].fullname);
            System.out.println("Phòng ban: " + a[i].department.departmentname);
            i++;
        }
        while (i<a.length);
    }
    public static void Exercise1Question17_14(Account[] a) {
        System.out.println("Question 17.14");
        int i = 0;
        do {
            if (a[i].accountid > 3) {
                i++;
                continue;
            }
            System.out.printf("Thông tin account thứ %d là:%n", i + 1);
            System.out.println("Email: " + a[i].email);
            System.out.println("Full name: " + a[i].fullname);
            System.out.println("Phòng ban: " + a[i].department.departmentname);
            i++;
        }
        while (i<a.length);
    }
    public static void Exercise1Question17_15() {
        System.out.println("Question 17.15");
        int i = 0;
        do {
            if (i%2==0) {
                System.out.println(i);
            }
            i++;
        }
        while (i<=20);
    }
}
