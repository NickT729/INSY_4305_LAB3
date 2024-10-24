import java.util.ArrayList;

public class shipDemo {
    public static void main(String[] args) {

        //A Ship array to demonstrate various Cruise and Cargo ship objects
        Ship[] ships = new Ship[3];
        ships[0] = new CruiseShip("A really big boat", "2000", 5000);
        ships[1] = new CargoShip("FedEX Cargo ship", "2016", 20000);
        ships[2] = new CruiseShip("The titanic", "1912", 5400);

        for (Ship ship: ships) {
            ship.display();
        }

        //A ship arraylist for the cruise and cargo ships
        ArrayList<Ship> shipList = new ArrayList<>();
        shipList.add(new CruiseShip("Another big boat", "2008", 6900));
        shipList.add(new CruiseShip("Leviathin", "1870", 7000));

        for (Ship ship : shipList) {
            System.out.println(ship.toString());

        }

        /*Should print out the copies from each object's toString() method,,
        assuming my code works...
         */
        CruiseShip copiedCruiseship = new CruiseShip((CruiseShip) ships[0]);
        CargoShip copiedCargoship = new CargoShip((CargoShip) ships[1]);

        /*The long awaited PRINT statement
        PLEASE WORK CORRECTLY I AM SO TIRED OF SEEING ERRORS
        Okay I think it works now. Shout-out to whoever grades this.
         */
        System.out.println("The copied cruiseship is : "+copiedCruiseship.toString());
        System.out.println("The copied CargoShip is : "+copiedCargoship.toString());

    }
}
