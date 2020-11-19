import java.util.Objects;

public class EnhancedInvoice {

    private double totalNumberOfRide;
    private double totalFare;
    private double averageFarePerRide;

    public double getTotalNumberOfRide() {
        return totalNumberOfRide;
    }

    public void setTotalNumberOfRide(double totalNumberOfRide) {
        this.totalNumberOfRide = totalNumberOfRide;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public double getAverageFarePerRide() {
        return averageFarePerRide;
    }

    public void setAverageFarePerRide(double averageFarePerRide) {
        this.averageFarePerRide = averageFarePerRide;
    }

    @Override
    public String toString() {
        return "EnhancedInvoice{" +
                "totalNumberOfRide=" + totalNumberOfRide +
                ", totalFare=" + totalFare +
                ", averageFarePerRide=" + averageFarePerRide +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnhancedInvoice that = (EnhancedInvoice) o;
        return Double.compare(that.totalNumberOfRide, totalNumberOfRide) == 0 &&
                Double.compare(that.totalFare, totalFare) == 0 &&
                Double.compare(that.averageFarePerRide, averageFarePerRide) == 0;
    }
}
