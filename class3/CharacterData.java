package com.class3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterData {
	public static void main(String[] args){
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\WJ163EE\\OneDrive - EY\\Desktop\\ABC3.txt")));
			bw.write("ABCD");
			bw.newLine();
			bw.write("Shubham");
			bw.newLine();
			bw.write(97);
			bw.flush();   //by this the content is written in the file as it is in cache memory
			bw.close();
			
			BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\WJ163EE\\OneDrive - EY\\Desktop\\ABC3.txt")));
			
			String str;
			while((str = br.readLine()) !=null){
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
