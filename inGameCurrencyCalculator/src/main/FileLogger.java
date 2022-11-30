package main;

import java.io.*;

public class FileLogger extends Logger {
	private File fileHandle;
	private FileWriter fileWriter;
	

	public FileLogger(String filename) {
		super();
		try {
			fileHandle = new File(filename);
			if (fileHandle.createNewFile()) {
//				System.out.println("file created: " + fileHandle.getName());
			} else {
//				System.out.println("file already exists");
			}
		} catch (IOException e){
			System.out.println("an error occurred");
			e.printStackTrace();
		}
	}
	
	private void WriteLine(String filename, String level, String message) {
		try {
			fileWriter = new FileWriter(filename, true);
			fileWriter.write(level + " - " + message + "\n");
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("an error occurred");
			e.printStackTrace();
		}
	}

	@Override
	public void Log(String filename, String prompt) {
		// TODO Auto-generated method stub
		this.WriteLine(filename, "Log", prompt);
	}

	@Override
	public void Warn(String filename, String prompt) {
		// TODO Auto-generated method stub
		this.WriteLine(filename, "Warn", prompt);
	}

	@Override
	public void Error(String filename, String prompt) {
		// TODO Auto-generated method stub
		this.WriteLine(filename, "Error", prompt);
	}
}
