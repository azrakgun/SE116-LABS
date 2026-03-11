public class  Truck extends Vehicle{
    protected double  cargoCapacity;

    Truck(String licensePlate, double dailyRate, int cargoCapacity) {
        super(licensePlate, dailyRate);
        this.cargoCapacity = cargoCapacity;
    }

 //Bonus
    @Override
    public boolean checkRisk(){
        if (cargoCapacity > 20){
            return true;
        }
        return false;
    }

    @Override
    public void safetyCheck() {
        super.safetyCheck();

        if (cargoCapacity < 40) {

            System.out.println("Truck safe ");

        }
        else {

            System.out.println("Cargo capacity full!");
           }


        }

    }
