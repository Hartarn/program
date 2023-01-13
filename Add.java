
package com.caltech.files.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// adding file in a directory// 
public class Add {
public static void main(String[] args) throws IOException {
String path="D:\\Caltech\\";
Scanner sc=new Scanner(System.in);
String filename=sc.next();
String finalpath=path+filename;
System.out.println(finalpath);
	
//create a file//
File file=new File(finalpath);
boolean res=file.createNewFile();
if(res!=true) {  // ! means not equal to //
System.out.println("file is not created");	
}
else {
System.out.println("file is created");	
}
}
}








