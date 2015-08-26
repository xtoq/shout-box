/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shout.box;

// NOTE: imports
//import java.util.ArrayList; 
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Smokie Lee
 */
public class ShoutBox {
  
  // NOTE: getters

  /**
   * Get next line of user input.
   * @return userInputValue   Returns the value input by the user.
   */
   public String getUserString() {
    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    String userInputValue = userInputScanner.nextLine(); // Create a new string variable to store the user input.
    return userInputValue; // Returns the value of the user input.
  }
  
  /**
   * Get next integer of user input.
   * @return userInputValue   Returns the value input by the user.
   */
  public int getUserInt() {
    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    int userInputValue = userInputScanner.nextInt(); // Create a new string variable to store the user input.
    return userInputValue; // Returns the value of the user input.
  }
  
  /**
   * Get next integer of user input.
   * @return userInputValue   Returns the value input by the user.
   */
  public int getUserInteger() {
    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    Integer userInputValue = userInputScanner.nextInt(); // Create a new string variable to store the user input.
    return userInputValue; // Returns the value of the user input.
  }
  
  /**
   * Print out each message in the array list in a numbered list.
   * @param messageListName Name of the array message list.
   * @return getMessages    Returns a numbered list of messages.
   */
//  public String getMessages(ArrayList<String> messageListName) {
  public String getMessages(HashMap<Integer, String> messageListName) {
    int order = 1; // Counter for the numbered list.
    String getMessages = "No messages entered.";
//    for (Object message : messageListName) { // Enhanced for loop is more efficient here.
//    for (Map.Entry<Integer, String> entry : messageListName.entrySet())
//    for (Map.Entry<Integer, String> entry : messageListName) { // Enhanced for loop is more efficient here.
//      System.out.printf("%s. %s%n",String.valueOf(order++),message); // We're adding 1 to the order value to make this human-readable since the index starts at 0.
//    }
    for(Map.Entry<Integer, String> entry : messageListName.entrySet()) {
//       System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
//       System.out.printf("%s. %s%n",String.valueOf(order++),entry); // We're adding 1 to the order value to make this human-readable since the index starts at 0.
       System.out.printf("%s. %s%n",entry.getValue(),entry.getKey());
    }
    return getMessages;
  }
  
  /**
   *
   * @param messageListName Name of array list to access.
   * @param messageNumber   Array index number.
   * @return message        Returns message at provided index value.
   */
//  public String getSingleMessage(int messageNumber,ArrayList<String> messageListName) {
  public String getSingleMessage(int messageNumber,HashMap<Integer, String> messageListName) {
    String message = ""; // Initialize variable for later use.
    System.out.printf("%s%n",messageListName.get(messageNumber));
    return message; // Return selected message.
  }
  
//  public String shoutOutCannedMessage(ArrayList<String> messageListName) {
  public String shoutOutCannedMessage(HashMap<Integer, String> messageListName) {
    int messageNumber = 0; // Initalize variable for holding the user input.
    do {
      System.out.printf("%nPlease type a number from the list below to print that message.%n%n");
//      getMessages(messageListName); // Print messages from the list in args.
      for(Map.Entry<Integer, String> entry : messageListName.entrySet()) {
        System.out.printf("%s: %s\n",entry.getKey(),entry.getValue());
      }
      System.out.printf("%n>> ");
      messageNumber = getUserInteger(); // Set user input to the index value. 
    }
    while (messageNumber > messageListName.size()); // Keep iterating if user enters something outside the array index.

    System.out.printf("%n");
    
//    do {
//      System.out.printf("%nPlease type a number from the list below to print that message.%n%n");
//      // Print messages from the list in args.
//      for(Map.Entry<Integer, String> entry : messageList.entrySet()) {
//        System.out.printf("%s: %s\n",entry.getKey(),entry.getValue());
//      }
//      System.out.printf("%n>> ");
////      count = a.getUserInteger() - 1; // Subtract one from the user input to get the index value. 
//      count = a.getUserInteger(); // Set user input to the index value.
//    }
//    while (count > messageList.size()); // Keep iterating if user enters something outside the array index.
//
//    System.out.printf("%n");
//    
//    System.out.printf("%s%n",messageList.get(count)); // Print selected message.

    return getSingleMessage(messageNumber, messageListName); // Print selected message.
  }
  
  // NOTE: setters
  
  /**
   * Collect messages from the user.
   * @param numMessages     Number of messages to enter.
   * @param messageListName Name of the array message list to add to.
   */    
//  public void setMessages(int numMessages,ArrayList<String> messageListName) {
  public void setMessages(Integer numMessages, HashMap<Integer, String> messageListName) {
    for (int i = 1; i <= numMessages; i++) { // Start the count at 1 instead of 0.
      System.out.printf("%nPlease enter a message:%n>> ");
      messageListName.put(i, getUserString()); // Add user input into hash map.
    }
  }

  /**
   * @param args the command line arguments
   */
//  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    
    // Create objects.
    ShoutBox a = new ShoutBox(); // Create main ShoutBox object.
    HashMap<Integer, String> messageList = new HashMap<>(); // Create array list to hold user messages.
    Integer count; // Create a variable to hold the number of messages the user wants to input.
    
    // Welcome the user.
    System.out.printf("Welcome to the \"ShoutBox\" program. Let's shout some messages!%n%n");
    
    // Collect number of messages from user (this is the size of the hash map).
    System.out.printf("How many messages would you like to enter? Please enter a number.%n>> ");
    count = a.getUserInteger(); // Set count variable to user input.
    
    // Collect the messages from the user (these are the array list values).
    a.setMessages(count, messageList);
    
    // Print messages.
    a.shoutOutCannedMessage(messageList);
    
//    // Collect number of messages from user (this is the size of the hash map).
//    System.out.printf("How many messages would you like to enter? Please enter a number.%n>> ");
//    count = a.getUserInteger(); // Set count variable to user input.

//    // Collect the messages from the user (these are the map values).
//    for (int i = 1; i <= count; i++) { // Start the count at 1 instead of 0.
//      System.out.printf("%nPlease enter a message:%n>> ");
//      messageList.put(i, a.getUserString()); // Add user input into hash map.
//    }
    
//    do {
//      System.out.printf("%nPlease type a number from the list below to print that message.%n%n");
//      // Print messages from the list in args.
//      for(Map.Entry<Integer, String> entry : messageList.entrySet()) {
//        System.out.printf("%s: %s\n",entry.getKey(),entry.getValue());
//      }
//      System.out.printf("%n>> ");
////      count = a.getUserInteger() - 1; // Subtract one from the user input to get the index value. 
//      count = a.getUserInteger(); // Set user input to the index value.
//    }
//    while (count > messageList.size()); // Keep iterating if user enters something outside the array index.
//
//    System.out.printf("%n");
//    
//    System.out.printf("%s%n",messageList.get(count)); // Print selected message.
    
//    // TODO: add close function below
//    Boolean close = false;
//    do {
//      // DO THIS
//    }
//    while (close = false);
  }
  
}
