package com.class3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOSConcept {
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("C:\\Users\\WJ163EE\\OneDrive - EY\\Desktop\\ABC2.txt");
		System.out.println(p.getFileName());
		System.out.println(p.getFileSystem());
		System.out.println(p.getParent());
		System.out.println(p.getRoot());
		
		File f = p.toFile();  //Lagecy files
		System.out.println(f.getAbsolutePath());
		
		BufferedReader br = Files.newBufferedReader(p, StandardCharsets.UTF_8);
		String str = null;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		
		Files.createFile(Paths.get("C:\\Users\\WJ163EE\\OneDrive - EY\\Desktop\\ABC5.txt"));
		System.out.println("FileCreated");
		
		Files.createDirectory(Paths.get("C:\\Users\\WJ163EE\\OneDrive - EY\\Desktop\\Files"));
		System.out.println("Directory Created ");
		
		Files.createDirectories(Paths.get("C:\\Users\\WJ163EE\\OneDrive - EY\\Desktop\\Files\\Files2\\Files3"));
		System.out.println("Directories Created");
		
		
	}
}
