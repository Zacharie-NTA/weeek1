import java.util.Scanner;

public class arraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] numbers = {1,3,5,7,9};
		
		Scanner scanner = new Scanner(System.in);
		int i=0;
		
		
		System.out.println("enter numbers: ");
		
		int num = scanner.nextInt();
		
		for (i=0; i< numbers.length; i++) {
			
			System.out.println("numbers = " + numbers[i]);
			
		}
		
		//System.out.println("am out");
	}

}
