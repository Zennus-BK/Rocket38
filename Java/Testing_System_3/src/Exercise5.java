public class Exercise5 {
//    Question 1:
//    In ra thông tin của phòng ban thứ 1 (sử dụng toString())
    public static void E5_Q1(Department d) {
        System.out.println("E5 Question 1");
        System.out.println(d.toString());
    }
//    Question 2:
//    In ra thông tin của tất cả phòng ban (sử dụng toString())
    public static void E5_Q2(Department[] d) {
        System.out.println("E5 Question 2");
        for (Department dep : d) {
            System.out.println(dep.toString());
        }
    }
//    Question 3:
//    In ra địa chỉ của phòng ban thứ 1
    public static void E5_Q3(Department d) {
        System.out.println("E5 Question 3");
        System.out.println(d.hashCode());
    }
//    Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
    public static void E5_Q4(Department d) {
        System.out.println("E5 Question 4");
        if (d.departmentname.equals("Phòng A")) {
            System.out.println("Là phòng A");
        }
        else {
            System.out.println("Không là phòng A");
        }
    }
//    Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
//    không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
    public static void E5_Q5(Department d1, Department d2) {
        System.out.println("E5 Question 5");
        if (d1.departmentname.equals(d2.departmentname)) {
            System.out.println("Bằng nhau");
        }
        else {
            System.out.println("Không bằng");
        }
    }
//    Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//    sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//    VD:
//    Accounting
//    Boss of director
//    Marketing
//    Sale
//    Waiting room
    public static void E5_Q6(Department[] d) {
        System.out.println("E5 Question 6");
        for (int i=0; i<d.length; i++) {
            for (int j=i+1; j<d.length; j++) {
                if (d[i].departmentname.compareToIgnoreCase(d[j].departmentname) > 0) {
                    Department tmp = d[i];
                    d[i] = d[j];
                    d[j] = tmp;
                }
            }
            System.out.println(d[i].toString());
        }
    }
//    Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh
//    sách phòng ban được sắp xếp theo tên
//    VD:
//    Accounting
//    Boss of director
//    Marketing
//    waiting room
//    Sale
    public static void E5_Q7(Department[] d) {
        System.out.println("E5 Question 7");
        String[] name = new String[d.length];
        for (int i=0; i<d.length; i++) {
            int index = d[i].departmentname.lastIndexOf(" ");
            name[i] = d[i].departmentname.substring(index+1);
        }
        for (int i=0; i<d.length; i++) {
            for (int j=i+1; j<d.length; j++) {
                if (name[i].compareToIgnoreCase(name[j]) > 0) {
                    String tmpname = name[i];
                    name[i] = name[j];
                    name[j] = tmpname;
                    Department tmpdep = d[i];
                    d[i] = d[j];
                    d[j] = tmpdep;
                }
            }
            System.out.println(d[i].toString());
        }
    }
}
