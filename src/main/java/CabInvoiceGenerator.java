public class CabInvoiceGenerator {

    public static final double COST_PER_TIME = 1;
    public static final double MINIMUM_COST_PER_KM = 10;

    RideRepository rideRepository;

    public CabInvoiceGenerator() {
        this.rideRepository =new RideRepository();
    }

    public static EnhancedInvoice calculateFare(Ride ...ride){
       EnhancedInvoice enhancedInvoice = new EnhancedInvoice();
        double fairOfRide;

        for(Ride newRide : ride){
            fairOfRide = newRide.getDistance() * MINIMUM_COST_PER_KM + newRide.getTime() * COST_PER_TIME;

            enhancedInvoice.setTotalNumberOfRide(enhancedInvoice.getTotalNumberOfRide()+1);

            if(fairOfRide <= 5){
                enhancedInvoice.setTotalFare(enhancedInvoice.getTotalFare() + 5);
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
