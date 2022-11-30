package main;

public class UserSetting {
	
	private UserInput user = new UserInput();
	private Program pro = new Program();
	private String filename = "log.txt";
	private Logger logger = new FileLogger(filename);
	
	public UserSetting() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public String SetName() {
		String name = null;
		System.out.println("Enter the item name");
		name = user.NextString();
		return name;
	}
	
	public int SetAmount() {
		int amount = 0;
		System.out.println("Enter the amount of item you want to buy");
		amount = user.NextInt();
		return amount;
	}
	
	public int SetPrice() {
		int price = 0;
		System.out.println("Enter the price of each item in Compressed form");
		price = user.NextInt();
		return price;
	}
	
	public void SetDiscount() {
		int choice = 0;
		System.out.println("Which Discount do you want");
		System.out.println("1. Flat");
		System.out.println("2. Percentage");
		choice = user.NextInt();
		switch (choice) {
		case 1:
			logger.Log(filename, "You have chose to set flat discount");
			SetFlatDiscount();
			logger.Log(filename, "Discount set. Flat Discount: " + pro.flatDiscount + " percent discount: " + pro.percentDiscount);
			break;
		case 2:
			logger.Log(filename, "You have chose to set percentage discount");
			SetPercentDiscount();
			logger.Log(filename, "Discount set. Flat Discount: " + pro.flatDiscount + " percent discount: " + pro.percentDiscount);
			break;
		default:
			System.out.println("Oh No! Something went wrong. Please try again");
			logger.Error(filename, "Invalid choice");
			break;
		}
	}
	
	public void SetFlatDiscount() {
		int discount = 0;
		System.out.println("Enter the Flat discount");
		discount = user.NextInt();
		System.out.println("Discount for " + pro.name + ": "+ discount);
		pro.flatDiscount = discount;
	}
	
	public void SetPercentDiscount() {
		double discount = 0;
		System.out.println("Enter the Percentage Discount in decimals");
		discount = user.NextDouble();
		System.out.println("Percentage discount for " + pro.name + ": " + discount);
		pro.percentDiscount = discount;
	}
	
}
