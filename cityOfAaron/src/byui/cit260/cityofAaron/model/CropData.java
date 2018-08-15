/*
 * The CropData() class file for the cityOfAaron project
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
public class CropData implements Serializable {

    public static CropData getYear;
    public static CropData setYear;
    //public static CropData theYear;
    
    public CropData() {
    }
    
    private static int year;
    private int population;
    private int acresOwned;
    private int cropYield;
    private int wheatInStore;
    private int numberWhoDied;
    private int newPeople;
    private int harvest;
    private int harvestAfterOffering;
    private int offering;
    private int offeringBushels;
    private int peopleFed;
    private int acresPlanted;
    private int numStarved;
    private int eatenByRats;
    private int wheatForPeople;

    public int getYear() {
        return year;       
    }
    
    public int getPopulation() {
        return population;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public int getCropYield() {
        return cropYield;
    }

    public int getWheatInStore() {
        return wheatInStore;
    }

    public int getNumberWhoDied() {
        return numberWhoDied;
    }

    public int getNewPeople() {
        return newPeople;
    }

    public int getHarvest() {
        return harvest;
    }

    public int getHarvestAfterOffering() {
        return harvestAfterOffering;
    }

    public int getOffering() {
        return offering;
    }

    public int getOfferingBushels() {
        return offeringBushels;
    }

    public int getPeopleFed() {
        return peopleFed;
    }

    public int getAcresPlanted() {
        return acresPlanted;
    }

    public int getNumStarved() {
        return numStarved;
    }

    public int getEatenByRats() {
        return eatenByRats;
    }

    public int getWheatForPeople() {
        return wheatForPeople;
    }
    
    public ArrayList<ListItem> getReport() {
        
        ArrayList<ListItem> report = new ArrayList<>();

        report.add(new ListItem("Year", this.year));
        report.add(new ListItem("Acres Owned", this.acresOwned));
        report.add(new ListItem("Wheat in Store", this.wheatInStore));
        report.add(new ListItem("Wheat for People", this.wheatForPeople));

        

        return report;
    }

    public void setYear(int year) {
       this.year = year;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public void setCropYield(int cropYield) {
        this.cropYield = cropYield;
    }

    public void setWheatInStore(int wheatInStore) {
        this.wheatInStore = wheatInStore;
    }

    public void setNumberWhoDied(int numberWhoDied) {
        this.numberWhoDied = numberWhoDied;
    }

    public void setNewPeople(int newPeople) {
        this.newPeople = newPeople;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    public void setHarvestAfterOffering(int harvestAfterOffering) {
        this.harvestAfterOffering = harvestAfterOffering;
    }

    public void setOffering(int offering) {
        this.offering = offering;
    }

    public void setOfferingBushels(int offeringBushels) {
        this.offeringBushels = offeringBushels;
    }

    public void setPeopleFed(int peopleFed) {
        this.peopleFed = peopleFed;
    }

    public void setAcresPlanted(int acresPlanted) {
        this.acresPlanted = acresPlanted;
    }

    public void setNumStarved(int numStarved) {
        this.numStarved = numStarved;
    }

    public void setEatenByRats(int eatenByRats) {
        this.eatenByRats = eatenByRats;
    }

    public void setWheatForPeople(int wheatForPeople) {
        this.wheatForPeople = wheatForPeople;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "CropData{" + "year=" + year + ", population=" + population + 
                ", acresOwned=" + acresOwned + ", cropYield=" + cropYield + 
                ", wheatInStore=" + wheatInStore + ", numberWhoDied=" + numberWhoDied + 
                ", newPeople=" + newPeople + ", harvest=" + harvest + 
                ", harvestAfterOffering=" + harvestAfterOffering + 
                ", offering=" + offering + ", offeringBushels=" + offeringBushels + 
                ", peopleFed=" + peopleFed + ", acresPlanted=" + acresPlanted + 
                ", numStarved=" + numStarved + ", eatenByRats=" + eatenByRats + 
                ", wheatForPeople=" + wheatForPeople + '}';
    }
    
    
    
    
}
