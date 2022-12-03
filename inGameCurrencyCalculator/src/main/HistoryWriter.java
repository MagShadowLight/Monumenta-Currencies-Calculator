package main;

public class HistoryWriter extends CalculationHistory {

	private Logger logger = new FileLogger("log.txt");
	
	public HistoryWriter(String name, int amount, int price, int flatDiscount, double percentDiscount) {
		super(name, amount, price, flatDiscount, percentDiscount);
		
	}

	@Override
	public void calculateH() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateC() {
		// TODO Auto-generated method stub

	}

}
