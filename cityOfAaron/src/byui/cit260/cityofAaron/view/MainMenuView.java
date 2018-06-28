/*
 * The MainMenuView class file for the cityOfAaron project
 * Part of the view layer
 * Object of this class manages the main menu
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 * Date last modified: June , 2018
 */
package byui.cit260.cityofAaron.view;
import byui.cit260.cityofAaron.control.GameControl;
import byui.cit260.cityofAaron.model.Game;
import byui.cit260.cityofAaron.model.Player;
import byui.cit260.cityofAaron.model.CropData;


/**
 *
 * @author jackmcbride
 */
public class MainMenuView extends MenuView {
    
    
    // The MainMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // =======================================================
    public MainMenuView()
    {
        super("\n" + 
                "**************************\n" +
                "* CITY OF AARON: MAIN GAME MENU *\n" +
                "**************************\n" +
                " 1 - Start new game\n" +
                " 2 - Get and start a saved game\n" +
                " 3 - Get help on playing the game\n" +
                " 4 - Save game\n" +
                " 5 - Quit\n", 
        5);
                                
        
    }
    
    
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // =======================================================
    @Override public void doAction(int option)
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
        
        
        // display the banner page.
        System.out.println(
                           "\n******************************************************"+
                           "\n*Welcome to the city of Aaron. You have been summoned* " +
                           "\n*by the High Priest to assume your role as ruler of  *" +
                           "\n*the city. Your responsibility is to buy land, sell  *" +
                           "\n*land, determine how much wheat to plant each year,  *" +
                           "\n*and how much to set aside to feed the people. You   *" +
                           "\n*will also be required to pay an annual tithe on the *" +
                           "\n*wheat that is harvested. If you fail to provide     *" +
                           "\n*enough wheat for the people to eat, people will die *"+
                           "\n*and your workforce will be diminished. Plan very    *" +
                           "\n*carefully or you may find yourself in trouble with  *"+
                           "\n*the people. And oh, watch out for plagues and rats! *"+
                           "\n******************************************************");
        
        // prompt for and get the user's name
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();
        
        // display a welcome message
        System.out.println("\nWelcome " + name + " have fun playing.");
        //call the createNewGame()method. pass the name as a parameter
        GameControl.createNewGame(name);
        
        // display the Game menu 
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();
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
        hmv.displayMenu();
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


