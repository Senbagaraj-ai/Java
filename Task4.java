package Day3;
//Example for if statement
import java.util.*;
public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the weight : ");
		int w = sc.nextInt();
		if(0<=w&&w<=100) {
			if(w%2==0) {
				System.out.println("Yes");
				System.out.println("It's even.");
				int h=w/2;
				System.out.println("first half weight "+h+",another half weight "+h);
			}
			else {
				System.out.println("No, It's odd.");
			}
		}
		else {
			System.out.println("Invalid Input.");
		}

	}

}
