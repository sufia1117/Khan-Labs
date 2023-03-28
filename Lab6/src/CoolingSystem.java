public class CoolingSystem {
    private Fan[] fans;
    public int operatingCapacity = minCapacity;
    private boolean on = false;
    private int systemSpeed = Fan.SLOW;
    private static final int minCapacity = 1;

    private static final int maxCapacity = 10;

    /**
     * Constructor for CoolingSystem which checks for validity
     * @param numOfFans is the number of fans in a system
     */
    public CoolingSystem(int numOfFans){
        if (numOfFans > maxCapacity){
            numOfFans = maxCapacity;
        } else if (numOfFans < minCapacity){
            numOfFans = minCapacity;
        }
        fans = new Fan[numOfFans];
        for (int i = 0; i < fans.length; i++){
            fans[i] = new Fan();
        }
            // loop through the array and set each element to be anew instance of Fan

    }

    /**
     * Allows other classes to access the minimum capacity
     * @return the minimum capacity, which is 1
     */
    public int getMinCapacity(){
        return minCapacity;
    }

    /**
     * Allows other classes to access the maximum capacity
     * @return the maximum capacity, which is 10
     */
    public int getMaxCapacity(){
        return maxCapacity;
    }

    /**
     * Accessor to see if system is on
     * @return boolean true for on and false for off
     */
    public boolean isOn(){
        return on;
    }

    /**
     * Accessor to know overall speed of system
     * @return overall speed of system
     */
    public int getSpeed() {
        return systemSpeed;
    }

    /**
     * Accessor to see the number of fans operating when system is on
     * @return number of fans on when system is on
     */
    public int getOperatingCapacity(){
        return operatingCapacity;
    }

    /**
     * Accessor to check if system is operating at maximum or minimum capacity
     * @return capacity at which system is operating
     */
    public int getCapacity(){
        return operatingCapacity;
    }

    /**
     * Turns cooling system on or off
     * @param on takes in boolean true for on anf false for off
     */
    public void setOn(boolean on){
        this.on = on;
        if (this.on) {
            for (int i = 0; i < fans.length; i++){
                if (i < operatingCapacity){
                    fans[i].setOn(true);
                } else{
                    fans[i].setOn(false);
                }
            }
        } else {
            for (int i = 0; i < fans.length; i++) {
                fans[i].setOn(false);
            }
        }
    }

    /**
     * Sets speed for overall system
     * @param systemSpeed takes in SLOW, MEDIUM, or FAST from Fan class
     */
    public void setSystemSpeed(int systemSpeed){
        this.systemSpeed = systemSpeed;
    }

    /**
     * Sets the number of fans on when system is on; checks validity
     * @param operatingCapacity takes in a number between 1 and 10
     */
    public void setOperatingCapacity(int operatingCapacity) {
        if (operatingCapacity > fans.length) {
            operatingCapacity = fans.length;
        } else if (operatingCapacity < minCapacity) {
            operatingCapacity = minCapacity;
            this.operatingCapacity = operatingCapacity;
        }
    }


    /**
     * Increments operating capacity by one
     */
    public void turnUp(){
        if (operatingCapacity == maxCapacity){
            this.operatingCapacity = maxCapacity;
        } else {
            this.operatingCapacity = operatingCapacity + 1;
        }
    }

    /**
     * Decrements operating capacity by one
     */
    public void turnDown(){
        if (operatingCapacity == minCapacity){
            this.operatingCapacity = minCapacity;
        } else {
            this.operatingCapacity = operatingCapacity - 1;
        }
    }
}
