public class Ride {

    private double distance;
    private double time;
    RideTypeFinder rideTypeFinder;

    Ride(double distance, double time, RideTypeFinder rideTypeFinder) {
        this.distance = distance;
        this.time = time;
        this.rideTypeFinder = rideTypeFinder;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
