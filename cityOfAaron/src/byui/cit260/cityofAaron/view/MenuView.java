/*
 * The MenuView - base abtract class for the menu views
 * Part of the view layer
 * Object of this class manages the menu views
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 * Date last modified: June 27, 2018
 */
package byui.cit260.cityofAaron.view;
import java.util.Scanner;
/**
 *
 * @author Laura Mazariegos, Jack McBride, Chuck Mikolyski
 */
public abstract class MenuView implements ViewInterface {
    
    // The data members common to all menu views
    protected final static Scanner keyboard = new Scanner(System.in);
    
    protected String menu; // This string hold the menu string
    protected int max; // This int hold the max input value

    // MenuView Constructor
    // Purpose: Initialize the view object with the menu string
    // Parameters: The menu string and the max value
    // Returns: none
    public MenuView(String _menu, int _max)
    {
        menu = _menu;
        max = _max;
    }
    
    
    
    // The displayMenu method
    // Purpose: displays the menu, gets the user's input. and does
    // the selected action
    // Parameters: none
    // Returns: non
    
    @Override public void displayMenu()
    {
        
        int menuOption;
        do
        {
           // Display the menu
           System.out.println(menu);
           // Prompt the user and get the user's input
           menuOption = getMenuOption();
           // Perform the desired action
           doAction(menuOption);
        // Determine and display the next view
        } while (menuOption != max);
        
    }

    // The getMenuOption method
    // Purpose: gets the user's input, makes sure it is withtin range
    // Parameters: none
    // Returns: the user input, between 1 and maxValue
    // =======================================================
    @Override public int getMenuOption()
    {
        // declare a variable to hold user's input
        int userInput;
        // begin loop
        do
        {
        System.out.format("\nPlease enter an option(1 - %d):", max);
        // get user input from the keyboard
            userInput = keyboard.nextInt();
        // if it is not a valid value, output an error message
            if(userInput < 1 || userInput > max)
            {
                System.out.format("\nError: input value must be between 1 and %d.", max);
            }
        // loop back to the top if input was not valid
        } while(userInput < 1 || userInput > max);
        // return the value input by the user
        return userInput;
    }
    
    
}
