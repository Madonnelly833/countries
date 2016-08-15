package com.threeoneassignment;


import java.util.Scanner;

public class App {

	static Scanner sc = new Scanner(System.in);
	
	 String numberInput = null;
	 String countryInput = null;
	 boolean userFailed = false;
	 int choice = 0;

	public static void main(String[] args) {
		
		App first = new App();
		first.start();}
		
		
		public void start(){
			do{
		
		System.out.println("Hello and welcome to Michael's country list thing instead of just going to Wikipedia: \n" + "1. See list of Countries 2. Add a Country 3. Exit");
		
		numberInput = sc.nextLine();
		choice = Integer.parseInt(numberInput);
		userFailed = Validation.validateChoice(numberInput);}
			while(userFailed);
			
			this.setChoice(Integer.parseInt(numberInput));
			this.menuChoice(choice);
			start();
			
		
}


		private void menuChoice(int choice2) {
			String newCountry = null;
			Write reader = new Write();
			Write writer = new Write();
			
			
			switch(choice2){
			case 1:
				reader.readInput();
				break;
			case 2:
				System.out.println("Please enter the name of the country you would like to add to the list: ");
				 newCountry = sc.nextLine();
				 writer.writeInput(newCountry);
				break;
			case 3:
				System.out.println("You should be checking Wikepedia anyways!");
				System.exit(0);
				break;
			}
			
			
		}


		public String getNumberInput() {
			return numberInput;
		}


		public void setNumberInput(String numberInput) {
			this.numberInput = numberInput;
		}


		public String getCountryInput() {
			return countryInput;
		}


		public void setCountryInput(String countryInput) {
			this.countryInput = countryInput;
		}


		public int getChoice() {
			return choice;
		}


		public void setChoice(int choice) {
			this.choice = choice;
		}
	
	
	

}
