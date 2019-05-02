import java.util.ArrayList;
import java.util.Scanner;

public class LabNumber9ArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		
		String cont = "yes";
		while(cont.equalsIgnoreCase("yes")){
			// logic
			System.out.println("play!");
		
			ArrayList<String> itemName = new ArrayList<>();
			itemName.add("Test");
			itemName.add("Candy");
			itemName.add("Doritos");
			ArrayList<Double> itemPrice = new ArrayList<>();
			itemPrice.add(1.99);
			itemPrice.add(2.99);
			itemPrice.add(3.99);

			ArrayList<Double> price = new ArrayList<>();
			ArrayList<String> groceries = new ArrayList<>();

			System.out.printf("%-20s %-20s\n", "Item", "Price");
			System.out.println("________________________________________");

			for (int i = 0; i < itemName.size(); i++) {

				System.out.printf("%-20s %-20s\n", itemName.get(i), itemPrice.get(i));

			}
			
			
			String userChoice = Validator.getString(scan, "What item do you want?");
			
			
			
			
			
			
			
			
			
			
			// your code should stop here
			System.out.println("Do you want to continue?  (yes/no) ");
			cont = scan.nextLine();
		}
		


		scan.close();
	}

}
