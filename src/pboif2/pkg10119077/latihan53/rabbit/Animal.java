/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan53.rabbit;

/**
 *
 * @author RAF
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;

    public Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }
    
    public boolean isVegetarian(){
        return vegetarian;
    }
    
    public String getEats(){
        return eats;
    }
    
    public int getNoOfLegs(){
        return noOfLegs;
    }
}
