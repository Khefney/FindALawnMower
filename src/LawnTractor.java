public class LawnTractor {
    Engine engine;
    String model;
    double deckWidth;

    public LawnTractor(){
        this.engine = new Engine();
        this.model = "";
        this.deckWidth = 0.0;
    }

    public Engine getEngine(){
        return engine;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public double getDeckWidth() {
        return deckWidth;
    }

    public void setDeckWidth(double deckWidth) {
        this.deckWidth = deckWidth;
    }
    @Override
    public String toString() {
        return "Engine: " + engine.toString() + "\nModel: " + model + "\nDeck Width: " + deckWidth;
    }
}
