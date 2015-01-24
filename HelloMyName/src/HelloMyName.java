import java.util.Scanner;
public class HelloMyName {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = keyboard. nextInt();
		System.out.println("Enter your name");
		String name = keyboard.next();
		System.out.println("Hello Mr. or Ms. " + name + ". Your age is " + age + ".");
	}
}
