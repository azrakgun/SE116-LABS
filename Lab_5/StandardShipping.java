public class StandardShipping extends Shipment{
    private String name;

    StandardShipping(String trackingNo , String contentType,int weightKg,int distanceKm,String name){

        super(contentType,trackingNo);
          this.name=name;
    }
    @Override
    public double calculateFee(){
      return  15.0 + 0.08 * getDistanceKm() + 1.5 * getWeightKg();
    }

}
