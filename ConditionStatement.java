package Day3;

import java.util.Scanner;

public class ConditionStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value :");
		int a = scan.nextInt();
		if(a<10) {
			System.out.println("The given value is less than 10 and the given value is "+a);
		}
		if(a>10) {
			System.out.println("The given value is greater than 10 and the given value is "+a);
		}
		if(a==0) {
			System.out.println("The given value is equal to 0 and the given value is "+a);
		}
		else {
			System.out.println("The given value is negative value and the given value is "+a);
		}

	}
}
