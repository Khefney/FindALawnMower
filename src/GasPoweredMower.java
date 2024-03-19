public class GasPoweredMower {
    Engine engine;
    boolean selfPropelled;

    public GasPoweredMower(){
        this.engine = new Engine();
        this.selfPropelled = false;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isSelfPropelled() {
        return selfPropelled;
    }

    public void setSelfPropelled(boolean selfPropelled) {
        this.selfPropelled = selfPropelled;
    }
}
