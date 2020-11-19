public class CabInvoiceGenerator {

    public static final double COST_PER_TIME = 1;
    public static final double MINIMUM_COST_PER_KM = 10;

    public static double calculateFare(Ride ...ride){
        double totalFair = 0;
        double fairOfRide;

        for(Ride newRide : ride){
            fairOfRide = newRide.getDistance() * MINIMUM_COST_PER_KM + newRide.getTime() * COST_PER_TIME;

            if(fairOfRide <= 5){
                totalFair = totalFair+5;
            }else {
                totalFair = totalFair + fairOfRide;
            }
        }
        return totalFair;
    }
}
