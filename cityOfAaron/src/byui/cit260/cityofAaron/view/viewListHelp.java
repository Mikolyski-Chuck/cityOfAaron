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
import java.io.PrintWriter;
/**
 *
 * @author Laura Mazariegos
 */
public class viewListHelp extends MenuView
{
    Game theGame = CityOfAaron.getTheGame();
    
    private static PrintWriter output = null;
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
                " 1 - View or print a list of the animals in the storehouse\n" +
                " 2 - View or print a list of the tools in the storehouse\n" +
                " 3 - View or print a list of the provisions in the storehouse\n" +
                " 4 - View or print a list of the authors of this game\n" +
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
        boolean run = true;
        System.out.println("Please press 1 to view or 2 to print the list.");
        while (!keyboard.hasNextInt()) 
        {
           System.out.println("Please put in an integer");  
            keyboard.next();
        }

        int userInput = keyboard.nextInt();
        //If user input is 1, display the list of animals in the store house.
        if (userInput == 1) {
            
            // Display the opening sentence
        System.out.println("\nHere are the quantities of animals in the storehouse");
        
        // Start the loop to iterate through the ArrayList
        for (ListItem i : animals)
        // Print the Name and quantity of animals in the ArrayList.
        System.out.println(i.getItemName() + ": " + i.getItemNumber());
        }    
            
        if (userInput == 2){    
            
            
            System.out.print("Print option selected.");
            keyboard.nextLine();
            
            //prompt the user for a fle name. get and save the users input
            //declare a string to hold the file name
            String filePath = keyboard.next();
            System.out.println("Please enter a file name.");
            
            try {
                //create the PrinterWriter object
                output = new PrintWriter(filePath);
                
                
                //output a heading for the report
                output.println("List of type and quantity of animals in the storehouse.");
                
                //use a for loop to get the data from the ArrayList
                //and output it
                for (ListItem i : animals)
                // Print the Name and quantity of animals in the ArrayList.
                output.println(i.getItemName() + ": " + i.getItemNumber());
            }
            
            catch (Exception e){
                //output error message
                System.out.println("There was an error printing the list.");
            }
            finally {
                //if (output!= null) close the file
                if (output != null) {
                        output.close();
                }
            }
        
        }
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
        // Print the Name and quantity of provisions in the ArrayList.
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


