package main;

import java.util.*;

public class UserInput extends Program {

	private Scanner input;
	private FileLogger logger = new FileLogger("log.txt");
	
	public UserInput() {
		// TODO Auto-generated constructor stub
		super();
		this.input = new Scanner(System.in);
	}
	
	public int NextInt() {
		int num = 0;
		num = input.nextInt();		
//		try {
//		num = input.nextInt();
//		} catch (InputMismatchException e) {
//			System.out.println("Oh No! Something went wrong!");
//			logger.Error("log.txt", "Input Invalid");
//		}
		input.nextLine();
		return num;
	}
	
	public double NextDouble() {
		double num = 0.0;
		num = input.nextDouble();
//		try {
//		num = input.nextDouble();
//		} catch (InputMismatchException e) {
//			System.out.println("Oh No! Something went wrong!");
//			logger.Error("log.txt", "Input Invalid");
//		}
		input.nextLine();
		return num;
	}
	
	public String NextString() {
		String str = "";
		try {
		str = input.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Oh No! Something went wrong!");
			logger.Error("log.txt", "Input Invalid");
		}
		return str;
	}
	
	public void NewLine() {
		input.nextLine();
	}
	
}
