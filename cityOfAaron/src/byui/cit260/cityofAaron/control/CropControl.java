/*
 * The CropControl() class file for the cityOfAaron project
 * Part of the control layer
 * Class contains all of the calculation methods for managing crops
 * CIT-260
 * Team members: Laura Mazariegos, Chuck Mikolyski, Jack McBride
 */
package byui.cit260.cityofAaron.control;

import byui.cit260.cityofAaron.model.CropData;

public class CropControl {
    
    // The buyLand method
    // Purpose: To buy land
    // Parameters: the price of the land, the number of acres to buy,
    //     and a reference to a CropData object.
    // Returns: the amount of land owned after the purchase.
    // Pre-conditions: the number of acres to be bought must be positive
    //     and <= population * 10. Acres to buy * 10 must be <= wheat in store
    public static int buyLand(int landPrice, int acresToBuy, CropData cropData) {
        
    int wheatInStore = cropData.getWheatInStore();
    int population = cropData.getPopulation();
    int acresOwned = cropData.getAcresOwned();
    
    //if acresToBuy < 0 return -1
    if (acresToBuy < 0) {
        return -1;
    }

    //if acresToBuy * landPrice > wheatInStore return -1
    if (acresToBuy * landPrice > wheatInStore) {
        return -1;
    }

    //if population < (acresOwned + acresToBuy) / 10 return -1
    if (population < ((acresOwned + acresToBuy) / 10)) {
        return -1;
    }

    //acresOwned = acresOwned + acresToBuy
    acresOwned += acresToBuy;
    cropData.setAcresOwned(acresOwned);

    //wheatInStore = wheatInStore - (acresToBuy * landPrice)
    wheatInStore -= (acresToBuy * landPrice);
    cropData.setWheatInStore(wheatInStore);

    return acresOwned;

    }
    
    // Start Chuck Mikolyski
    // The feedPeople Method.
    // Purpose: Feed the people with bushels of wheat.
    // Parameters: The quantity of bushels of wheat set aside to feed the people, and a reference
    // to a CropData obrject.
    // Returns: The number of wheat in store after setting aside wheat to feed the people.
    //Pre-conditions: The amount of wheat set aside must be a positive number, and <= the amount 
    // of wheat in store.
    public static int feedPeople(int wheatSetAside, CropData cropData)
    {
        int wheatInStore = cropData.getWheatInStore();

        //if wheatSetAside < 0  return -1
        if ( wheatSetAside < 0) {
            return -1;
        }
        
        //if wheatSetAside > wheatInStore return -1
        if (wheatSetAside > wheatInStore) {
            return -1;
        } 
        
        //wheatInStore = wheatInStore – wheatSetAside
        wheatInStore -= wheatSetAside;
        
        //save state
        cropData.setWheatForPeople(wheatSetAside);
        cropData.setWheatInStore(wheatInStore);
        
        //return wheatInStore
        return wheatInStore;
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


}
