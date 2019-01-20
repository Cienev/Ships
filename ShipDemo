import java.util.Scanner;
import java.io.*;

public class ShipDemo {
        public static void main(String[] args) throws FileNotFoundException {
                int totalPassengers = 0;
                int totalTonnage = 0;
                int numOfShips;
                String companyName;
                int i = 0;
                File file = new File("myShips.txt");
                Scanner inputFile = new Scanner(file);
                companyName = niceName(inputFile.nextLine());
                numOfShips = inputFile.nextInt();
                Ship shipInventory[] = new Ship[numOfShips];
                while(inputFile.hasNext()){
                        String shipType = inputFile.next();
                        String shipName = inputFile.next();
                        String shipYear = inputFile.next();
                        int num = inputFile.nextInt();
                        switch(shipType){
                                case "c":
                                        shipInventory[i] = new CruiseShip(shipName, shipYear, num);
                                        totalPassengers = totalPassengers + num;
                                        break;
                                case "C":
                                        shipInventory[i] = new CargoShip(shipName, shipYear, num);
                                        totalTonnage = totalTonnage + num;
                                        break;
                                default:
                                        shipInventory[i] = new Ship(shipName, shipYear, num);
                                        break;
                        }
                        i++;
                }
                inputFile.close();
                System.out.println("\nWelcome to " + companyName + " by Kevin Ly\n");
                System.out.printf("%-22s %-15s", "Ship name", "Type");
                System.out.println("\n--------------------   ---------------\n");
                for(int inventory  = 0; inventory < shipInventory.length; inventory++){
                        {
                                System.out.println(shipInventory[inventory].toString());
                        }
                }
                System.out.println("Total ships = " + numOfShips);
                System.out.println("Total Passengers = " + totalPassengers);
                System.out.println("Total Tonnage = " + totalTonnage);
        }
        public static String niceName(String name){
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < name.length(); i++){
                        result.append(name.charAt(i)!= '_' ? name.charAt(i):' ');
                }
                return result.toString();
        }
}
