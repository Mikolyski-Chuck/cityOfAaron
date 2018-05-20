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

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }
    
}
