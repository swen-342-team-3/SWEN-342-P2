package edu.swen342;

/**
 * @project: SWEN-342 | TSA Airport
 *
 * @author: Benjamin S. Meyers
 * @author: Asma Sattar
 */

public class Passenger {

    /* User id should not change*/
    private final int ID;
    private final Bag BAG;

    /**
     * Constructor.
     */
    public Passenger(int id) {
        this.ID = id;
        this.BAG = new Bag(id);
    }


    /*
    * Returns Passenger id
    */
    public int getID() { 
        return this.ID; 
    }


    /*
    * Returns Passenger's bag
    */
    public Bag getBag() { 
        return this.BAG;
    }
}
