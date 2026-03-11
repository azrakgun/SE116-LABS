public class FleetManagementSystem {
    public static void main (String [] args){
        Vehicle [] fleet = new Vehicle[3];

                fleet[0] = new Vehicle("ABC123", 10);

                fleet[1] = new Truck("XYZ456", 15, 30);

                fleet[2] = new HeavyDutyTruck("DEF789", 2, 35, 6);

                for (Vehicle v : fleet) {

                    System.out.println("Rental cost: " + v.calculateRental(5));

                    v.safetyCheck();

                }
            }
    }

