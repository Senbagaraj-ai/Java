package Day3;
// Example for if statement
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int val = sc.nextInt();
		if(val%3==0 && val%5==0) {
			System.out.println("This is Fizz and Bizz.");
		}
		else if(val%3 == 0) {
			System.out.println("This is Fizz.");
		}
		else if(val%5==0) {
			System.out.println("This is Bizz.");
		}
		
		else {
			System.out.println("It's Nothing.");
		}
		
	}

}
