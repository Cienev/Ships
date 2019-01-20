public class CruiseShip extends Ship {

        private int noOfPassengers;
        private String shipName;

        public CruiseShip(String shipName, String shipYear, int num){
                super(shipName, shipYear, num);
                this.shipName = shipName;
                setPassengers(num);
        }
        public void setPassengers(int num){
                noOfPassengers = num;
        }
        @Override
        public int getPassengers(){
                return noOfPassengers;
        }
        @Override
        public String toString(){
                return String.format("%-22s Cruise:%d", shipName, noOfPassengers);
        }
}
