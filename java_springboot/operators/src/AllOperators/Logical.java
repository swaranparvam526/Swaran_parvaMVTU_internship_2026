package AllOperators;

public class Logical {
	public static void main(String[] args) {
		int a = 12;
        int b = 7;

        System.out.println("(a > b && a < 20) : " + (a > b && a < 20));
        System.out.println("(a < b || b < 10) : " + (a < b || b < 10));
        System.out.println("!(a == b) : " + (!(a == b)));
	}
}
