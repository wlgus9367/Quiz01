import java.util.Scanner;
public class Username {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your Username");
		String username = keyboard.next();
		System.out.println("Enter your password");
		String password = keyboard.next();
		System.out.println("Hello " + username + ", Welcome to CSC200 class! and Your password is " + password + ".");
	}
}