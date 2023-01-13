package com.caltech.files.project;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// delete a file in a directory// 
public class Dlte {    
public static void main(String[] args) throws IOException {
String path="D:\\Caltech\\";
Scanner sc=new Scanner(System.in);
String filename=sc.next();
String finalpath=path+filename;
System.out.println(finalpath);
File file=new File(finalpath);	
//delete a file//
file.delete();
System.out.println("file gets deleted");	
}
}



