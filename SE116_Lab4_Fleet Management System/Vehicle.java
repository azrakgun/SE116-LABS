public class Vehicle {

        protected String licensePlate;
        protected double dailyRate;

      Vehicle(String licensePlate, double dailyRate) {
        this.licensePlate = licensePlate;
        this.dailyRate = dailyRate;
    }


    public double calculateRental(int days){
            return days * dailyRate;
        }
      void safetyCheck(){
            System.out.println("SafetyCheck : " + licensePlate);
//BONUS
          }
    public boolean checkRisk() {
        return false;

         }

    }


