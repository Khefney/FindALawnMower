import java.util.*;

public class MowerWareHouse {
    String storeName;
    private ArrayList<Mower> mowers;

    public MowerWareHouse(){
        this.storeName = "";
        this.mowers = new ArrayList<>();

    }

    public String getStoreName(){
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ArrayList<Mower> getMowers() {
        return mowers;
    }

    public void setMowers(ArrayList<Mower> mowers) {
        this.mowers = mowers;
    }

    public static void readMowerData(String inputFileName){
        return;
    }

    public static void saveMowerData(String outputFileName){
        return;
    }
}
