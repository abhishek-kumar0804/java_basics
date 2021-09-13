package com.company;

public class while_loop {
    public static void main(String[] args)  {
        // int n =6;
        // for (int i = n; i >0; i--) {
        //     for(int j = 0; j <i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        
        int sum = 0;
        int n = 6;
        for(int i =0; i<n; i++) {
            
            if(i % 2 ==0) { 
                int even =i;
                // System.out.println(even  );
                sum = sum + even;


                // System.out.println(sum);
            }
            

        }
        System.out.println(sum);



    }
    
}
