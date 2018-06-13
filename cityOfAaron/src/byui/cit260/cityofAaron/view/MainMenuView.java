/*
 * The MainMenuView class file for the cityOfAaron project
 * Part of the view layer
 * Object of this class manages the main menu
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 * Date last modified: June 12, 2018
 */
package byui.cit260.cityofAaron.view;
import byui.cit260.cityofAaron.model.Game;
import byui.cit260.cityofAaron.model.Player;
import byui.cit260.cityofAaron.model.CropData;
import java.util.Scanner;

/**
 *
 * @author jackmcbride
 */
public class MainMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;
    
    // The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and
    //          does the selected action
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
        // Determine and display the next view
        } while (menuOption != max);
        
    }
    
    // The MainMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // =======================================================
    public MainMenuView()
    {
        theMenu = "\n" + 
                "**************************\n" +
                "* CITY OF AARON: MAIN GAME MENU *\n" +
                "**************************\n" +
                " 1 - Start new game\n" +
                " 2 - Get and start a saved game\n" +
                " 3 - Get help on playing the game\n" +
                " 4 - Save game\n" +
                " 5 - Quit\n";
        
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
            case 1: // if the option is 1, call startNewGame()
                startNewGame();
                break;
            case 2: // if the option is 2, call startExisting()
                startSavedGame();
                break;
            case 3: // if the option is 3, call displayHelpMenu()
                displayHelpMenuView();
                break;
            case 4: // if the option is 4, call displaySaveGame()
                displaySaveGameView();
                break;
            case 5: // if the option is 5, display a goodbye message
                System.out.println("Thanks for playing... goodbye.");
        }
    }
    
    // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    // =======================================================
    public void startNewGame()
    {
        
        // create a new game object
        Game theGame = new Game();
        // save a reference to it in the GameProject class
        cityofaaron.CityOfAaron.setTheGame(theGame);
        // display the banner page.
        System.out.println("\nWelcome to the city of Aaron. As the assigned " +
                           "\nruler of the city, you will serve for a 10 year " +
                           "\nterm. \nYour responsibilities will include: " +
                           "\n*Buying and selling land" +
                           "\n*Managing how many acres of crops to plant" +
                           "\n*Designating wheat to feed the people, " +
                           "\n   plant crops, and pay tithes and offerings." +
                           "\n"+
                           "\nMay your term of service to the city of Aaron " +
                           "\n   be a righteous and blessed one!");
        // create a new player object
        Player thePlayer = new Player();
        // prompt for and get the user's name
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();
        // save the user's name in the Player object
        thePlayer.setName(name);
        // save a reference to the Player object in the Game object
        theGame.setThePlayer(thePlayer);
        // display a welcome message
        System.out.println("\nWelcome " + name + " have fun.");
        // display the Game menu   
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenuView();
    
        // Create a CropData object
        CropData cropData = new CropData();
        
        // Initialize it
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setOffering(10);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setOfferingBushels(300);
        cropData.setAcresPlanted(1000);
        
        // Save a reference to it in the game
        theGame.setCropData(cropData);
    }
    
    // The startSavedGame method
    // Purpose: loads the game object and starts the game
    // Parameters: none
    // Returns: none
    // =======================================================
    public void startSavedGame()
    {
       System.out.println("\nStart saved game menu option selected.");

    }
    
    // The displayHelpMenuView method
    // Purpose: displays the help menu view
    // Parameters: none
    // Returns: none
    // =======================================================
    public void displayHelpMenuView()
    {
        HelpMenuView hmv = new HelpMenuView();
        hmv.displayMenuView();
    }
    
    // The displaySaveGameView method
    // Purpose: displays the save game view
    // Parameters: none
    // Returns: none
    // =======================================================
    public void displaySaveGameView()
    {
        System.out.println("\nDisplay save game option selected.");
    }
}


