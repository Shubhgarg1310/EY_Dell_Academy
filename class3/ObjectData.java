package com.class3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectData {
	public static void main(String[] args) {
		
		String str = new String("String is Immutable");
		Integer i = new Integer(12345);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("C:\\\\Users\\\\WJ163EE\\\\OneDrive - EY\\\\Desktop\\\\ABC4.txt"));
			
			oos.writeObject(str);
			oos.writeObject(i);
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream (new FileInputStream("C:\\\\Users\\\\WJ163EE\\\\OneDrive - EY\\\\Desktop\\\\ABC4.txt"));
			System.out.println((String) ois.readObject());
			System.out.println((Integer) ois.readObject());
			
			ois.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
