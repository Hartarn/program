package com.caltech.files.project;
import java.io.File;
import java.util.Scanner;

public class LockMeFiles  {                   

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String path="D:\\Caltech\\";
File file=new File(path);
System.out.println("Menu  1.Add  2.Dlte 3.Search 4.Exit");
System.out.println("Enter your choice");
int ch=sc.nextInt();
while(true) {
switch(ch) {
case 1:System.out.println("file is added");
break;
case 2:System.out.println("file is deleted");
break;
case 3:System.out.println("file is searched");
break;
case 4:System.out.println("Exit");
}	
System.exit(ch);
}
}
}


