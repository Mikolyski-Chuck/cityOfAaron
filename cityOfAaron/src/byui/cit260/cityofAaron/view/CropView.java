/*
 * The MainMenuView class file for the cityOfAaron project
 * Part of the view layer
 * Object of this class manages the main menu
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 * Date last modified: June 12, 2018
 */
package byui.cit260.cityofAaron.view;

import byui.cit260.cityofAaron.model.*;
import byui.cit260.cityofAaron.control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @Chuck Mikolyski
 */

public class CropView 
{
    
    // Create a Scanner Object
    private static Scanner keyboard = new Scanner(System.in);
    
    // Get references to the Game object and the CropData object
    private static Game theGame = CityOfAaron.getTheGame();
    private static CropData cropData = theGame.getCropData();
    
    // Start Chuck Mikolyski
    // The feedPeopleView method
    // Purpose: Interface with the user input to set food aside to feed the
    // people
    // Parameters: None
    // Returns: None
    public static void feedPeopleView()
    {
        // Prompt the user to enter how much wheat they would like to set aside
        // to feed the people
        System.out.println("How much wheat would you like to set aside to " + 
                           "feed the people?");
        
        // Get the user input and save it
        int wheatSetAside = keyboard.nextInt();
        
        // Call the feedPeople() method to set aside food to feed the people.
        CropControl.feedPeople(wheatSetAside, cropData);
    }   
    // End Chuck Mikolyski
    
    // The buyLandView method
    // Purpose: Interface with the user input for buying land
    // Parameters: None
    // Returns: None
    public static void buyLandView()
    {
        // Get the cost of land for this round
        int price = CropControl.calcLandCost();
        
        // Prompt the user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushels per acre %n", price);
        System.out.println("\nHow many acres of land do you wish to buy?");
        
        // Get the user's input and save it
        int toBuy = keyboard.nextInt();
        
        // Call the buyland() method in the control layer to buy the land
        CropControl.buyLand(price, toBuy, cropData);
    }

    // The runCropsView() method
    // Prupose: Runs the Hamurabi game
    // Parameters: None;
    // Returns: None;
    public static void runCropsView()
    {
     
        // Call the buyLandView() Method
        buyLandView();
        feedPeopleView();
        // Add calls to the other crop view methods as they are written
    }

}
