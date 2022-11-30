package main;

import java.util.Scanner;

public class UserInput extends Program {

	private Scanner input;
	
	public UserInput() {
		// TODO Auto-generated constructor stub
		super();
		this.input = new Scanner(System.in);
	}
	
	public int NextInt() {
	int num = input.nextInt();
	input.nextLine();
	return num;
	}
	
	public double NextDouble() {
		return input.nextDouble();
	}
	
	public String NextString() {
		return input.nextLine();
	}
	
}
