import java.time.LocalDate;

public class Exercise2 {
    public static void E2_Q1() {
        System.out.println("E2 Question 1");
        Account[] acc = new Account[5];
        for (int i=0; i<acc.length; i++) {
            String tmp = Integer.valueOf(i+1).toString();
            acc[i] = new Account("Email ".concat(tmp), "User name ".concat(tmp), "Full name ".concat(tmp), LocalDate.now());
            System.out.println("Thông tin Account: Email: " + acc[i].email + " User name: " + acc[i].username + " Full name: " + acc[i].fullname + " Creat Day: " + acc[i].createdate);
        }
    }
}
