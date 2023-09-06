package com.class3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class DeleteOneDirectory {
	public static void main(String[] args) throws IOException {
//		Path p = Paths.get("C:\\Users\\WJ163EE\\OneDrive - EY\\Desktop\\Files");
//		Files.delete(p);
//		System.out.println("Deleted Files");
		
		
		Path p2 = Paths.get("C:\\Users\\\\\\\\WJ163EE\\\\\\\\OneDrive - EY\\\\\\\\Desktop\\\\\\\\ABC4.txt");
		BasicFileAttributeView view = Files.getFileAttributeView(p2,BasicFileAttributeView.class);
		BasicFileAttributes attr = view.readAttributes();
		
		FileTime creationTime = attr.creationTime();
		System.out.println(creationTime);
		
		FileTime lastAccessedTime = attr.lastAccessTime();
		System.out.println(lastAccessedTime);
		
		FileTime modifiedTime = attr.lastModifiedTime();
		System.out.println(modifiedTime);
		
	}
}
