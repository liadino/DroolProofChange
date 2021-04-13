package liadinomullen;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;


public class ArrayMaker {
	public static Scanner input = new Scanner(System.in);

	public static int numOfCurrencies() throws FileNotFoundException {
		Scanner file = new Scanner(new File("Currencies"));
		int counter = 0;
		while(file.hasNext()) {
			counter++;
			file.nextLine();
			file.nextLine();
		}
		return counter;
	}
	
	public static String[] transferFile() throws IOException{
		
	Scanner scan = new Scanner(System.in);
	Scanner file = new Scanner(new File("Currencies"));
	ArrayList<Currency> nums = new ArrayList<Currency>();
	System.out.println("What currency are you using? Input the indicated number");
	int choice = input.nextInt();
	int count = 0;
	while(file.hasNext()) {
		System.out.println(count+1 + file.next());
		String currencyName = file.next();
		//nums.get(count).setCurrencyName(file.next());
		file.nextLine();
		String[] nums = file.nextLine().split(" ");
		//nums.add(new Currency(file.next().split(" ")));
		count++;
	}
	switch(choice) {
	case 1: 
		

		}
	}
	return null;
	}


}
