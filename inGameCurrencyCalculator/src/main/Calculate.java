package main;

enum YorN {
	Y,
	N
}

enum FlatorPercent {
	Flat,
	Percent
}



public class Calculate {
	
	private String filename = "log.txt";
	private UserInput user = new UserInput();
	private Logger logger = new FileLogger(filename);
	protected int stack = 64;
	public int H = 0;
	public int C = 0;
	
	public Calculate() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public void CalculateXP(String name, int amount, int price, int flatDiscount, double percentDiscount) {
		int discount = 0;
		YorN yn;
		FlatorPercent FlorPer;
		System.out.println("do you want discount? Y or N");
		yn = this.YorNChoice();
		if (yn == YorN.Y) {
			logger.Log(filename, "You chose to use the discount");
			System.out.println("Which one do you want to use? Flat or Percent.");
			FlorPer = this.FlorPerChoice();
			if (FlorPer == FlatorPercent.Flat) {
				logger.Log(filename, "You chose to use the flat discount");
				System.out.println("Calculating");
				logger.Log(filename, "Calculating");
				discount = Discount(amount,price,flatDiscount,percentDiscount,FlatorPercent.Flat);
			} else if (FlorPer == FlatorPercent.Percent) {
				logger.Log(filename, "You chose to use the percent discount");
				System.out.println("Calculating");
				logger.Log(filename, "Calculating");
				discount = Discount(amount,price,flatDiscount,percentDiscount,FlatorPercent.Percent);
			} else {
				System.out.println("Oh No! Something went wrong. Please try again");
				logger.Error(filename, "Invalid choice");
				return;
			}
			H = discount / stack;
			C = discount % stack;
			System.out.println("hxp: " + H);
			System.out.println("cxp: " + C);
			logger.Log(filename, "Calculation done");
		} else if (yn == YorN.N) {
			logger.Log(filename, "You have chose to not use discount");
			System.out.println("Calculating");
			logger.Log(filename, "Calculating");
			H = (amount * price) / stack;
			C = (amount * price) % stack;
			System.out.println("hxp: " + H);
			System.out.println("cxp: " + C);
			logger.Log(filename, "Calculation done");
		} else {
			System.out.println("Oh No! Something went wrong. Please try again");
			logger.Error(filename, "Invalid Choice");
		}
	}
	
	public void CalculateCS(String name, int amount, int price, int flatDiscount, double percentDiscount) {
		int discount = 0;
		YorN yn;
		FlatorPercent FlorPer;
		System.out.println("do you want discount? Y or N");
		yn = this.YorNChoice();
		if (yn == YorN.Y) {
			logger.Log(filename, "You have chose to use the discount");
			System.out.println("Which one do you want to use? Flat or Percent.");
			FlorPer = this.FlorPerChoice();
			if (FlorPer == FlatorPercent.Flat) {
				logger.Log(filename, "You have chose to use the flat discount");
				System.out.println("Calculating");
				logger.Log(filename, "Calculating");
				discount = Discount(amount,price,flatDiscount,percentDiscount,FlatorPercent.Flat);
			} else if (FlorPer == FlatorPercent.Percent) {
				logger.Log(filename, "You have chose to use the percent discount");
				System.out.println("Calculating");
				logger.Log(filename, "Calculating");
				discount = Discount(amount,price,flatDiscount,percentDiscount,FlatorPercent.Percent);
			} else {
				System.out.println("Oh No! Something went wrong. Please try again");
				logger.Error(filename, "Invalid choice");
				return;
			}
			H = discount / stack;
			C = discount % stack;
			System.out.println("hcs: " + H);
			System.out.println("ccs: " + C);
			logger.Log(filename, "Calculation done");
		} else if (yn == YorN.N) {
			logger.Log(filename, "You have chose to not use the discount");
			System.out.println("Calculating");
			logger.Log(filename, "Calculating");
			H = (amount * price) / stack;
			C = (amount * price) % stack;
			System.out.println("hcs: " + H);
			System.out.println("ccs: " + C);
			logger.Log(filename, "Calculation done");
		} else {
			System.out.println("Oh No! Something went wrong. Please try again");
			logger.Error(filename, "Invalid choice");
		}
	}
	
	public void CalculateAR(String name, int amount, int price, int flatDiscount, double percentDiscount) {
		int discount = 0;
		YorN yn;
		FlatorPercent FlorPer;
		System.out.println("do you want discount? Y or N");
		yn = this.YorNChoice();
		if (yn == YorN.Y) {
			logger.Log(filename, "You have chose to use the discount");
			System.out.println("Which one do you want to use? Flat or Percent.");
			FlorPer = this.FlorPerChoice();
			if (FlorPer == FlatorPercent.Flat) {
				logger.Log(filename, "You have chose to use the flat discount");
				System.out.println("Calculating");
				logger.Log(filename, "Calculating");
				discount = Discount(amount,price,flatDiscount,percentDiscount,FlatorPercent.Flat);
			} else if (FlorPer == FlatorPercent.Percent) {
				logger.Log(filename, "You have chose to use the percent discount");
				System.out.println("Calculating");
				logger.Log(filename, "Calculating");
				discount = Discount(amount,price,flatDiscount,percentDiscount,FlatorPercent.Percent);
			} else {
				System.out.println("Oh No! Something went wrong. Please try again");
				logger.Error(filename, "Invalid choice");
				return;
			}
			H = discount / stack;
			C = discount % stack;
			System.out.println("har: " + H);
			System.out.println("ar: " + C);
			logger.Log(filename, "Calculation done");
		} else if (yn == YorN.N) {
			logger.Log(filename, "You have chose to not use the discount");
			System.out.println("Calculating");
			logger.Log(filename, "Calculating");
			H = (amount * price) / stack;
			C = (amount * price) % stack;
			System.out.println("har: " + H);
			System.out.println("ar: " + C);
			logger.Log(filename, "Calculation done");
		} else {
			System.out.println("Oh No! Something went wrong. Please try again");
			logger.Error(filename, "invalid choice");
		}
	}
	
	public int Discount(int amount, int price, int flatDiscount, double percentDiscount, FlatorPercent FlorPer) {
		int discount = 0;
		if (FlorPer == FlatorPercent.Flat) {
			discount = (amount * price) - flatDiscount;
		} else if (FlorPer == FlatorPercent.Percent) {
			discount = (int) ((amount * price) * (1 - percentDiscount));
		}
		return discount;
	}
	
	public YorN YorNChoice() {
		int choice;
		YorN yn = null;
		System.out.println("1. Y");
		System.out.println("2. N");
		choice = user.NextInt();
		switch (choice) {
		case 1:
			yn = YorN.Y;
			break;
		case 2:
			yn = YorN.N;
			break;
		}
		return yn;
	}
	
	public FlatorPercent FlorPerChoice() {
		int choice;
		FlatorPercent FlorPer = null;
		System.out.println("1. Flat");
		System.out.println("2. Percent");
		choice = user.NextInt();
		switch (choice) {
		case 1:
			FlorPer = FlatorPercent.Flat;
			break;
		case 2:
			FlorPer = FlatorPercent.Percent;
			break;
		}
		return FlorPer;
	}
}