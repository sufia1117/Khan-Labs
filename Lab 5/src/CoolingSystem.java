public class CoolingSystem {
    private static Fan[] fans;
    private int operatingCapacity = minCapacity;
    private boolean on = false;
    private int systemSpeed = Fan.SLOW;
    private static final int minCapacity = 1;

    private static final int maxCapacity = 10;

    public CoolingSystem(int numOfFans){
        if (numOfFans > maxCapacity){
            numOfFans = maxCapacity;
        } else if (numOfFans < minCapacity){
            numOfFans = minCapacity;
        } else {
            fans = new Fan[numOfFans];
        }
    }

    public boolean isOn(){
        return on;
    }

    public int getSpeed() {
        return systemSpeed;
    }

    public int getOperatingCapacity(){
        return operatingCapacity;
    }

    public int getCapacity(){
        return operatingCapacity;
    }

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

    public void setOSystemSpeed(int systemSpeed){
        this.systemSpeed = systemSpeed;
    }

    public void setOperatingCapacity(int operatingCapacity1){
        operatingCapacity = Math.max(operatingCapacity, fans.length);
        operatingCapacity = Math.min(operatingCapacity, fans.length);
        this.operatingCapacity = operatingCapacity;

    }

    public void turnUp(){
        if (operatingCapacity == maxCapacity){
            this.operatingCapacity = maxCapacity;
        } else {
            this.operatingCapacity = operatingCapacity + 1;
        }
    }

    public void turnDown(){
        if (operatingCapacity == minCapacity){
            this.operatingCapacity = minCapacity;
        } else {
            this.operatingCapacity = operatingCapacity - 1;
        }
    }






}
