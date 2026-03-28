import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Set your password: ");
        String password = sc.nextLine();

        System.out.print("Enter password to login: ");
        String input = sc.nextLine();

        if (password.equals(input)) {
            System.out.println("Access Granted ✅");
        } else {
            System.out.println("Wrong Password ❌");
        }

        sc.close();
    }
}