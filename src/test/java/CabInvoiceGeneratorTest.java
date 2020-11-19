import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void ProvideDistanceAndTime_WhenCalculate_ShouldReturnFair(){
        Ride ride1 = new Ride(0.1, 2);
        Ride ride2 = new Ride(5, 30);
        EnhancedInvoice enhancedInvoice = CabInvoiceGenerator.calculateFare(ride1, ride2);

        EnhancedInvoice expectedEnhancedInvoice1 = new EnhancedInvoice();
        expectedEnhancedInvoice1.setAverageFarePerRide(42.5);
        expectedEnhancedInvoice1.setTotalNumberOfRide(2);
        expectedEnhancedInvoice1.setTotalFare(85);

        Assert.assertEquals(expectedEnhancedInvoice1, enhancedInvoice);
    }

    @Test
    public void ProvideRideDetail_WhenFairIsLessThen5_ShouldReturn5(){
        Ride ride1 = new Ride(1,5);
        Ride ride2 = new Ride(5, 20);
        EnhancedInvoice enhancedInvoice = CabInvoiceGenerator.calculateFare(ride1, ride2);

        EnhancedInvoice expectedEnhancedInvoice1 = new EnhancedInvoice();
        expectedEnhancedInvoice1.setAverageFarePerRide(42.5);
        expectedEnhancedInvoice1.setTotalNumberOfRide(2);
        expectedEnhancedInvoice1.setTotalFare(85);

        Assert.assertEquals(expectedEnhancedInvoice1, enhancedInvoice);
    }

    @Test
    public void ProvideRideDetail_WhenFairIsLessThen5_ShouldReturnActualFare(){
        Ride ride1 = new Ride(0.1,2);
        Ride ride2 = new Ride(5, 20);
        EnhancedInvoice enhancedInvoice = CabInvoiceGenerator.calculateFare(ride1, ride2);

        EnhancedInvoice expectedEnhancedInvoice1 = new EnhancedInvoice();
        expectedEnhancedInvoice1.setAverageFarePerRide(36.5);
        expectedEnhancedInvoice1.setTotalNumberOfRide(2);
        expectedEnhancedInvoice1.setTotalFare(73.00);
        Assert.assertNotEquals(expectedEnhancedInvoice1, enhancedInvoice);
    }
}
