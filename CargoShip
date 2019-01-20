public class CargoShip extends Ship {
        private int capacity;
        private String shipName;
        public CargoShip(String shipName, String shipYear, int num){
                super(shipName, shipYear, num);
                this.shipName = shipName;
                setTonnage(num);
        }
        public void setTonnage(int num){
                capacity = num;
        }
        public int getTonnage(){
                return capacity;
        }
        @Override
        public String toString(){
                return String.format("%-22s Cargo:%d", shipName, capacity);
        }
}
