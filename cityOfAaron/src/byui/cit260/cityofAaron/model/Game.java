/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
