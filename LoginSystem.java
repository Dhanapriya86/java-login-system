import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "admin123";

        int attempts = 3;
        boolean loggedIn = false;

        System.out.println("=================================");
        System.out.println("         LOGIN SYSTEM");
        System.out.println("=================================");

        while (attempts > 0) {

            System.out.print("Username: ");
            String username = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername)
                    && password.equals(correctPassword)) {

                loggedIn = true;
                break;
            } else {
                attempts--;
                System.out.println("\nInvalid Credentials!");

                if (attempts > 0) {
                    System.out.println("Attempts Left: " + attempts);
                }
            }
        }

        if (loggedIn) {
            System.out.println("\nLogin Successful!");
            System.out.println("Welcome " + correctUsername + "!");
        } else {
            System.out.println("\nAccount Locked!");
            System.out.println("Maximum login attempts exceeded.");
        }

        sc.close();
    }
}
