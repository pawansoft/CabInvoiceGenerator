import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void ProvideDistanceAndTime_WhenCalculate_ShouldReturnFair(){
        Ride ride1 = new Ride(0.1, 2);
        Ride ride2 = new Ride(5, 30);
       double totalFair = CabInvoiceGenerator.calculateFare(ride1, ride2);
        Assert.assertEquals(85, totalFair, 0.00002);
    }

    @Test
    public void ProvideRideDetail_WhenFairIsLessThen5_ShouldReturn5(){
        Ride ride1 = new Ride(1,5);
        Ride ride2 = new Ride(5, 20);
        double totalFair = CabInvoiceGenerator.calculateFare(ride1, ride2);
        Assert.assertEquals(85, totalFair, 0.0002);
    }

    @Test
    public void ProvideRideDetail_WhenFairIsLessThen5_ShouldReturnActualFare(){
        Ride ride1 = new Ride(0.1,2);
        Ride ride2 = new Ride(5, 20);
        double totalFair = CabInvoiceGenerator.calculateFare(ride1, ride2);
        Assert.assertNotEquals(73.00, totalFair, 0.0002);
    }
}
