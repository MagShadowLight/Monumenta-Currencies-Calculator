package main;

import java.util.InputMismatchException;

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
	
	public int SetAmount(String name) {
		int amount = 0;
		System.out.println("Enter the amount of item you want to buy");
		try {
		amount = user.NextInt();
		System.out.println("You want to buy " + amount + " " + name);
		logger.Log(filename, "returning to main menu");
		return amount;
		} catch (InputMismatchException e) {
			System.out.println("Oh No! Something went wrong!");
			logger.Error(filename, "Invalid Input");
			user.NewLine();
			return 0;
		}
	}
	
	public int SetPrice(String name) {
		int price = 0;
		System.out.println("Enter the price of each item in Compressed form");
		try {
		price = user.NextInt();
		logger.Log(filename, "Item price set. Price: " + price);
		System.out.println("Price for " + name + ": " + price + " compressed form");
		logger.Log(filename, "Returning to main menu");
		return price;
		} catch (InputMismatchException e) {
			System.out.println("Oh No! Something went wrong!");
			logger.Error(filename, "Invalid Input");
			user.NewLine();
			return 0;
		}
	}
	
	public void SetDiscount() {
		int choice = 0;
		System.out.println("Which Discount do you want");
		System.out.println("1. Flat");
		System.out.println("2. Percentage");
		try {
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
		} catch (InputMismatchException e) {
			System.out.println("Oh No! Something went wrong!");
			logger.Error(filename, "Invalid Input");
			user.NewLine();
		}
	}
	
	public void SetFlatDiscount() {
		int discount = 0;
		System.out.println("Enter the Flat discount");
		try {
		discount = user.NextInt();
		System.out.println("Discount for " + pro.name + ": " + discount);
		pro.flatDiscount = discount;
		} catch (InputMismatchException e) {
			System.out.println("Oh No! Something went wrong!");
			logger.Error(filename, "Invalid Input");
			user.NewLine();
		}
	}
	
	public void SetPercentDiscount() {
		double discount = 0;
		System.out.println("Enter the Percentage Discount in decimals");
		try {
		discount = user.NextDouble();
		System.out.println("Percentage discount for " + pro.name + ": " + discount);
		pro.percentDiscount = discount;
		} catch (InputMismatchException e) {
			System.out.println("Oh No! Something went wrong!");
			logger.Error(filename, "Invalid Input");
			user.NewLine();
		}
	}
	
}
