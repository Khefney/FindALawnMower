abstract class WalkBehindMower {
    double cutWidth;
    double wheelDiameter;

    public WalkBehindMower(){
        this.cutWidth = 0.0;
        this.wheelDiameter = 0.0;
    }

    public double getCutWidth() {
        return cutWidth;
    }

    public void setCutWidth(double cutWidth) {
        this.cutWidth = cutWidth;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
}
