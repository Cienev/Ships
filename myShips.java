public class Ship {
        private String shipName;
        private String shipYear;
        private int num;

        /**
        *Creates a new ship that holds the ship's name, year built, and the passenger or capacity of ship
        */
        public Ship(String shipName, String shipYear, int num){
                set(shipName, shipYear, num);
        }

        /**
        *mutating the name of ship, the year it was built, and the number of passengers or capacity of ship
        *@param shipName sets the name of the Ship
        *@param shipYear sets the year the ship was built
        *@param num sets the int value of how many passengers or how much tonnage a type of ship holds
        */
        public void set(String shipName, String shipYear, int num){
                this.shipName = shipName;
                this.shipYear = shipYear;
                this.num = num;
        }

        /**
        *@return returns the Ship's name
        */
        public String getShipName(){
                return shipName;
        }

        /**
        *@return returns the Year the ship was built
        */
        public String getShipYear(){
                return shipYear;
        }

        /**
        *@return the num of passengers
        */
        public int getPassengers(){
                return num;
        }

        /**
        *@return the capacity in tonnage
        */
        public int getTonnage(){
                return num;
        }
        /**
        *@return return the ship's name and year in the form of a string
        */
        public String toString(){
                return String.format("%-22s %-15s", shipName, shipYear);
        }
}
