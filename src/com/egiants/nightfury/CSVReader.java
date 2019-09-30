package com.egiants.nightfury;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
	
		String csvFile = "E:\\Projects\\src\\EgiantsProjects\\ProjectFileSearch\\resources\\memberData.csv";
		BufferedReader br = null; 
		String line = ""; 
		String cvsSplitBy = ","; 
		String givenFName = null, receivedFName = null, givenLName = null, receivedLName =null;
		String desc = null; 
		String MID = null;
	
		try {
			
			br = new BufferedReader(new FileReader(csvFile));
			
			while((line = br.readLine()) != null) {
				
				//use comma as separator 
				String[] data = line.split(cvsSplitBy);
				desc = data[0];
				MID = data[1]; 
				givenFName = data[2];
				
				if(desc.compareTo("Match")==0) {
					receivedFName = data[3];
					givenLName = data[4];
					receivedLName = data[5];
					
				}else {
					givenLName = data[3];
				}
				
				System.out.println("givenFirst Name : " + givenFName + "\t || "+"Received First Name :" + receivedFName);
				System.out.println("given Last Name : " + givenLName + "\t || "+"Received Last Name : " + receivedLName);
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e ) {
					e.printStackTrace();
				}
			}
		}

	}
	
	
	public void parseMatchRecords() {
		//System.out.println(desc);
		
	}
	
	public void parseFnameNotFoundRecords() {
		
	}
	
	public void parseLnameNotFoundRecords() {
		
	}
	
	public void parseMatchNotFoundRecords() {
		
	}

}
