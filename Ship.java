public abstract class Ship implements Displayable {

    // two private string fields
    private String name;
    private String yearBuilt;

    public Ship(String name, String yearBuilt) {

        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    //Accessor and mutator methods for the strings above

    public String getShipName() {

        return name;
    }

    public void setName (String shipName) {

        this.name = shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt() {

        this.yearBuilt = yearBuilt;
    }


    /*The toString method to display the name of the ship
    and the year it was made.
     */

    @Override
    public String toString() {

        return "The name of the ship is: " +name+ ".\n The year it was built is: " + yearBuilt;

    }

    //To override the display() method from the Display interface
    @Override
    public void display() {
        System.out.println(this.toString());
    }
}
