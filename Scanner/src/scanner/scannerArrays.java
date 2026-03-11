package scanner;

import java.util.Arrays;
import java.util.Scanner;

public class scannerArrays {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int marks[]=new int [5];
	System.out.println("enter your marks");
	marks[0] = sc.nextInt();
	marks[1] = sc.nextInt();
	marks[2] = sc.nextInt();
	marks[3] = sc.nextInt();
	marks[4] = sc.nextInt();
	System.out.println("Your marks is :"+ Arrays.toString(marks));
}
}
