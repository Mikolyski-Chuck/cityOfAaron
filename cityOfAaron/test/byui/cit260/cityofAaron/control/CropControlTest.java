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
 * @author jackmcbride
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
    
     /**
     * Tests of buyLand method, of class CropControl.
     */
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
        int acresToBuy = -2;
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
    
    
}
