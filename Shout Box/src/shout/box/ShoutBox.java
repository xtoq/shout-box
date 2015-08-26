/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shout.box;

// NOTE: imports
import java.util.*; // Since we need 3 imports, this seems more prudent. Also endorsed by the Java documentation.

/**
 *
 * @author Smokie Lee
 */
public class ShoutBox {
  private final userInput u = new userInput(); // Create new user input object.
//  private final createMessageList l = new createMessageList(); // Create new message list object.
  
  // NOTE: getters
  
  /**
   * Print out each message in the array list in a numbered list.
   * @param messageListName Name of the message list.
   * @return getMessages    Returns a numbered list of messages.
   */
  public String getMessages(HashMap<Integer, String> messageListName) {
    String getMessages = "No messages entered.";
    for(Map.Entry<Integer, String> entry : messageListName.entrySet()) { // Enahnced for loop is more efficient here when we're iterating through the set.
       System.out.printf("%s: %s\n",entry.getKey(),entry.getValue()); // Print key and value as a list.
       // TODO: format this with tabs for extra goodness
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
      getMessages(messageListName); // Print messages from the list in args.
      System.out.printf("%n>> ");
      messageNumber = u.getUserInteger(); // Set user input to the index value. 
    }
    while (messageNumber > messageListName.size()); // Keep iterating if user enters something outside the array index.

    System.out.printf("%n");

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
      messageListName.put(i, u.getUserString()); // Add user input into hash map.
    }
  }

  /**
   * @param args the command line arguments
   */
//  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    
    // Create objects.
    ShoutBox a = new ShoutBox(); // Create main ShoutBox object.
    userInput u = new userInput(); // Create new user input object.
    HashMap<Integer, String> messageList = new HashMap<>(); // Create array list to hold user messages.
    Integer count; // Create a variable to hold the number of messages the user wants to input.
    
    // Welcome the user.
    System.out.printf("Welcome to the \"ShoutBox\" program. Let's shout some messages!%n%n");
    
    // Collect number of messages from user (this is the size of the hash map).
    System.out.printf("How many messages would you like to enter? Please enter a number.%n>> ");
    count = u.getUserInteger(); // Set count variable to user input.
    
    // Collect the messages from the user (these are the array list values).
    a.setMessages(count, messageList);
    
    // Print messages.
    a.shoutOutCannedMessage(messageList);

//    userInput error = new userInput(); // Test that the "error" message works.
    
//    System.out.printf("How many messages would you like to enter? Please enter a number.%n>> ");
//    count = u.getUserInt();
//    System.out.println("You entered: " + count);
    
  }

}