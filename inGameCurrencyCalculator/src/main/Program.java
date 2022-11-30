package main;

public class Program {
	private static UserInput user = new UserInput();
	private static UserSetting set = new UserSetting();
	private static Calculate calc = new Calculate();
	private static Logger logger;
	private static boolean isRunning;
	private static String filename = "log.txt";
	public static int choice;
	public static String str;
	public static String name;
	public static int amount;
	public static int price;
	public static int flatDiscount;
	public static double percentDiscount;
	
	
	public static void main(String[] args) {
		// TODO Calculate the in game currencies
		System.out.println("Welcome to Monumenta Calculator");
		isRunning = true;
		logger = new FileLogger(filename);
		logger.Log(filename, "Opened Monumenta Calculator");
		while (isRunning) {
			System.out.println("Which choice do you want to pick");
			System.out.println("1. Item Name");
			System.out.println("2. Amount of Items");
			System.out.println("3. Price of Items");
			System.out.println("4. discount");
			System.out.println("5. Calculate in cxp/hxp");
			System.out.println("6. Calculate in ccs/hcs");
			System.out.println("7. Calculate in ar/har");
			System.out.println("8. Recalculate from the history (not functional yet)");
			System.out.println("0. quit application");
			
			choice = user.NextInt();
			
			switch (choice) {
				case 1:
//					System.out.println("You have chose Item Name");
					logger.Log(filename, "You have chose to set the item name");
					name = set.SetName();
					logger.Log(filename, "Item name set. Name: " + name);
					System.out.println("Item name: \"" + name + "\"");
					logger.Log(filename, "returning to main menu");
					break;
				case 2:
//					System.out.println("You have chose item amounts");
					logger.Log(filename, "You have chose to set the item amount");
					amount = set.SetAmount();
					logger.Log(filename, "Item amount set. amount: " + amount);
					System.out.println("You want to buy " + amount + " " + name);
					logger.Log(filename, "Returning to main menu");
					break;
				case 3:
					logger.Log(filename, "You have chose to set the item price");
//					System.out.println("You have chose item price");
					price = set.SetPrice();
					logger.Log(filename, "Item price set. Price: " + price);
					System.out.println("Price for " + name + ": " + price + " compressed form");
					logger.Log(filename, "Returning to main menu");
					break;
				case 4:
//					System.out.println("You have chose discount");
					logger.Log(filename, "You have chose to set the discount");
					set.SetDiscount();
					logger.Log(filename, "Returning to main menu");
					break;
				case 5:
//					System.out.println("You have chose calculate in cxp/hxp");
					logger.Log(filename, "You have chose to calculate in cxp/hxp");
					calc.CalculateXP(name, amount, price, flatDiscount, percentDiscount);
					logger.Log(filename, "Returning to main menu");
					break;
				case 6:
//					System.out.println("You have chose calculate in ccs/hcs");
					logger.Log(filename, "You have chose to calculate in ccs/hcs");
					calc.CalculateCS(name, amount, price, flatDiscount, percentDiscount);
					logger.Log(filename, "Returning to main menu");
					break;
				case 7:
//					System.out.println("You have chose calculate in ar/har");
					logger.Log(filename, "You have chose to calculate in ar/har");
					calc.CalculateAR(name, amount, price, flatDiscount, percentDiscount);
					logger.Log(filename, "Returning to main menu");
					break;
				case 0:
					isRunning = false;
//					System.out.println("Quitting Application");
					logger.Log(filename, "Quitting the application");
					break;
				default:
					System.out.println("Oh No! Something went wrong. Please try again");
					logger.Error(filename, "Invalid Choice");
					break;
			}
		}
		logger.Log(filename, "Good bye!");
	}
				
				
		// TODO have the user input the item they want
		
		// TODO have user input the amount of item and prices
		
		// TODO have user input the amount of discount in flat value
		
		// TODO have user input the amount of discount in percentage
		
		// TODO Calculate the cxp/hxp
		
		// TODO Calculate the ccs/hcs
		
		// TODO Calculate the ar/har
		
		// TODO use file loggers
	
		// TODO use history calculation array
}
