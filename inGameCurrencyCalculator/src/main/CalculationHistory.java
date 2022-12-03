package main;

import java.util.ArrayList;

abstract class CalculationHistory {

	private Logger logger = new FileLogger("log.txt");
	public String name = "";
	public int amount = 0;
	public int price = 0;
	public int flatDiscount = 0;
	public double percentDiscount = 0.0;
	public ArrayList<String> names = new ArrayList<String>();
	public ArrayList<Integer> amounts = new ArrayList<Integer>();
	public ArrayList<Integer> prices = new ArrayList<Integer>();
	public ArrayList<Integer> flatDiscounts = new ArrayList<Integer>();
	public ArrayList<Double> percentDiscounts = new ArrayList<Double>();
	public abstract void calculateH();
	public abstract void calculateC();
	
	public CalculationHistory(String name, int amount, int price, int flatDiscount, double percentDiscount) {
		super();
		this.name = name;
		this.amount = amount;
		this.price = price;
		this.flatDiscount = flatDiscount;
		this.percentDiscount = percentDiscount;
	}
	
	public void AddToHistory() {
		names.add(name);
		amounts.add(amount);
		prices.add(price);
		flatDiscounts.add(flatDiscount);
		percentDiscounts.add(percentDiscount);
		logger.Log("log.txt", "History added");
	}

	public ArrayList<String> getNames() {
		return names;
	}
	public void setNames(ArrayList<String> names) {
		this.names = names;
	}
	public ArrayList<Integer> getAmounts() {
		return amounts;
	}
	public void setAmounts(ArrayList<Integer> amounts) {
		this.amounts = amounts;
	}
	public ArrayList<Integer> getPrices() {
		return prices;
	}
	public void setPrices(ArrayList<Integer> prices) {
		this.prices = prices;
	}
	public ArrayList<Integer> getFlatDiscounts() {
		return flatDiscounts;
	}
	public void setFlatDiscounts(ArrayList<Integer> flatDiscounts) {
		this.flatDiscounts = flatDiscounts;
	}
	public ArrayList<Double> getPercentDiscounts() {
		return percentDiscounts;
	}
	public void setPercentDiscounts(ArrayList<Double> percentDiscounts) {
		this.percentDiscounts = percentDiscounts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getFlatDiscount() {
		return flatDiscount;
	}

	public void setFlatDiscount(int flatDiscount) {
		this.flatDiscount = flatDiscount;
	}

	public double getPercentDiscount() {
		return percentDiscount;
	}

	public void setPercentDiscount(double percentDiscount) {
		this.percentDiscount = percentDiscount;
	}

	
	

}
