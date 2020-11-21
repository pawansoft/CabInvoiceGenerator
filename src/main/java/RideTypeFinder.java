public enum RideTypeFinder {

    NormalRide(10, 1, 5), Premium(15, 2, 20);

    private double COST_PER_KM;
    private double COST_PER_TIME;
    private double MIN_FARE;

    RideTypeFinder(double COST_PER_KM, double COST_PER_TIME, double MIN_FARE) {
        this.COST_PER_KM = COST_PER_KM;
        this.COST_PER_TIME = COST_PER_TIME;
        this.MIN_FARE = MIN_FARE;
    }

    public double getCOST_PER_KM() {
        return COST_PER_KM;
    }

    public void setCOST_PER_KM(double COST_PER_KM) {
        this.COST_PER_KM = COST_PER_KM;
    }

    public double getCOST_PER_TIME() {
        return COST_PER_TIME;
    }

    public void setCOST_PER_TIME(double COST_PER_TIME) {
        this.COST_PER_TIME = COST_PER_TIME;
    }

    public double getMIN_FARE() {
        return MIN_FARE;
    }

    public void setMIN_FARE(double MIN_FARE) {
        this.MIN_FARE = MIN_FARE;
    }
}
