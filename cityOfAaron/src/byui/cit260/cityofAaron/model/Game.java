/*
 * The Game() class file for the cityOfAaron project
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 */
package byui.cit260.cityofAaron.model;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author jackmcbride
 */
public class Game implements Serializable {
    private  Player thePlayer;
    private CropData cropData = null;
    private Map theMap;
    private ArrayList<ListItem> animals;
    private ArrayList<ListItem> tools;
    private ArrayList<ListItem> provisions;

    public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

    public ArrayList<ListItem> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }

    public ArrayList<ListItem> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }

    public ArrayList<ListItem> getProvisions() {
        return provisions;
    }

    public void setProvisions(ArrayList<ListItem> provisions) {
        this.provisions = provisions;
    }
    
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
