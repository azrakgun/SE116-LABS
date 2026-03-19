public class Shipment {
    private static String trackingNo;
    private String contentType;
    private int weightKg;
    private int distanceKm;

    Shipment(String trackingNo,String contentType){

      this.contentType=contentType;
      this.trackingNo=trackingNo;


    }

    public String getTrackingNo(){
        return trackingNo;
    }
   public static void setTrackingNo(String trackNo){
        trackingNo=trackNo;
   }
  public String getContentType(){
        return contentType;
 }

public void setContentType(String contType){
        contentType=contType;

}
public int getWeightKg(){
        return weightKg;
}
public void setWeightKg(int kg){
        weightKg=kg;
}
public int getDistanceKm(){
        return distanceKm;
}
public void setDistanceKm(int km){
        distanceKm=km;
}


    public double calculateFee(){
        return 0;

    }
    void  printReceipt(){
        System.out.println("Tracking number: " + trackingNo) ;
        System.out.println("Content type: " + contentType);
        System.out.println("Distance : " + distanceKm);
        System.out.println("Weight : " + weightKg);

    }
}
