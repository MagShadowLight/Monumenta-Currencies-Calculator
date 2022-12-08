package main;

import java.util.InputMismatchException;

enum YorN {
	Y,
	N
}

enum FlatorPercent {
	Flat,
	Percent
}

//enum Currencies {
//	Xp,
//	Cs,
//	Ar
//}



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
		System.out.println("do you want discount? Y or N (Select the Numbers, not Y or N)");
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
		System.out.println("do you want discount? Y or N (Select the Numbers, not Y or N)");
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
		System.out.println("do you want discount? Y or N (Select the Numbers, not Y or N)");
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
	
	public void CurrencyExchange() {
		double com1;
		double com2;
		double hyper;
		System.out.println("How much compressed per hyper");
		try {
		com1 = user.NextInt();
		logger.Log(filename, "Compressed per hyper: " + com1);
		System.out.println("How much compressed it cost to exchange");
		com2 = user.NextInt();
		logger.Log(filename, "Compressed cost: " + com2);
		System.out.println("How much hyper do you want to exchange");
		hyper = user.NextInt();
		logger.Log(filename, "Hyper you want to exchange: " + hyper);
		System.out.println("Calculating");
		logger.Log(filename, "Calculating");
		System.out.println("Currency Exchange:");
		System.out.println("hyper: " + (int) ((hyper * com2) / com1));
		System.out.println("Compressed: " + (int) ((hyper * com2) % com1));
		logger.Log(filename, "Calculation Done");
		} catch (InputMismatchException e) {
			System.out.println("Oh No! Something went wrong!");
			logger.Log(filename, "Invalid Input");
			user.NewLine();
		}
	}
	
//	public void Recalculate() {
//		int choice = 0;
//		Currencies currencies;
//		String na = "";
//		int am = 0;
//		int pr = 0;
//		int flatDis = 0;
//		double percentDis = 0;
//		HistoryWriter historyReader = new HistoryWriter(na, am, pr, flatDis, percentDis);
//		HxpCxp xp = new HxpCxp(na, am, pr, flatDis, percentDis);
//		HcsCcs cs = new HcsCcs(na, am, pr, flatDis, percentDis);
//		HarAr ar = new HarAr(na, am, pr, flatDis, percentDis);
//		System.out.println("what numbers from 1 to the number of calculation you've done");
//		choice = (user.NextInt()) - 1;
//		System.out.println(choice);
//		logger.Log(filename, "num: " + choice);
//		na = historyReader.names.get(choice);
//		am = historyReader.amounts.get(choice);
//		pr = historyReader.prices.get(choice);
//		flatDis = historyReader.flatDiscounts.get(choice);
//		percentDis = historyReader.percentDiscounts.get(choice);
//		System.out.println("Which currencies are you using?");
//		currencies = CurrenciesOption();
//		if (currencies == Currencies.Xp) {
//			logger.Log(filename, "You have chose to use XP");
//			System.out.println("Recalculating");
//			logger.Log(filename, "Recalculating");
//			xp.calculateH();
//			xp.calculateC();
//			logger.Log(filename, "Recalculation Done");
//		} else if (currencies == Currencies.Cs) {
//			logger.Log(filename, "You have chose to use CS");
//			System.out.println("Recalculating");
//			logger.Log(filename, "Recalculating");
//			cs.calculateH();
//			cs.calculateC();
//			logger.Log(filename, "Recalculation Done");
//		} else if (currencies == Currencies.Ar) {
//			logger.Log(filename, "You have chose to use AR");
//			System.out.println("Recalculating");
//			logger.Log(filename, "Recalculating");
//			ar.calculateH();
//			ar.calculateC();
//			logger.Log(filename, "Recalculation Done");
//		} else {
//			System.out.println("Oh No! Something went wrong please try again");
//			logger.Error(filename, "Invalid Choice");
//		}
//		
//	}
	
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
		try {
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
		} catch (InputMismatchException e) {
			user.NewLine();
			return yn;
		}
	}
	
	public FlatorPercent FlorPerChoice() {
		int choice;
		FlatorPercent FlorPer = null;
		System.out.println("1. Flat");
		System.out.println("2. Percent");
		try {
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
		} catch (InputMismatchException e) {
			user.NewLine();
			return FlorPer;
		}
	}
	
//	public Currencies CurrenciesOption() {
//		int choice;
//		Currencies currency = null;
//		System.out.println("1. XP");
//		System.out.println("2. CS");
//		System.out.println("3. AR");
//		choice = user.NextInt();
//		switch (choice) {
//		case 1:
//			currency = Currencies.Xp;
//			break;
//		case 2:
//			currency = Currencies.Cs;
//			break;
//		case 3:
//			currency = Currencies.Ar;
//			break;
//		default:
//			
//		}
//			
//		return currency;
//	}
}