/*
 * The ViewListHelp class file for the cityOfAaron project
 * Part of the view layer
 * Object of this class manages the help menu
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 * Date last modified: June 23, 2018
 */
package byui.cit260.cityofAaron.view;
import byui.cit260.cityofAaron.model.*;
import java.util.ArrayList;
import cityofaaron.CityOfAaron;
/**
 *
 * @author Laura Mazariegos
 */
public class viewListHelp extends MenuView
{
    Game theGame = CityOfAaron.getTheGame();
    /*private String theList;
    private int max;
    Scanner keyboard = new Scanner(System.in);
    
    //The View/Print list method
    //Purpose: Provides the user with a set of list options
    //Paramaters: none
    //Returns: none
    
    public void displayListHelp()
    {
        int listOption;
        do
        {
            //Display the list menu
            System.out.println(theList);
            
            //Prompt user and process input
            listOption = getListOption();
        
            //Perform action
            doAction(listOption);
        }   
            //Display within parameters
            while (listOption!= max);
        
    }*/
    
    //The View List help constructor
    //Purpose: to display the list options to the user
    //Parameters: none
    //Return: none
    //===========================================================
    public viewListHelp()
    {
        super ("\n" +
                "**************************\n" +
                "* LIST MENU *\n" +
                "**************************\n" +
                " 1 - List or view the animals in the storehouse\n" +
                " 2 - List or view the tools in the storehouse?\n" +
                " 3 - List or view the provisions in the storehouse?\n" +
                " 4 - List or view the authors of this game?\n" +
                " 5 - Back to the Main Menu",
                5);
    }

    // The getListOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // =======================================================
    /*public int getListOption()
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
    }*/
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // =======================================================
    @Override public void doAction(int option)
    {
        switch(option)
        {
            case 1: // if the option is 1, call viewAnimals()
                viewAnimals();
                break;
            case 2: // if the option is 2, call viewTools()
                viewTools();
                break;
            case 3: // if the option is 3, call viewProvisons()
                viewProvisions();
                break;
            case 4: // if the option is 4, call viewAuthors()
                viewAuthors();
                break;
            case 5: // if the option is 5, return to main menu
                // mainMenuReturn();               
        }
    }
    
    //Start Chuck Mikolyski
    // The viewAnimals method
    // Purpose: Displays how many animals are in the storehouse
    // Parameters: none
    // Returns: none
    // =======================================================
    public void viewAnimals()
    {  
        // Create the animals variable ArrayList and store the current
        // type and amount of animals in the list.
        ArrayList<ListItem> animals = theGame.getAnimals();
        
        // Display the opening sentence
        System.out.println("\nHere are the quantities of animals in the storehouse");
        
        // Start the loop to iterate through the ArrayList
        for (ListItem i : animals)
        // Print the Name and quantity of animals in the ArrayList.
        System.out.println(i.getItemName() + ": " + i.getItemNumber());
    }
    //End Chuck Mikolyski
    
    // Start Jack McBride
    // The viewTools method
    // Purpose: Displays what tools are in the storehouse
    // Parameters: none
    // Returns: none
    //========================================================
    public void viewTools()
    {
        ArrayList<ListItem> tools = theGame.getTools();
        
        System.out.println("\nHere are the tools available in the storehouse:");
        
        for (ListItem i : tools)
            System.out.println(i.getItemName() + ": " + i.getItemNumber());

    }
    // End Jack McBride
    
    //**start Laura Mazariegos**
    // The viewProvisons method
    // Purpose: Displays how many provisions are in the storehouse
    // Parameters: none
    // Returns: none
    // =======================================================
    public void viewProvisions()
    {
       // Create the provisions variable ArrayList and store the current
        // type and amount of provisions in the list.
        ArrayList<ListItem> provisions = theGame.getProvisions();
        
        // Display the opening sentence
        System.out.println("\nHere are the provisions available in the storehouse");
        
        // Start the loop to iterate through the ArrayList
        for (ListItem i : provisions)
        // Print the Name and quantity of animals in the ArrayList.
        System.out.println(i.getItemName() + ": " + i.getItemNumber());
    }
    //**end Laura Mazariegos**
    
    
    // The viewAuthors method
    // Purpose: Displays who the authors of this game are
    // Parameters: none
    // Returns: none
    // =======================================================
    public void viewAuthors()
    {
        System.out.println("\nThe Game's authors are"+
                "\nLaura Mazariegos \nChuck Mikolyski \nJack McBride");
    }
    
   
    
}


