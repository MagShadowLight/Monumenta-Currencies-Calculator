package main;

public class HcsCcs extends CalculationHistory {

	public HcsCcs(String name, int amount, int price, int flatDiscount, double percentDiscount) {
		super(name, amount, price, flatDiscount, percentDiscount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateH() {
		// TODO Auto-generated method stub
		int hcs = 0;
		int flatDis = 0;
		int percentDis = 0;
		int discountedHcsOne = 0;
		int discountedHcsTwo = 0;
		hcs = (price * amount) / 64;
		flatDis = (price * amount) - flatDiscount;
		percentDis = (int) ((price * amount) * (1 - percentDiscount));
		discountedHcsOne = flatDis / 64;
		discountedHcsTwo = percentDis / 64;
		System.out.println("Name: " + name);
		System.out.println("HCS: " + hcs);
		System.out.println("with Flat Discount: " + discountedHcsOne);
		System.out.println("with Percent Discount: " + discountedHcsTwo);
	}

	@Override
	public void calculateC() {
		// TODO Auto-generated method stub
		int ccs = 0;
		int flatDis = 0;
		int percentDis = 0;
		int discountedCcsOne = 0;
		int discountedCcsTwo = 0;
		ccs = (price * amount) % 64;
		flatDis = (price * amount) - flatDiscount;
		percentDis = (int) ((price * amount) * (1 - percentDiscount));
		discountedCcsOne = flatDis % 64;
		discountedCcsTwo = percentDis % 64;
		System.out.println("Name: " + name);
		System.out.println("HCS: " + ccs);
		System.out.println("with Flat Discount: " + discountedCcsOne);
		System.out.println("with Percent Discount: " + discountedCcsTwo);
	}

}
