public class CargoShip extends Ship {

    //Field for the Cargoship capacity
    private int cargoCapacity;

    //The constructor, and accessor and mutator methods below
    public CargoShip(String shipName,
                     String yearBuilt,
                     int cargoCapacity) {

        super(shipName, yearBuilt);

        this.cargoCapacity = cargoCapacity;
    }

    public CargoShip(CargoShip other) {

        super(other.getShipName(), other.getYearBuilt());
        this.cargoCapacity = other.cargoCapacity;
    }

    public int getCargoCapacity() {

        return cargoCapacity;

    }

    public void setCargoCapacity(int cargoCapacity) {

        this.cargoCapacity = cargoCapacity;

    }

    //The override toString to display everything correctly,,, hopefully
    @Override
    public String toString() {
        return "The cargo ship name is: " +getShipName() + ". \n The cargo capacity is: "+cargoCapacity+" tons.";
    }

    //Another override for the display() method from the Display interface
    @Override
    public void display() {

        System.out.println(this.toString());

    }
}
