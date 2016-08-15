package com.threeoneassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Write {

	static ArrayList<String> listOfCountries = new ArrayList<>();
	
	

	public void readInput() {
		
		Path ourNewPath = Paths.get("\\Users\\admin\\newWorkspace\\WeekThreeDayOne\\src\\com\\threeoneassignment\\countries.txt");
		File aNewFile = ourNewPath.toFile();
		
		try(BufferedReader in = new BufferedReader(new FileReader(aNewFile))){
			
			String countryName;
			while ((countryName = in.readLine()) != null) {
			listOfCountries.add(countryName); 
			System.out.println(countryName);
		}
		

	} catch (IOException e) {
	e.printStackTrace();}
	
	}
	
	public void writeInput(String addACountry){ 
		
		Path ourNewPath = Paths.get("\\Users\\admin\\newWorkspace\\WeekThreeDayOne\\src\\com\\threeoneassignment\\countries.txt");
		File aNewFile = ourNewPath.toFile();
		
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFile, true)))) {
		out.println(addACountry);

		} catch (IOException e) {
		e.printStackTrace();}
	}
	
	
		
		

	

	public static ArrayList<String> getListOfCountries() {
		return listOfCountries;
	}

	public static void setListOfCountries(ArrayList<String> listOfCountries) {
		Write.listOfCountries = listOfCountries;
	}

	
}
