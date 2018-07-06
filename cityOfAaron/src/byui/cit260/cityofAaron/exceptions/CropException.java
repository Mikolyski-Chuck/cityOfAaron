/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofAaron.exceptions;

/**
 *
 * @author Chuck Mikolyski
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
