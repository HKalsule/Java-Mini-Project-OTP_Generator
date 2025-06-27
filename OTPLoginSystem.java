import java.util.*;

class OTPLoginSystem {
    public static void main(String[] args) {
        int length = 10;
        Scanner sc = new Scanner(System.in);

        char[] generatedPassword = Password(length);
        String correctPassword = new String(generatedPassword); 

        int attempts = 3;
        boolean isAuthenticated = false;

        while (attempts > 0) {
            System.out.println("\nEnter the password to login (Attempts left: " + attempts + "):");
            String userInput = sc.nextLine();

            if (userInput.equals(correctPassword)) {
                isAuthenticated = true;
                break;
            } else {
                System.out.println("Incorrect password ");
                attempts--;
            }
        }


        if (isAuthenticated) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Access denied. Too many failed attempts.");
        }

        sc.close();
    }

    static char[] Password(int len) {
        System.out.println("Generating password using random():");
        System.out.print("Your new password is: ");

        String Capital_letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_letters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String values = Capital_letters + Small_letters + numbers + symbols;

        Random random_method = new Random();
        char[] password = new char[len];

        for (int i = 0; i < len; i++) {
            password[i] = values.charAt(random_method.nextInt(values.length()));
        }

        System.out.println(new String(password));
        return password;
    }
}
