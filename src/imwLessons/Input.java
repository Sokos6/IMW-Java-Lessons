package imwLessons;

public class Input {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int age = 0;
		int year = 0;
		
		System.out.println("Please enter your age in years: ");
		age = scanner.nextInt();
		System.out.println("Please enter the current year: ");
		year = scanner.nextInt();
		
		scanner.close();
		
		if (year < 2000) {
			System.out.println("You'll be ");
		}
		else {
			System.out.println("You were ");
		}
		
		System.out.println((2000 - year + age) + " years old in the " + "year 2000.");
		
	}
	
}
