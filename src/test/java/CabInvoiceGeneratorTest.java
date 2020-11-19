import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void ProvideDistanceAndTime_WhenCalculate_ShouldReturnFair(){

       int totalFair = CabInvoiceGenerator.calculateFare(5,40 );
        Assert.assertEquals(90, totalFair);
    }

    @Test
    public void ProvideRideDetail_WhenFairIsLessThen5_ShouldReturn5(){
        int totalFair = CabInvoiceGenerator.calculateFare(0,2);
        Assert.assertEquals(5, totalFair);
    }
}
