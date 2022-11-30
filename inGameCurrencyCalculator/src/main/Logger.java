package main;

abstract class Logger {

	public Logger() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void Log(String filename, String prompt);
	
	public abstract void Warn(String filename, String prompt);
	
	public abstract void Error(String filename, String prompt);

}
