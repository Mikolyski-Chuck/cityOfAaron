/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityofAaron.control;

import byui.cit260.cityofAaron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jackmcbride, Laura Mazariegos, Chuck Mikolyski
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand1() {
        
        System.out.println("buyLand");
        
           // ---Test case 1 ---
         System.out.println("\tTest case 1: Valid");
        
        CropData theCrops = new CropData();
        
        theCrops.setWheatInStore(500);
        theCrops.setAcresOwned(10);
        theCrops.setPopulation(2);
        
        int landPrice = 20;
        int acresToBuy = 10;
        int expResult = 20;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        assertEquals(expResult, result);
    }
   
    @Test
    public void testBuyLand2() {
        
        System.out.println("buyLand");
        
           // ---Test case 1 ---
         System.out.println("\tTest case 2: Invalid");
        
        CropData theCrops = new CropData();
        
        theCrops.setWheatInStore(500);
        theCrops.setAcresOwned(10);
        theCrops.setPopulation(2);
        
        int landPrice = 20;
        int acresToBuy = -1;
        int expResult = -1;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuyLand3() {
        
        System.out.println("buyLand");
        
           // ---Test case 1 ---
         System.out.println("\tTest case 3: Invalid");
        
        CropData theCrops = new CropData();
        
        theCrops.setWheatInStore(500);
        theCrops.setAcresOwned(10);
        theCrops.setPopulation(1);
        
        int landPrice = 20;
        int acresToBuy = 10;
        int expResult = -1;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuyLand4() {
        
        System.out.println("buyLand");
        
           // ---Test case 1 ---
         System.out.println("\tTest case 4: Invalid");
        
        CropData theCrops = new CropData();
        
        theCrops.setWheatInStore(5);
        theCrops.setAcresOwned(10);
        theCrops.setPopulation(2);
        
        int landPrice = 20;
        int acresToBuy = 10;
        int expResult = -1;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuyLand5() {
        
        System.out.println("buyLand");
        
           // ---Test case 1 ---
         System.out.println("\tTest case 5: Boundary");
        
        CropData theCrops = new CropData();
        
        theCrops.setWheatInStore(100);
        theCrops.setAcresOwned(10);
        theCrops.setPopulation(2);
        
        int landPrice = 10;
        int acresToBuy = 10;
        int expResult = 20;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuyLand6() {
        
        System.out.println("buyLand");
        
           // ---Test case 1 ---
         System.out.println("\tTest case 6: Boundary");
        
        CropData theCrops = new CropData();
        
        theCrops.setWheatInStore(500);
        theCrops.setAcresOwned(0);
        theCrops.setPopulation(1);
        
        int landPrice = 10;
        int acresToBuy = 10;
        int expResult = 10;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuyLand7() {
        
        System.out.println("buyLand");
        
           // ---Test case 1 ---
         System.out.println("\tTest case 7: Boundary");
        
        CropData theCrops = new CropData();
        
        theCrops.setWheatInStore(500);
        theCrops.setAcresOwned(10);
        theCrops.setPopulation(2);
        
        int landPrice = 10;
        int acresToBuy = 0;
        int expResult = 10;
        
        int result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        assertEquals(expResult, result);
    }
    
    //Start Chuck Mikolyski
    /**
     * Test of feedPeople method, of class CropControl.
     */
    @Test
    public void testFeedPeople1() {
        
        System.out.println("feedPeople");
        
           // ---Test case 1---
         System.out.println("\tTest case 1: Valid");
        
        CropData theCrops = new CropData();
        
        theCrops.setWheatInStore(200);
        
        int wheatSetAside = 100;
        int expResult = 100;
        
        int result = CropControl.feedPeople(wheatSetAside, theCrops);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFeedPeople2() {
        
        System.out.println("feedPeople");
        
           // ---Test case 2---
         System.out.println("\tTest case 2: Invalid");
        
        CropData theCrops = new CropData();
        
        theCrops.setWheatInStore(200);
        
        int wheatSetAside = -50;
        int expResult = -1;
        
        int result = CropControl.feedPeople(wheatSetAside, theCrops);
        assertEquals(expResult, result);
    }

    @Test
    public void testFeedPeople3() {
        
        System.out.println("feedPeople");
        
           // ---Test case 3---
         System.out.println("\tTest case 3: Invalid");
        
        CropData theCrops = new CropData();
        
        theCrops.setWheatInStore(100);
        
        int wheatSetAside = 150;
        int expResult = -1;
        
        int result = CropControl.feedPeople(wheatSetAside, theCrops);
        assertEquals(expResult, result);
    }

    @Test
    public void testFeedPeople4() {
        
        System.out.println("feedPeople");
        
           // ---Test case 4---
         System.out.println("\tTest case 4: Boundary");
        
        CropData theCrops = new CropData();
        
        theCrops.setWheatInStore(100);
        
        int wheatSetAside = 100;
        int expResult = 0;
        
        int result = CropControl.feedPeople(wheatSetAside, theCrops);
        assertEquals(expResult, result);
    }

    @Test
    public void testFeedPeople5() {
        
        System.out.println("feedPeople");
        
           // ---Test case 5---
         System.out.println("\tTest case 5: Boundary");
        
        CropData theCrops = new CropData();
        
        theCrops.setWheatInStore(100);
        
        int wheatSetAside = 0;
        int expResult = 100;
        
        int result = CropControl.feedPeople(wheatSetAside, theCrops);
        assertEquals(expResult, result);
    }
    //End Chuck Mikolyski
    
    //Start Jack McBride
    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering1() {
        
        System.out.println("setOffering");
        
           // ---Test case 1---
        System.out.println("\tTest case 1: Valid");
        
        int offering = 5;
        int expResult = 5;
        
        int result = CropControl.setOffering(offering);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSetOffering2() {
        
        System.out.println("setOffering");
        
           // ---Test case 2---
        System.out.println("\tTest case 2: Invalid");
        
        int offering = -5;
        int expResult = -1;
        
        int result = CropControl.setOffering(offering);
        assertEquals(expResult, result);
    }

    @Test
    public void testSetOffering3() {
        
        System.out.println("setOffering");
        
           // ---Test case 3---
        System.out.println("\tTest case 3: Invalid");
        
        int offering = 200;
        int expResult = -1;
        
        int result = CropControl.setOffering(offering);
        assertEquals(expResult, result);
    }

    @Test
    public void testSetOffering4() {
        
        System.out.println("setOffering");
        
           // ---Test case 4---
        System.out.println("\tTest case 4: Boundary");
        
        int offering = 0;
        int expResult = 0;
        
        int result = CropControl.setOffering(offering);
        assertEquals(expResult, result);
    }

    @Test
    public void testSetOffering5() {
        
        System.out.println("setOffering");
        
           // ---Test case 5---
        System.out.println("\tTest case 5: Boundary");
        
        int offering = 100;
        int expResult = 100;
        
        int result = CropControl.setOffering(offering);
        assertEquals(expResult, result);
    }
    //End Jack McBride

    // start Laura Mazariegos
    /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops1() {
        
        System.out.println("plantCrops1");
        
           // ---Test case ---
        System.out.println("\tTest case 1: Valid");
        
        CropData theCrops = new CropData();
        
        CropData theAcres = new CropData();
               
        theCrops.setWheatInStore(200);
        //int acresToPlant = cropData.getAcresPlanted();
        int acresOwned = 100;
        theAcres.setAcresPlanted(2);
        //acresToPlant = 2;
        int expResult = 100;
        
        int result = CropControl.plantCrops(acresOwned,theCrops,theAcres);
        assertEquals(expResult, result);
    } 
@Test
    public void testPlantCrops2() {
        
        System.out.println("plantCrops2");
        
           // ---Test case ---
        System.out.println("\tTest case 2:Invalid ");
        
        CropData theCrops = new CropData();
        
        CropData theAcres = new CropData();
               
        theCrops.setWheatInStore(100);
        
        int acresOwned = 10;
        theAcres.setAcresPlanted(-2);
        //acresPlanted = -2;
        int expResult = -1;
        
        int result = CropControl.plantCrops(acresOwned,theCrops,theAcres);
        assertEquals(expResult, result);
    } 
@Test
    public void testPlantCrops3() {
        
        System.out.println("plantCrops3");
        
           // ---Test case ---
        System.out.println("\tTest case3 : Invalid");
        
        CropData theCrops = new CropData();
        
        CropData theAcres = new CropData();
               
        theCrops.setWheatInStore(0);
        
        int acresOwned = 100;
        theAcres.setAcresPlanted(0);
        //acresPlanted = 0;
        int expResult = -1;
        
        int result = CropControl.plantCrops(acresOwned,theCrops,theAcres);
        assertEquals(expResult, result);
    } 
@Test
    public void testPlantCrops4() {
        
        System.out.println("plantCrops4");
        
           // ---Test case ---
        System.out.println("\tTest case 4: Boundary");
        
        CropData theCrops = new CropData();
        
        CropData theAcres = new CropData();
               
        theCrops.setWheatInStore(100);
        
        int acresOwned = 200;
        theAcres.setAcresPlanted(200);
        //acresPlanted = 200;
        int expResult = 0;
        
        int result = CropControl.plantCrops(acresOwned,theCrops,theAcres);
        assertEquals(expResult, result);
    } 
@Test
    public void testPlantCrops5() {
        
        System.out.println("plantCrops5");
        
           // ---Test case ---
        System.out.println("\tTest case 5: Boundary");
        
        CropData theCrops = new CropData();
        
        CropData theAcres = new CropData();
               
        theCrops.setWheatInStore(1);
        
        int acresOwned = 2;
        theAcres.setAcresPlanted(2);
        //acresPlanted = 2;
        int expResult = 0;
        
        int result = CropControl.plantCrops(acresOwned,theCrops,theAcres);
        assertEquals(expResult, result);
    } 

}

