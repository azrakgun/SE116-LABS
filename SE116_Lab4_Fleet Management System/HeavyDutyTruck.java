public class HeavyDutyTruck extends Truck {
    int axleCount;

    HeavyDutyTruck(String licensePlate, double dailyRate, int cargoCapacity, int axleCount) {
        super(licensePlate, dailyRate, cargoCapacity);

        this.axleCount = axleCount;
    }

    @Override
    public double calculateRental(int days) {
        double base = super.calculateRental(days);
        return base + axleCount;
    }
//bonus
    @Override
    public boolean checkRisk() {
        if (axleCount > 4) {
            return true;
        }
return false;
    }
}