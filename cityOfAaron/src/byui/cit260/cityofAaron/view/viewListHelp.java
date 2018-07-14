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
                " 1 - View or save a list of the animals in the storehouse\n" +
                " 2 - View or save a list of the tools in the storehouse\n" +
                " 3 - View or save a list of the provisions in the storehouse\n" +
                " 4 - View or save a list of the authors of this game\n" +
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
    // Parameters: int option
    // Returns: none
    // =======================================================
    @Override public void doAction(int option)
    {
        OUTER:
        switch (option) {
            case 1: // if the option is 1, check to see if user wants to view or save
                System.out.println("Please press 1 to view the list or 2 to save the list.");
                while (!keyboard.hasNextInt()) {
                    System.out.println("Please put in an integer");
                    keyboard.next();
                }

                int userInput = keyboard.nextInt();
                
                if (userInput == 1){
                    viewAnimals();
                    break;
                }
                else if (userInput == 2) {
                    saveAnimals();
                    break;
                }
                
                else {
                    System.out.println("That is not a valid option. returning to menu.");
                }
                break;
            case 2: // if the option is 2, call viewTools()
                viewTools();
                break;
            case 3:
                System.out.println("Please press 1 to view available provisions or 2 to save current provisions.");
                while (!keyboard.hasNextInt()) {
                    System.out.println("Please select 1 or 2 ");
                    keyboard.next();
                }
                userInput = keyboard.nextInt();
                
                switch (userInput) {
                    case 1:
                        viewProvisions();
                        break OUTER;
                    case 2:
                        saveProvisions();
                        break OUTER;
                    default:
                        System.out.println("That is not a valid option, Returning to menu.");
                        break;
                }
                break;
            case 4: // if the option is 4, call viewAuthors()
                viewAuthors();
                break;
            case 5:
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
    
    // The saveAnimals method
    // Purpose: saves a list of animals in the store house to disk
    // Parameters: none
    // Returns: none
    // =======================================================
    public void saveAnimals() {
        
        
        System.out.print("Save option selected.");
            keyboard.nextLine();
            
            //declare a string to hold the file name
            String filePath;
            
            //declare a reference to the PrintWriter object
              PrintWriter output = null;
            
            //prompt the user for a fle name. get and save the users input
            System.out.println("\nPlease enter a file name:");
            filePath = keyboard.next();
            
            
            try {
                //create the PrinterWriter object
                output = new PrintWriter(filePath);
                
                //get a reference to the ArrayList to output
                ArrayList<ListItem> animals = theGame.getAnimals();
                
                //output a heading for the report
                output.println("Animals in the Storehouse");
                output.printf("%n%-13s%-10s", "Type", "Quantity");
   
                //use a for loop to get the data from the ArrayList
                //and output it
                for (ListItem i : animals){
                output.printf("%n%-10s%-3s%-5d"
                                                , i.getItemName ()  
                                                , ":"
                                                , i.getItemNumber());
                }
                System.out.println("List saved.");
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
    
    // The saveProvisions method
    // Purpose: saves a list of provisions in the storehouse to disk
    // Parameters: none
    // Returns: none
    // =======================================================
     public void saveProvisions() {
        
        
        System.out.print("Save option selected.");
            keyboard.nextLine();
            
            //declare a string to hold the file name
            String filePath;
            
            //declare a reference to the PrintWriter object
              PrintWriter output = null;
            
            //prompt the user for a fle name. Get and save the users input
            System.out.println("\nPlease enter a file name to save provisions:");
            filePath = keyboard.next();
            
            
            try {
                //create the PrinterWriter object
                output = new PrintWriter(filePath);
                
                //get a reference to the ArrayList to output
                ArrayList<ListItem> provisions = theGame.getProvisions();
                
                //output a heading for the report
                output.println("Available Provisions in the Storehouse");
                output.printf("%n%-13s%-10s", "Type", "Quantity");
   
                //use a for loop to get the data from the ArrayList
                //and output it
                for (ListItem i : provisions){
                output.printf("%n%-10s%-3s%-5d"
                                                , i.getItemName ()  
                                                , ":"
                                                , i.getItemNumber());
                }
                System.out.println("List saved.");
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


