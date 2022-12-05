package NeedHelp;
//package StuffNotWork;
//package main;
//
//public class HxpCxp extends CalculationHistory {
//	
//	public HxpCxp(String name, int amount, int price, int flatDiscount, double percentDiscount) {
//		super(name, amount, price, flatDiscount, percentDiscount);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public void calculateH() {
//		// TODO Auto-generated method stub
//		int hxp = 0;
//		int flatDis = 0;
//		int percentDis = 0;
//		int discountedHxpOne = 0;
//		int discountedHxpTwo = 0;
//		System.out.println("Name: " + name);
//		hxp = (price * amount) / 64;
//		flatDis = (price * amount) - flatDiscount;
//		percentDis = (int) ((price * amount) * (1 - percentDiscount));
//		discountedHxpOne = flatDis / 64;
//		discountedHxpTwo = percentDis / 64;
//		System.out.println("HXP: " + hxp);
//		System.out.println("with Flat Discount: " + discountedHxpOne);
//		System.out.println("with Percent Discount: " + discountedHxpTwo);
//	}
//
//	@Override
//	public void calculateC() {
//		// TODO Auto-generated method stub
//		int cxp = 0;
//		int flatDis = 0;
//		int percentDis = 0;
//		int discountedCxpOne = 0;
//		int discountedCxpTwo = 0;
//		System.out.println("Name: " + name);
//		cxp = (price * amount) % 64;
//		flatDis = (price * amount) - flatDiscount;
//		percentDis = (int) ((price * amount) * (1 - percentDiscount));
//		discountedCxpOne = flatDis % 64;
//		discountedCxpTwo = percentDis % 64;
//		System.out.println("CXP: " +  cxp);
//		System.out.println("with Flat Discount: " + discountedCxpOne);
//		System.out.println("with Percent Discount: " + discountedCxpTwo);
//	}
//
//}
