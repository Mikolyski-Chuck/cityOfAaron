/*
 * The HelpMenuView class file for the cityOfAaron project
 * Part of the view layer
 * Object of this class manages the help menu
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 * Date last modified: June 13, 2018
 */
package byui.cit260.cityofAaron.view;

import byui.cit260.cityofAaron.model.Game;
import java.util.Scanner;
/**
 *
 * @author Jack McBride
 */
public class GameMenuView {
    
private String gameMenu;
private int max;
Scanner keyboard = new Scanner(System.in);
private Game theGame;

// The displayMenuView method
    // Purpose: displays the Game menu, gets the user's input, and
    // does the selected action
    // Parameters: none
    // Returns: none
    // =======================================================
    public void displayMenuView()
    {
        int menuOption;
        do
        {
           // Display the menu
           System.out.println(gameMenu);
           // Prompt the user and get the user's input
           menuOption = getMenuOption();
           // Perform the desired action
           doAction(menuOption);
        // Determine and display the next 
        } while (menuOption != max);
        
    }
    
    // The GameMenuView constructor
    // Purpose: Initialize the game menu data
    // Parameters: none
    // Returns: none
    // =======================================================
    public GameMenuView()
    {
        gameMenu = "\n" + 
                "**************************\n" +
                "* GAME MENU *\n" +
                "**************************\n" +
                " 1 - View the map\n" +
                " 2 - View/Print a list\n" +
                " 3 - Move to a new location\n" +
                " 4 - Manage the Crops\n" +
                " 5 - Return to the Main Menu\n";
               
        max = 5;
    }
    
    // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // =======================================================
    public int getMenuOption()
    {
        // declare a variable to hold user's input
        int userInput;
        // begin loop
        do
        {
        // get user input from the keyboard
            userInput = keyboard.nextInt();
        // if it is not a valid value, output an error message
            if(userInput < 1 || userInput > max)
            {
                System.out.println("\nOption must be between 1 and " + max);
            }
        // loop back to the top if input was not valid
        } while(userInput < 1 || userInput > max);
        // return the value input by the user
        return userInput;
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // =======================================================
    public void doAction(int option)
    {
        switch(option)
        {
            case 1: // if the option is 1, call viewMap()
                viewMap();
                break;
            case 2: // if the option is 2, call viewList()
                viewList();
                break;
            case 3: // if the option is 3, call moveToNewLocation()
                moveToNewLocation();
                break;
            case 4: // if the option is 4, call manageCrops()
                manageCrops();
                break;
            case 5: // if the option is 5, return to main menu
                
        }
    }
    
    // The viewMap method
    // Purpose: Displays the map
    // Parameters: none
    // Returns: none
    // =======================================================
    public void viewMap()
    {
        System.out.println("\nView map menu option selected");
        
        
    }
    
    // The viewList method
    // Purpose: Provides the user with a set list of options
    // Parameters: none
    // Returns: none
    //========================================================
    public void viewList()
    {
        viewListHelp list= new viewListHelp();
        list.displayMenu();
        
        //System.out.println("\nView/Print List menu option selected");
    }

    // The moveToNewLocation method
    // Purpose: Moves user to a new location
    // Parameters: none
    // Returns: none
    // =======================================================
    public void moveToNewLocation()
    {
       System.out.println("\nMove to a new Location menu option selected");
       
    }
    
    // The manageCrops method
    // Purpose: Takes the user through the manage Crops steps
    // Parameters: none
    // Returns: none
    // =======================================================
    public void manageCrops()
    {
        //System.out.println("\nManage crops menu option selected");
        CropView.runCropsView();
    }
  

}
