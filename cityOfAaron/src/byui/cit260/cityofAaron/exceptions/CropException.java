/*
 * The CropException class file for the cityOfAaron project
 * Part of the Exception package
 * Class contains all of the calculation methods for managing crops
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 * Date last modified: 07/05/2018
 */
package byui.cit260.cityofAaron.exceptions;

/**
 *
 * @author Laura Mazariegos, Jack MacBride, Chuck Mikolyski
 */
public class CropException extends Exception
{
    //Default Constructor
    //Purpose: Initializes data members to default values
    //Parameters: non
    //Returns: none
    public CropException(){}

    //Parameterized constructor
    //Purpose: Initializes data members to value passed as a parameter
    //Parameters: A string containing a error message
    //Returns: none
    public CropException(String string)
    {
        super(string);
    }
}
