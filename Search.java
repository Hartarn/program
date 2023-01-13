package com.caltech.files.project;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// search the files// 
public class Search {    
public static void main(String[] args) throws IOException {
String path="D:\\Caltech\\";
Scanner sc=new Scanner(System.in);
System.out.println("enter the file to search");
String filenamesearch=sc.next();
File file=new File(path);
File filename[]=file.listFiles(); //display operation starts//
//for-each//
int flag=0;
for(File ff:filename) {
if(ff.getName().equals(filenamesearch)) {
flag=1;
break;
}	
else {
flag=0;	
}
}
if (flag==1) {
System.out.println("file is found");	
}
else {
System.out.println("file is not found");	
}
}
}
		

