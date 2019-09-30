package com.egiants.nightfury;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderInJava {

	public static void main(String[] args) {
		List<Member> members = readMembersFromCSV("E:/Projects/src/EgiantsProjects/ProjectFileSearch/resources/memberData.csv");
		
		//Let's print all the member details
		for(Member m : members) {
			System.out.println(m);
		}
	}
	
	public static List<Member> readMembersFromCSV(String fileName){
		List<Member> members = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		
		try(BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)){
			
			String line  = br.readLine(); 
			// read the first line from the 
			while(line != null) {
				
				String[] attributes  = line.split(",");
				Member member = createMember(attributes);
				
				members.add(member);
				
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return members;
	}

	private static Member createMember(String[] metadata) {
		String desc = metadata[0];
		String MID = metadata[1]; 
		String givenFName = metadata[2];
		String receivedFName = metadata[2];
		String givenLName = metadata[2];
		String receivedLName = metadata[2];
		
		return new Member(desc, MID, givenFName, receivedFName, givenLName, receivedLName);
	}
}
