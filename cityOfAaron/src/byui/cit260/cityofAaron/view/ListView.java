/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofAaron.view;
import byui.cit260.cityofAaron.model.ListItem;
import java.util.Scanner;
import byui.cit260.cityofAaron.control.GameControl;
/**
 *
 * @author laura
 */
public class ListView {
    private String listMenu;
    private int max;
    Scanner keyboard = new Scanner(System.in);
    private ListView theList;

// The ListView method
    // Purpose: displays the list , gets the user's input, and
    // does the selected action
    // Parameters: none
    // Returns: none
    // =======================================================
    public void displayListMenu()
    {
        int menuOption;
        do
        {
           // Display the menu
           System.out.println(listMenu);
           // Prompt the user and get the user's input
           menuOption = getListMenuOption();
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
    public ListView()
    {
        listMenu = "\n" + 
                "****************************\n" +
                "* CITY OF AARON: LIST MENU *\n" +
                "****************************\n" +
                " 1 - View the development team\n" +
                " 2 - View a list of animals\n" +
                " 3 - View a list of tools\n" +
                " 4 - View a list of provisions\n" +
                " 5 - Return to the Main Menu\n";
               
        max = 5;
    }
    
     // The getListMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // =======================================================
    public int getListMenuOption()
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
                viewTeam();
                break;
            case 2: // if the option is 2, call viewList()
                viewAnimals();
                break;
            case 3: // if the option is 3, call moveToNewLocation()
                viewTools();
                break;
            case 4: // if the option is 4, call manageCrops()
                viewProvisions();
                break;
            case 5: // if the option is 5, return to main menu
                
        }
    }
    
    // The viewTeam method
    // Purpose: Displays the team members
    // Parameters: none
    // Returns: none
    // =======================================================
    public void viewTeam()
    {
        System.out.println("\nView Team members option selected");
        
        
    }
    
    // The viewAnimals method
    // Purpose: Provides the user with a list of animals
    // Parameters: none
    // Returns: none
    //========================================================
    public void viewAnimals()
    {
        
        System.out.println("\nView animals List menu option selected");
    }

    // The viewTools method
    // Purpose: provides the user with a list of tools
    // Parameters: none
    // Returns: none
    // =======================================================
    public void viewTools()
    {
       System.out.println("\nView tools list menu option selected");
       
    }
    
    // The viewProvisions  method
    // Purpose: provides the user with a list of provisions
    // Parameters: none
    // Returns: none
    // =======================================================
    public void viewProvisions()
    {
        System.out.println("\nview provisions menu option selected");
        
    }
  

}


