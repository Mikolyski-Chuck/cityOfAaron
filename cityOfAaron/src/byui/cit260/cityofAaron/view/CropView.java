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
    // The feedPeopleView() method
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
    
    // Start Jack McBride
    // The setOfferingView method
    // Purpose: Interface with the user input to set tithe offering
    // Parameters: None
    // Returns: None
    public static void setOfferingView()
    {
        // Prompt the user to enter how much wheat they would like to pay as
        // tithe
        System.out.println("What percentage of harvest would you like to " + 
                           "offer as tithes?");
        
        // Get the user input and save it
        int offering = keyboard.nextInt();
        
        // Call the setOffering() method to set aside food to feed the people.
        CropControl.setOffering(offering);
    }   
    // End Jack McBride
    
     // Start Laura Mazariegos
    // The plantCrops method
    // Purpose: Interface with the user input to set how many crops to plant
    // Parameters: None
    // Returns: None
    public static void plantCropsView()
    {
        // Prompt the user to enter how much wheat they would like to use to
        //  plant crops
        System.out.println("How many crops would you like to plant? ");
        
        // Get the user input and save it
        int acresPlanted = keyboard.nextInt();
        
        // Call the plantCrops() method to plant crops to harvest.
        CropControl.plantCrops(acresPlanted,cropData);
    }   
    // End Laura Mazariegos
    // The plantCrops method
    // Purpose: Interface with the user to set how many crops to plant
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
        setOfferingView();
        feedPeopleView();
        // Add calls to the other crop view methods as they are written
    }

}
