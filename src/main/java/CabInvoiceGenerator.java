public class CabInvoiceGenerator {

    public static int calculateFare(int distance, int time){
        int totalFair = distance*10 + time;
        if(totalFair <= 5 ){
            return 5;
        }
        return totalFair;
    }
}
