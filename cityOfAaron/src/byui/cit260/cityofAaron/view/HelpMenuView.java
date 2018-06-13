/*
 * The HelpMenuView class file for the cityOfAaron project
 * Part of the view layer
 * Object of this class manages the help menu
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 * Date last modified: June 12, 2018
 */
package byui.cit260.cityofAaron.view;

import java.util.Scanner;
/**
 *
 * @author Chuck Mikolyski
 */
public class HelpMenuView {
    
private String theMenu;
private int max;
Scanner keyboard = new Scanner(System.in);

// The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and
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
           System.out.println(theMenu);
           // Prompt the user and get the user's input
           menuOption = getMenuOption();
           // Perform the desired action
           doAction(menuOption);
        // Determine and display the next 
        } while (menuOption != max);
        
    }
    
    // The HelpMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // =======================================================
    public HelpMenuView()
    {
        theMenu = "\n" + 
                "**************************\n" +
                "* HELP MENU *\n" +
                "**************************\n" +
                " 1 - What are the goals of the game?\n" +
                " 2 - Where is the city of Aaron?\n" +
                " 3 - How do I view the map?\n" +
                " 4 - How do I move to another location?\n" +
                " 5 - How do I display a list of animals, provisions and" +
                " tools in the city storehouse?\n" +
                " 6 - back to the Main Menu";
               
        
        max = 6;
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
            case 1: // if the option is 1, call viewGoals()
                viewGoals();
                break;
            case 2: // if the option is 2, call viewAaronLocation()
                viewAaronLocation();
                break;
            case 3: // if the option is 3, call viewMapHelp()
                viewMapHelp();
                break;
            case 4: // if the option is 4, call viewMoveHelp()
                viewMoveHelp();
                break;
            case 5: // if the option is 5, call viewListHelp()
                viewListHelp();
                break;
            case 6: // if the option is 6, return to main menu
                
        }
    }
    
    // The viewGoals method
    // Purpose: Displays instructions on how to view game goals
    // Parameters: none
    // Returns: none
    // =======================================================
    public void viewGoals()
    {
        System.out.println("\nView goals menu option selected");
        
        
    }
    
    // The viewAaronLocation method
    // Purpose: Displays information on where the city of Aaron is located
    // Parameters: none
    // Returns: none
    //========================================================
    public void viewAaronLocation()
    {
        System.out.println("\nView Aaron location menu option selected");
    }

    // The viewMapHelp method
    // Purpose: Displays instructions on how to view the map
    // Parameters: none
    // Returns: none
    // =======================================================
    public void viewMapHelp()
    {
       System.out.println("\nView map help menu option selected");
       
    }
    
    // The viewMoveHelp method
    // Purpose: Displays instructions on how to move locations
    // Parameters: none
    // Returns: none
    // =======================================================
    public void viewMoveHelp()
    {
        System.out.println("\nView move help menu option selected");
    }
    
    // The view viewListHelp method
    // Purpose: Displays instructions on how to view list of animals, tools, etc
    // Parameters: none
    // Returns: none
    // =======================================================
    public void viewListHelp()
    {
        System.out.println("\nView list help menu option selected");
    }

}

