public class AdvancedCoolingSystem extends CoolingSystem {
    private Stopwatch timer = new Stopwatch();
    private float powerRating;

    /**
     * Constructor for CoolingSystem which checks for validity
     * @param numOfFans is the number of fans in a system
     */
    public AdvancedCoolingSystem(int numOfFans, float powerRating) {
        super(numOfFans); // Call constructor of superclass CoolingSystem
        this.powerRating = powerRating;
    }

    public void setOn(boolean On){
        super.setOn(On);
        if (On){
            timer.start();
        }
        else{
            timer.stop();
        }
    }

    public float getTimeOn(){
        float hours = (float) timer.read() / 3600000;
        return hours;
    }

    public float getPowerRating(){
        return powerRating;
    }

    public float getPowerConsumption(){
        float powerConsumption = getPowerRating() * getTimeOn();
        return powerConsumption;
    }

    public boolean resetTimer(){
        if (isOn() == false){
            timer.reset();
            return true;
        }
        else {
            return false;
        }
    }
}
