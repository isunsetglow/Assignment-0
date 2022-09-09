/*
 * Maria Hernandez
 * Assignment 0
 * COP3330
 * Aug 27th, 2022
 */

import java.util.Scanner;

class MathGame {
    public static void main(String[] args) {
        System.out.println("Welcome to random number generator!");
        
    }

    public static void planMenu(int menu) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values would you like to use?");
        // Array has been initialized and user will input the size 
        // they want before the menu is presented.
        
        int n = input.nextInt();
        int[] myNum = new int[n];
        // for loop for the array
        for(n = 0; n < size ; n++) {
            myNum[n] = 
        }
    
        while (menu < 5) {
          System.out.println("1. Play game.");
          System.out.println("2. Swap values.");
          System.out.println("3. New values.");
          System.out.println("4. Sort.");
          System.out.println("5. Exit.");
    
          menu = scan.nextInt();
    
          switch (menu) {
            case 1:
              
              break;
            case 2:
              
              break;
            case 3:
              
              break;
            case 4:
              
              break;
            case 5:
              System.out.println("Goodbye!");
            default:
              break;
          }
        }
        scan.close();
      }
}
