abstract class Mower {
    String manufacturer;
    int year;
    String serialNumber;

    public Mower(){
        this.manufacturer = "";
        this.year = 0;
        this.serialNumber = "";
    }
    public Mower(String manufacturer, int year, String serialNumber){
        this.manufacturer = manufacturer;
        this.year = year;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    @Override
    public String toString(){
        String s = manufacturer + " " + year + " " + serialNumber;
        return s;
    }
}

