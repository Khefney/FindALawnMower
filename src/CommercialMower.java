public class CommercialMower {
    double operatingHours;
    boolean zeroTurnRadius;

    public CommercialMower(){
        this.operatingHours = 0.0;
        this.zeroTurnRadius = false;
    }

    public double getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }

    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }
}