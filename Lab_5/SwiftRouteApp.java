import java.util.Scanner;
import java.util.HashMap;

public class SwiftRouteApp {

    public static void main (String [] args ){
       HashMap <String , Shipment > shipmentMap = new HashMap <> ();
        Scanner sc = new Scanner (System.in);

        System.out.println("===Shipment Entry Menu===");

        System.out.println("Please enter Shipment type: ");
           String Shipmentype = sc.nextLine();

        System.out.println("Please enter Tracking No: " );
          String trackNo = sc.nextLine();

        System.out.println("Please enter Content Type: ");
         String contentType = sc.nextLine();

        System.out.println("Please enter Weight Kg: ");
           int weight = sc.nextInt();

        System.out.println("Please enter Distance km:  ");
        int distanceKm = sc.nextInt();




        /*
 shipmentMap.put("Track A" ,  );
 shipmentMap.put("Track B " ,);
 shipmentMap.put("Track C" , );
 shipmentMap.put("Track D" , );
 shipmentMap.put("Track E" , );

*/
    }
}
