package liadinomullen;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayMaker {
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
	//String [][] nums = new String [numOfCurrencies()][8];
	System.out.println("What currency are you using?");
	int count = 0;
	while(file.hasNext()) {
		System.out.println(file.next());
		String currencyName = file.next();
		//nums.get(count).setCurrencyName(file.next());
		file.nextLine();
		nums.add(new Currency(currencyName, file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next()));
		count++;

		
	}
	return null;
	}


}
