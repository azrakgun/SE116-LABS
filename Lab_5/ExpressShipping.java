public class ExpressShipping extends Shipment{
    ExpressShipping(String trackingNo , String contentType,int weightKg,int distanceKm) {

        super(contentType, trackingNo);

       }
    @Override
    public double calculateFee(){
        return  20.0 + 25.0 + 0.12 * getDistanceKm() + 2.2 *  getWeightKg();
    }
    }
