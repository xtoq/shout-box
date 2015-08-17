/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shout.box;

// NOTE: imports
import java.util.ArrayList; 
import java.util.Scanner;

/**
 *
 * @author Smokie Lee
 */
public class ShoutBox {
  
  // NOTE: getters

  /**
   * Get next line of user input.
   * @return userInputValue
   */
   public String getUserInput() {
    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    String userInputValue = userInputScanner.nextLine(); // Create a new string variable to store the user input.
    return userInputValue; // Returns the value of the user input.
  }
  
  /**
   * Get next integer of user input.
   * @return userInputValue
   */
  public int getUserInteger() {
    Scanner userInputScanner = new Scanner(System.in); // Create a new scanner object to collect the user input.
    int userInputValue = userInputScanner.nextInt(); // Create a new string variable to store the user input.
    return userInputValue; // Returns the value of the user input.
  }
  
  /**
   * Print out each message in the array list in a numbered list.
   * @param messageListName Name of the array message list.
   * @return getMessages
   */
  public String getMessages(ArrayList messageListName) {
    int order = 0; // Counter for the numbered list.
    String getMessages = "No messages entered.";
    for (Object message : messageListName) { // Enhanced for loop is more efficient here.
      System.out.printf("%s. %s%n",String.valueOf(order++ + 1),message); // We're adding 1 to the order value to make this human-readable since the index starts at 0.
    }
    return getMessages;
  }
  
  /**
   *
   * @param messageListName
   * @param messageNumber
   * @return
   */
  public String getSingleMessage(int messageNumber,ArrayList messageListName) {
    String message = "No message entered."; // Value with no message entered.
    System.out.printf("%s%n",messageListName.get(messageNumber));
    //messageListName.get(messageNumber);
    return message; // Return selected message.
  }
  
  // NOTE: setters
  
  /**
   * Collect messages from the user.
   * @param numMessages     Number of messages to enter.
   * @param messageListName Name of the array message list to add to.
   */    
  public void setMessages(int numMessages,ArrayList messageListName) {
    for (int i = 1; i <= numMessages; i++) { // Start the count at 1 instead of 0.
      System.out.printf("%nPlease enter a message:%n>> ");
      messageListName.add(getUserInput()); // Add user input into array list.
    }
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
//    - class must be named shoutOutCannedMessage()
    
    // Create objects.
    ShoutBox a = new ShoutBox(); // Create main ShoutBox object.
    ArrayList<String> messageList = new ArrayList<>(); // Create array list to hold messages.
    int count; // Create a variable to hold the number of messages the user wants to input.
    int messageNum; // Create a variable to hold the message the user wants to print.
    
    // Welcome the user.
    System.out.printf("Welcome to the \"ShoutBox\" program. Let's shout some messages!%n%n");
    
    // Collect number of messages from user.
    System.out.printf("How many messages would you like to enter? Please enter a number.%n>> ");
    count = a.getUserInteger();
    
    // Collect the messages from the user.
    a.setMessages(count, messageList);
    
    // Print out each message.
    System.out.printf("%n%n-------------------%n%n");
    System.out.printf("Your messages are:%n%n");
    a.getMessages(messageList);
    
    // user chooses a message
    System.out.printf("%n%n-------------------%n%n");
    System.out.printf("Please choose a message.");
    messageNum = a.getUserInteger() - 1;
    
    // print user's message
    a.getSingleMessage(messageNum, messageList);
    
//    - shoutOutCannedMessage() displays all messages AND allows user to select one
//    - then return selected string
  }
  
}
