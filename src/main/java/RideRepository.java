import java.util.HashMap;

public class RideRepository {
    HashMap<String, Ride[]> rideDetailContainer =  new HashMap<>();

    public void addRide(String id, Ride ...rides){
        rideDetailContainer.put(id, rides);
    }

    public Ride[] fetchRideDetailsWithId(String id){
        return rideDetailContainer.get(id);
    }
}
