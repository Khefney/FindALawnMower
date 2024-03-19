public class Engine {
    private String manufacturer;
    private double horsePower;
    private int cylinders;

    public Engine(){
        this.manufacturer = "";
        this.horsePower = 0.0;
        this.cylinders = 0;
    }
    public Engine(String manufacturer, double horsePower, int cylinders){
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
        this.cylinders = cylinders;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public double getHorsePower(){
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString(){
        String s = manufacturer + "" + horsePower + "" + cylinders;
        return s;
    }
}

