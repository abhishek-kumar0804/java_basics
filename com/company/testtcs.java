package com.company;

public class testtcs {
    public static void main(String args[]) {
        int i,j,x = 0;
        for(i=0; i< 5; i++) 
            for(j=0; j<5; j++) {
                x = (i+j-1);
                    System.out.print(x);
                    break;
            }
        
        System.out.print("next " + x);
    }
    
}
