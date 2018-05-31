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

    //wheatInStore = wheatInStore - (acresToBuy * landPrice)
    wheatInStore -= (acresToBuy * landPrice);

    return acresOwned;

    }
    
}
