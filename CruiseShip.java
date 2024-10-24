public class CruiseShip extends Ship {

    //The field for the max num of passengers
    private int maxPassengers;

    // The contructor and accesor and mutators
    public CruiseShip(String shipName,
                      String yearBuilt,
                      int maxPassengers) {
        super(shipName, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public CruiseShip(CruiseShip other) {

        super(other.getShipName(), other.getYearBuilt());

        this.maxPassengers = other.maxPassengers;
    }

    public int getMaxPassengers() {

        return maxPassengers;
    }


    /* toString method to override the toString method from the
    base class.
     */
    @Override
    public String toString() {
        return "The name of the cruise ship is: " +getShipName()+ ". \n The max amount of passengers is: " +maxPassengers;

    }

    //To override the display() method from tha Display interface class
    @Override
    public void display() {
        System.out.println(this.toString());
    }
}
