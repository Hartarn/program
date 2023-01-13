package com.caltech.files.project;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// display the files in ascending orders // 
public class AscnOrder {    
public static void main(String[] args) throws IOException {
String path="D:\\Caltech\\";
File file=new File(path);
File filename[]=file.listFiles(); //display operation starts//
//for-each//
System.out.println("the list of files in ascending order in the"+path+"is");
for(File ff:filename) {
System.out.println(ff.getName());	
}
}
}
		
		
		
		

