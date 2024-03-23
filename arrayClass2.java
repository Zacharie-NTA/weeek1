import java.util.Scanner;

public class arrayClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		String[] cars= {"Ford", "Kia","Chevy", "Toyota","Mazda"};
		System.out.println("cars available: " );
		for(int i=0; i<5; i++) {
		
		System.out.println(cars[i]);
		}
	}

}
