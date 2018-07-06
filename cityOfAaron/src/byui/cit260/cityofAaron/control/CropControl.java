/*
 * The CropControl() class file for the cityOfAaron project
 * Part of the control layer
 * Class contains all of the calculation methods for managing crops
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 */
package byui.cit260.cityofAaron.control;

import byui.cit260.cityofAaron.model.CropData;
import java.util.Random;
import byui.cit260.cityofAaron.exceptions.CropException;
public class CropControl {
    
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 11;

    //random number generator
    private static Random random = new Random();
    
    // calcLandCost() method
    // Prupose: Calculate a random land price between 17 and 27 bushels/acre
    // parameters: none;
    // Returns: the land cost
    public static int calcLandCost(){
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landPrice;
    }


    //The sellLand method
    //Purpose: To sell land
    // Parameters: the price of land, the number of acres to sell, and a 
    //reference to a CropData object
    //Returns: the number of acres owned after the sale
    //Pre-conditions: acres to sell must be positive and <= acresOwned
    public static int sellLand(int landPrice, int acresToSell, CropData cropData){
        
        int owned = cropData.getAcresOwned();
        int wheat = cropData.getWheatInStore();
        
        //if acresToSell < 0, return -1
        if(acresToSell < 0)
            return -1;
        
        //if acresToSell > acresOwned, return -1
        if(acresToSell > owned)
            return -1;
                    
        //acresOwned = acresOwned - acresToSell
        owned -= acresToSell;
        cropData.setAcresOwned(owned);
        
        //wheatInStore = wheatInStore + acresToSell * landPrice
        wheat += (acresToSell +landPrice);
        cropData.setWheatInStore(wheat);
        
        //return acresOwned
        return owned;
    }
    

// The buyLand method
    // Purpose: To buy land
    // Parameters: the price of the land, the number of acres to buy,
    //     and a reference to a CropData object.
    // Returns: the amount of land owned after the purchase.
    // Pre-conditions: the number of acres to be bought must be positive
    //     and <= population * 10. Acres to buy * 10 must be <= wheat in store
    public static void buyLand(int landPrice, int acresToBuy, CropData cropData)throws CropException 
    {
        
    int wheatInStore = cropData.getWheatInStore();
    int population = cropData.getPopulation();
    int acresOwned = cropData.getAcresOwned();
    
    //if acresToBuy < 0 throw exception message
    if (acresToBuy < 0) {
        throw new CropException("A negative value was input.");
    }

    //if acresToBuy * landPrice > wheatInStore throw exception message
    if (acresToBuy * landPrice > wheatInStore) {
        throw new CropException("There is Insufficient wheat to buy this much land.");
    }

    //if population < (acresOwned + acresToBuy) / 10 throw exception message
    if (population < ((acresOwned + acresToBuy) / 10)) {
        throw new CropException("There are not enough people in the city to " + 
                                "care for that much land.");
    }

    //acresOwned = acresOwned + acresToBuy
    acresOwned += acresToBuy;
    cropData.setAcresOwned(acresOwned);

    //wheatInStore = wheatInStore - (acresToBuy * landPrice)
    wheatInStore -= (acresToBuy * landPrice);
    cropData.setWheatInStore(wheatInStore);
    }
    
    // Start Chuck Mikolyski
    // The feedPeople Method.
    // Purpose: Feed the people with bushels of wheat.
    // Parameters: The quantity of bushels of wheat set aside to feed the people, and a reference
    // to a CropData obrject.
    // Returns: None
    //Pre-conditions: The amount of wheat set aside must be a positive number, and <= the amount 
    // of wheat in store.
    public static void feedPeople(int wheatSetAside, CropData cropData) throws CropException
    {
        int wheatInStore = cropData.getWheatInStore();

        //if wheatSetAside < 0  throw exception message
        if ( wheatSetAside < 0) {
            throw new CropException("A negative value was input.");
        }
        
        //if wheatSetAside > wheatInStore return -1
        if (wheatSetAside > wheatInStore) {
            throw new CropException ("There is insufficient wheat to set " + 
                                     "aside this much wheat to feed the people");
        } 
        
        //wheatInStore = wheatInStore – wheatSetAside
        wheatInStore -= wheatSetAside;
        
        //save state
        cropData.setWheatForPeople(wheatSetAside);
        cropData.setWheatInStore(wheatInStore);
    }  
    //End Chuck Mikolyski
    
    // Start Jack McBride
    // The setOffering method
    // Purpose: Allocate percentage of harvest to be paid as an offering
    // Parameters: The percentage of harvest to be paid as an offering
    // Returns: The percentage of harvest the user wants to pay in tithes
    //  and offerings.
    // Pre-conditions: The percentage of harvest must be greater than or
    // equal to zero and less than or equal to 100.
    public static int setOffering(int offering) {
    
    if (offering < 0 || offering > 100) {
        return -1;
    }

    return offering;

    }
    // End Jack McBride
    
    //Start Laura Mazariegos
    //The Plant crops method
    //Purpose: Plant crops
    //Parameters: the number of acresOwned and a reference to the CropData object
    //Returns: how much wheat in store after acres planted
    //Pre-Conditions: acresOwned must be >=acres to plant. Wheat in store = n 
    //   bushels. 1 bushel of wheat in store = 2 acres of land to plant. Wheat 
    //   store must be >= acres owned * 2.
    public static int plantCrops(int acresPlanted, CropData cropData)
    {
        int acresOwned = cropData.getAcresOwned();
        int wheatInStore = cropData.getWheatInStore();
        int requiredBushels = acresPlanted / 2; 
        
        
        //If acresToPlant <= 0 return -1
        if (acresPlanted <= 0){
            return -1;
        }
        
        //If acresOwned < acresToPlant return -1
        if (acresOwned < acresPlanted){
            return -1;
        }
        
        //If wheatInStore < 0 return -1
        if (wheatInStore <= 0){
            return -1;
        }
        
        //If wheatInStore < acresToPlant /2  return -1
        if (wheatInStore < (acresPlanted / 2)){
            return -1;
        }
        
        //WheatInStore - = requiredBushels
        wheatInStore -= requiredBushels;

        cropData.setAcresPlanted(acresPlanted);
        cropData.setWheatInStore(wheatInStore);
        return wheatInStore;
        
        //End Laura Mazariegos
        
        
        
    }

   

}
