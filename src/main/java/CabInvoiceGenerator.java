public class CabInvoiceGenerator {

    public static final double COST_PER_TIME = 1;
    public static final double MINIMUM_COST_PER_KM = 10;
    public static final double MINIMUM_FARE = 5;

    public static final double PREMIUM_COST_PER_TIME = 2;
    public static final double PREMIUM_COST_PER_KM = 15;
    public static final double PREMIUM_MINIMUM_FARE = 20;

    RideRepository rideRepository;

    public CabInvoiceGenerator() {
        this.rideRepository =new RideRepository();
    }

    public static EnhancedInvoice calculateFare(Ride ...ride){
       EnhancedInvoice enhancedInvoice = new EnhancedInvoice();
        double fairOfRide;

        for(Ride newRide : ride){
                fairOfRide = newRide.getDistance() * newRide.rideTypeFinder.getCOST_PER_KM() + newRide.getTime() * newRide.rideTypeFinder.getCOST_PER_TIME();

            enhancedInvoice.setTotalNumberOfRide(enhancedInvoice.getTotalNumberOfRide()+1);

            if( fairOfRide <= newRide.rideTypeFinder.getMIN_FARE()){
                enhancedInvoice.setTotalFare(enhancedInvoice.getTotalFare() + newRide.rideTypeFinder.getMIN_FARE());
            }else {
                enhancedInvoice.setTotalFare(enhancedInvoice.getTotalFare()+fairOfRide);
            }
        }
        enhancedInvoice.setAverageFarePerRide(enhancedInvoice.getTotalFare()/ enhancedInvoice.getTotalNumberOfRide());
        return enhancedInvoice;
    }

    public void addRide(String id, Ride ...rides){
        rideRepository.addRide(id, rides);
    }

    public EnhancedInvoice calculateTotalRideFare(String id){
        return calculateFare(rideRepository.fetchRideDetailsWithId(id));
    }
}
