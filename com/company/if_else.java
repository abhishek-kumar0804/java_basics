package com.company;
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1");
        float sub1 = sc.nextInt();
        System.out.println("Enter marks of subject 2");
        float sub2 = sc.nextInt();
        System.out.println("Enter marks of subject 3");
        float sub3 = sc.nextInt();
        float total = (sub1 +sub2 +sub3)/300 *100 ;
        System.out.println(total);
        if(sub1/100*100 >= 33 && sub2/100*100 >=33 && sub3/100*100 >= 33 && total >= 40) {
            System.out.println("Student is pass");

        }else {
            System.out.println("Student is fail");
            
        }


        
    }
}
