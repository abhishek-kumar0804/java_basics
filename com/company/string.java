package com.company;
// import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        // String name = new String("Abhishek Kumar");
        String name = "Abhishek Kumar";
        System.out.println("The length of the string is:" + name.length());
        System.out.println("string in uppercase:" + "--" +name.toUpperCase());
        System.out.println("The index of the string is:" + name.indexOf(2));
        String name2 = "    Muskan Gul   ";
        int length = name2.length();
        System.out.println(length);
        String rename = new String("oppo");
        System.out.println(name2.length());
        // System.out.println(name2.trim().charAt(length));
        System.out.println(name2.contains("ka"));
        System.out.println(rename.replace("pp", "lt"));



        

    }
    
}
