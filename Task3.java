package Day3;
//Example for if statement
import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		int a =sc.nextInt();
		if(18<=a) {
			System.out.println("Eligible to vote.");
			if(24<=a) {
				System.out.println("Eligible to Canditate.");
			}
		}
			else {
				System.out.println("Not Eligible.");
			}
			
		
		

	}

}
