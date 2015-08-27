/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shout.box;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Smokie Lee
 */
public final class createMessageList {

  private final userInput u = new userInput(); // Create new user input object.
  private Integer count;

  /**
   * No argument constructor.
   */
  public createMessageList() {
  }

  /**
   * Collect messages from user input and store them in a hash map.
   *
   * @param numMessages Number of messages the user wants to store.
   * @param messageListName Name of the message list.
   */
  public createMessageList(Integer numMessages, HashMap<Integer, String> messageListName) {
//    this.messageHashMap = new HashMap<>();
    // Set user input as messages.
    setMessages(numMessages, messageListName);
  }

  /**
   * Print out each message in the array list in a numbered list.
   *
   * @param messageListName Name of the message list.
   * @return printMessageList Returns a numbered list of messages.
   */
  public String printMessageList(HashMap<Integer, String> messageListName) {
    String printMessageList = "No messages entered.";
    for (Map.Entry<Integer, String> entry : messageListName.entrySet()) { // Enahnced for loop is more efficient here when we're iterating through the set.
      System.out.printf("%s: %s\n", entry.getKey(), entry.getValue()); // Print key and value as a list.
      // TODO: format this with tabs for extra goodness
    }
    return printMessageList;
  }

  /**
   *
   * @param messageListName Name of array list to access.
   * @param messageNumber Array index number.
   * @return message Returns message at provided index value.
   */
  public String printMessage(int messageNumber, HashMap<Integer, String> messageListName) {
    String message = ""; // Initialize variable for later use.
    System.out.printf("%s%n", messageListName.get(messageNumber));
    return message; // Return selected message.
  }

  /**
   *
   * @param messageListName Name of array list to access.
   * @return message Returns a single message via the printMessage function.
   */
  public String shoutOutCannedMessage(HashMap<Integer, String> messageListName) {
    int messageNumber = 0; // Initalize variable for holding the user input.
    do {
      System.out.printf("%nPlease type a number from the list below to print that message.%n%n");
      printMessageList(messageListName); // Print messages from the list in args.
      System.out.printf("%n>> ");
      messageNumber = u.getUserInteger(); // Set user input to the index value. 
    } while (messageNumber > messageListName.size()); // Keep iterating if user enters something outside the array index.

    System.out.printf("%n");

    return printMessage(messageNumber, messageListName); // Print selected message.
  }

  /**
   * Collect messages from the user.
   *
   * @param numMessages Number of messages to enter.
   * @param messageListName Name of the array message list to add to.
   */
  public void setMessages(Integer numMessages, HashMap<Integer, String> messageListName) {
    for (int i = 1; i <= numMessages; i++) { // Start the count at 1 instead of 0.
      System.out.printf("%nPlease enter a message:%n>> ");
      messageListName.put(i, u.getUserString()); // Add user input into hash map.
    }
  }
    
  public Integer getNumber() {
    System.out.printf("How many messages would you like to enter? Please enter a number.%n>> ");
    this.count = u.getUserInteger();
    return count;
  }
}
