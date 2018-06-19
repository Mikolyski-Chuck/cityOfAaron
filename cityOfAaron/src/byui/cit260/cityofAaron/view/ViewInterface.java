/*
 * The ViewInterface class file for the cityOfAaron project
 * Part of the view layer
 * Object of this class manages the View Interface
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 * Date last modified: June 18, 2018
 */
package byui.cit260.cityofAaron.view;

/**
 *
 * @author Laura Mazariegos, Jack McBride, Chuck Mikolyski
 */
public interface ViewInterface {
    public void displayMenu();
    public int getMenuOption();
    public void doAction(int option);
}
