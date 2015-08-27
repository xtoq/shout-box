/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shout.box;

import java.util.Scanner;

/**
 * Functions to collect various types of user input.
 *
 * @author Smokie Lee
 */
public class userInput {

  /**
   * No argument constructor.
   */
  public userInput() {
  }

  /**
   * Get next line of user input.
   *
   * @return userString Returns the value input by the user.
   */
  public String getUserString() {
    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    String userString = userInputScanner.nextLine(); // Create a new string variable to store the user input.
    return userString; // Returns the value of the user input.
  }

  /**
   * Get next integer (primitive) of user input.
   *
   * @return userInt Returns the value input by the user.
   */
  public int getUserInt() {
    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    int userInt = userInputScanner.nextInt(); // Create a new integer (primitive) variable to store the user input.
    return userInt; // Returns the value of the user input.
  }

  /**
   * Get next integer of user input.
   *
   * @return userInteger Returns the value input by the user.
   */
  public Integer getUserInteger() {
    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    Integer userInteger = userInputScanner.nextInt(); // Create a new integer variable to store the user input.
    return userInteger; // Returns the value of the user input.
  }
}
