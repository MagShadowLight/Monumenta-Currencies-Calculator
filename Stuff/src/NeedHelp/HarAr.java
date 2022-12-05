package NeedHelp;
//package StuffNotWork;
//package main;
//
//public class HarAr extends CalculationHistory {
//
//	public HarAr(String name, int amount, int price, int flatDiscount, double percentDiscount) {
//		super(name, amount, price, flatDiscount, percentDiscount);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public void calculateH() {
//		// TODO Auto-generated method stub
//		int har = 0;
//		int flatDis = 0;
//		int percentDis = 0;
//		int discountedHarOne = 0;
//		int discountedHarTwo = 0;
//		har = (price * amount) / 64;
//		flatDis = (price * amount) - flatDiscount;
//		percentDis = (int) ((price * amount) * (1 - percentDiscount));
//		discountedHarOne = flatDis / 64;
//		discountedHarTwo = percentDis / 64;
//		System.out.println("Name: " + name);
//		System.out.println("HCS: " + har);
//		System.out.println("with Flat Discount: " + discountedHarOne);
//		System.out.println("with Percent Discount: " + discountedHarTwo);
//	}
//
//	@Override
//	public void calculateC() {
//		// TODO Auto-generated method stub
//		int ar = 0;
//		int flatDis = 0;
//		int percentDis = 0;
//		int discountedArOne = 0;
//		int discountedArTwo = 0;
//		ar = (price * amount) % 64;
//		flatDis = (price * amount) - flatDiscount;
//		percentDis = (int) ((price * amount) * (1 - percentDiscount));
//		discountedArOne = flatDis % 64;
//		discountedArTwo = percentDis % 64;
//		System.out.println("Name: " + name);
//		System.out.println("HCS: " + ar);
//		System.out.println("with Flat Discount: " + discountedArOne);
//		System.out.println("with Percent Discount: " + discountedArTwo);
//	}
//
//}
