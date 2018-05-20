/*
 * The ListItem() class file for the cityOfAaron project
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 */
package byui.cit260.cityofAaron.model;

import java.io.Serializable;

/**
 *
 * @author Laura Mazariegos
 */
public class ListItem implements Serializable{
    
    private String itemName;

    private int itemNumber;

    public ListItem() {
    }
     
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public ListItem(String itemName, int itemNumber) {
        this.itemName = itemName;
        this.itemNumber = itemNumber;
    }

}
