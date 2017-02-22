package imwLessons;

public class WriteOut {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Hello There");
		
		int var1 = 0;
		int var2 = 0;
		
		System.out.println("Please enter a number: ");
		var1 = scanner. nextInt();
		System.out.println("Please enter another number: ");
		var2 = scanner.nextInt();
		
		System.out.println("No format: " + var1 + var2 + (var1 + var2));
		
		scanner.close();
	}
}
