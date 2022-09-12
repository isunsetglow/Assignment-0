/*
 * Maria Hernandez
 * Assignment 1
 * COP3330
 * Sep 8th, 2022
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class MathGame {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int menu = 0;
    System.out.println("Welcome to random number generator!");

    planMenu(menu);

    scan.close();
  }

  public static void planMenu(int menu) {
    Scanner scan = new Scanner(System.in);
    int n = 0, userSum;
    System.out.println("How many values would you like to use? (Choose from 2-25)");

    n = scan.nextInt();

    int[] myArray = generator(n);

    System.out.println("Created!");

    while (menu < 5) {
      System.out.println("Select your option: ");
      System.out.println("1. Play game.");
      System.out.println("2. Swap values.");
      System.out.println("3. New values.");
      System.out.println("4. Sort.");
      System.out.println("5. Exit.");

      menu = scan.nextInt();

      switch (menu) {
        case 1:
          System.out.println("Add these values: " + Arrays.toString(myArray));
          userSum = scan.nextInt();
          summation(userSum, myArray);
          break;
        case 2:
          int swap;
          System.out.println("How many swaps?");
          swap = scan.nextInt();
          swap(myArray, swap);
          System.out.println("Final: " + Arrays.toString(myArray) + "\n");
          break;
        case 3:
          int[] myArr = newValues(n);
          System.out.println("New values: " + Arrays.toString(myArr) + "\n");
          break;
        case 4:
          System.out.println("Current: " + Arrays.toString(myArray));
          Arrays.sort(myArray);
          System.out.println("Final: " + Arrays.toString(myArray) + "\n");
          break;
        case 5:
          System.out.println("Goodbye!");
        default:
          break;
      }
    }
    scan.close();
  }

  // method that generates random numbers
  // method will return an array with 'n' numbers
  // ranNum == n
  public static int[] generator(int ranNum) {
    int[] myNum = new int[ranNum];

    // for loop to generate ranNum aka 'n' amount of numbers
    for (int i = 0; i < myNum.length; i++) {
      // random numbers from 5-20
      myNum[i] = range(5, 20);
    }

    return myNum;
  }

  // method for range
  public static int range(int a, int b) {
    Random numbers = new Random();
    int randInt = numbers.nextInt(b + 1 - a) + a;
    return randInt;
  }

  // method for option 1: game
  public static void summation(int userSum, int[] myArray) {
    int sum = 0;
    //System.out.println(Arrays.toString(myArray));

    for (int i = 0; i < myArray.length; i++) {
      sum += myArray[i];
    }

    if (userSum == sum) {
      System.out.println("That is correct!\n");
    } else {
      System.out.println("That was incorrect. The value adds up to be: " + sum + "\n");
    }
  }

  // method for option 2: swapping
  public static void swap(int[] myArray, int i) {
    for (i = 0; i < myArray.length; i++) {
      int temp = myArray[i];
      myArray[i] = myArray[myArray.length - 1];
      myArray[myArray.length - 1] = temp;
    }
  }

  // method option 3: create new values
  public static int[] newValues(int newNum) {
    int[] myArray = new int[newNum];

    // for loop to generate ranNum aka 'n' amount of numbers
    for (int i = 0; i < myArray.length; i++) {
      // random numbers from 5-20
      myArray[i] = range(5, 20);
    }
    return myArray;
  }
}
