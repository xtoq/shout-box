/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shout.box;

// NOTE: imports
import java.util.HashMap; // Since we need 3 imports, this seems more prudent. Also endorsed by the Java documentation.

/**
 * The ShoutBox class collects and displays user messages.
 *
 * @author Smokie Lee
 */
public class ShoutBox {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Create objects.
    userInput input = new userInput(); // Create new user input object.
    createMessageList list = new createMessageList();
    HashMap<Integer, String> messageMap = new HashMap<>(); // Create hash map to hold user messages.

    // Welcome the user.
    System.out.printf("Welcome to the \"ShoutBox\" program. Let's shout some messages!%n%n");

    // Collect number of messages from user (this is the size of the hash map).
    System.out.printf("How many messages would you like to enter? Please enter a number.%n>> ");
//    Integer count = input.getUserInteger(); // Create and set count variable to user input.
//    list.getNumber();

    // Collect the messages from the user (these are the hash map values).
//    createMessageList messages = new createMessageList(list.getNumber(), messageMap); // Create message list object and collect user input.
    list.setMessages(list.getNumber(), messageMap); // Create message list object and collect user input.
    

    // Print messages.
//    messages.shoutOutCannedMessage(messageMap);
    list.shoutOutCannedMessage(messageMap);

  }

}
