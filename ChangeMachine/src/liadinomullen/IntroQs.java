package liadinomullen;
import java.util.Scanner;


public class IntroQs {
	public static Scanner input = new Scanner(System.in);

	private void basics() {
		// TODO Auto-generated method stub
		System.out.println("How much does your purchase cost?");
		double cost = input.nextDouble();
		System.out.println("How much are you paying with?");
		double bill = input.nextDouble();
	}
}
