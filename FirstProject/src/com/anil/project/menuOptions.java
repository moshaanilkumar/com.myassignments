package com.anil.project;

public class menuOptions {
	public static void printWelcomeScreen(String appName, String developerName) {
		String AppDetails = String.format("*****************************************************\n"
				+ "** Welcome to %s.com. \n" + "** This application was developed by %s.\n"
				+ "---------------------------------------------------------------------------\n", appName, developerName);
		String appFunction = "You can use this application to :-\n"
				+ "• Search, add, or delete files in \"anil\" folder.\n"
				+ "\n**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
		System.out.println(AppDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Display menu for File operations\n"
				+ "2) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
				+ "1) Add a file to \"anil\" folder\n" + "2) Delete a file from \"anil\" folder\n"
				+ "3) Search for a file from \"anil\" folder\n" + "4) Show Previous Menu\n" + "5) Exit program\n";

		System.out.println(fileMenu);
	}
public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createFolder("anil");
		
		menuOptions.printWelcomeScreen("Locker", "anilkumar");
		
		HandleOption.handleWelcomeScreenInput();
	}

}

