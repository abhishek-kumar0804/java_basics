package com.company;
import java.util.Random;
import java.util.Scanner;
public class rock_Paper_Scissor {
    public static void main( String[] args) {
        
        Random xyz = new Random();
        Scanner sc = new Scanner(System.in);
        
        int i = 0;
        for(i =0;i<=5; i++  ) {
            System.out.println("Enter 0 for ROCK 1 for PAPER and 2 for scissor");
            int input = sc.nextInt();
        if( input == 0) {
            int computerRandom = xyz.nextInt(3);
            if( computerRandom == 0) {
                System.out.println("Opponent: ROCK");

            }else if(computerRandom == 1) {
                System.out.println("Opponent: PAPER"); 

            }else if(computerRandom == 2) {
                System.out.println("Opponent: SCISSOR"); // generating random number

            }
            if( input == computerRandom) {
                System.out.println("Try again (DRAW)");
            }else if( input < computerRandom && computerRandom == 1) {
                System.out.println("You lose");
            }else if(input < computerRandom && computerRandom == 2) {
                System.out.println("You win");
            }
        }
        if( input == 1) {
            int computerRandom = xyz.nextInt(3);
            if( computerRandom == 0) {
                System.out.println("Opponent: ROCK");

            }else if(computerRandom == 1) {
                System.out.println("Opponent: PAPER"); 

            }else if(computerRandom == 2) {
                System.out.println("Opponent: SCISSOR"); // generating random number

            }
            
            if( input == computerRandom) {
                System.out.println("Try again (DRAW)");
            }else if( input > computerRandom ) {
                System.out.println("You win");
            }else if(input < computerRandom ) {
                System.out.println("You lose");
            }
        }
        if( input == 2) {
            int computerRandom = xyz.nextInt(3);
            if( computerRandom == 0) {
                System.out.println("Opponent: ROCK");

            }else if(computerRandom == 1) {
                System.out.println("Opponent: PAPER"); 

            }else if(computerRandom == 2) {
                System.out.println("Opponent: SCISSOR"); // generating random number

            }
            if( input == computerRandom) {
                System.out.println("Try again (DRAW)");
            }else if( input > computerRandom && computerRandom == 0) {
                System.out.println("You lose");
            }else if(input > computerRandom && computerRandom == 1) {
                System.out.println("You win");
            }
        };
        
        
    }
        


    }

}
