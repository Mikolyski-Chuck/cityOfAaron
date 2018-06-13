/*
 * The Game() class file for the cityOfAaron project
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 */
package byui.cit260.cityofAaron.model;

import java.io.Serializable;

/**
 *
 * @author jackmcbride
 */
public class Game implements Serializable {
    private  Player thePlayer;
    private CropData cropData = null;

    
    // The getCropData() method
    // Purpose: Get a reference to the crop object
    // Parameters: None
    // Returns: A reference to a crop object
    public CropData getCropData() 
    {
        return cropData;
    }
    
    // The setCropData() Method
    // Purpose: Store a reference to a crop object
    // Parameters: A Reference to a crop object
    // Returns: None
    public void setCropData(CropData _cropRef) 
    {
        cropData = _cropRef;
    }
    
    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }
    
}
