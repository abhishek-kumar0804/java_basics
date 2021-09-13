package com.company;
import java.util.Scanner;
public class Ch_Practice_1 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);  // create a scan object
    System.out.println("Enter marks of 1st subject");
    int sub1 = scan.nextInt();  // Read user input
    
    // System.out.println(cgpa1);
    System.out.println("Enter marks of 2nd subject");
    int sub2 = scan.nextInt();
    System.out.println("Enter marks of 3rd subject");
    int sub3 = scan.nextInt();
    double cgpa = (sub1 + sub2 + sub3)/300d* 9.8;

     System.out.println(cgpa);
    //  System.out.println(sub1);
    scan.close();
    }

}
