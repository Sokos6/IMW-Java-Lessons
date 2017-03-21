package imwLessons;

public class FiveIntegers {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		
		System.out.println("Enter a number : ");
		num1 = scanner.nextInt();
		System.out.println("Enter a second number : ");
		num2 = scanner.nextInt();
		System.out.println("Enter a third number : ");
		num3 = scanner.nextInt();
		System.out.println("Enter a fourth number : ");
		num4 = scanner.nextInt();
		System.out.println("Enter a fifth number : ");
		num5 = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
		
		
	
	}
}
