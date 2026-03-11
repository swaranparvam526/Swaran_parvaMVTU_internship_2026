package scanner;
import java.util.Scanner;
public class ScannerExample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your name:");
	String str = sc.nextLine();
	System.out.println("your name is : "+str);
	
	
	System.out.println("Enter your ph number:");
	long n = sc.nextLong();
	System.out.println("your number is: "+n);
	
	System.out.println("enter your gender:");
	char gender = sc.next().charAt(0);
	System.out.println("your gender is:" +gender);
	
	
	System.out.println("enter your maths marks");
	int m = sc.nextInt();
	System.out.println("your marks is:" +m);
	
	
	System.out.println("enter your percentage");
	float p = sc.nextFloat();
	System.out.println("your percent is:" +p);
}
}
