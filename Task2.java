package Day3;
//Example for if statement
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Mark : ");
		int a= scan.nextInt();
		if(100>=a && a>=90) {
			System.out.println("Grade A+.");
		}
		else if(90>a&&a>=80) {
			System.out.println("Grade A.");
		}else if(80>a&&a>=70) {
			System.out.println("Grade B.");
		}
		else if(70>a&&a>=60) {
			System.out.println("Grade C.");
		}
		else if(60>a&&a>=50) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}

	}

}
