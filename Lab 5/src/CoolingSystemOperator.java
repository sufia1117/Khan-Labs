public class CoolingSystemOperator {
    /**
     * Increments operating capacity one level at a time to reach maximum capacity
     * Decrements operating capacity one level at a time to reach minimum capacity
     * @param sys takes in the specific cooling system
     */
    public static void testRampUp(CoolingSystem sys){
        // Set operating capacity to 1
        sys.setOperatingCapacity(1);
        // Turn system on
        sys.setOn(true);
        int operatingCapacity;
        // Increment capacity until max capacity is reached
        for (int i = 0; i < sys.getMaxCapacity(); i++ ){
            operatingCapacity = sys.operatingCapacity + 1;
        }
        // Increment capacity until minimum capacity is reached
        for (int i = 0; i < sys.getMinCapacity(); i++){
            operatingCapacity = sys.operatingCapacity - 1;
        }
        // Turn system off
        sys.setOn(false);
    }

    /**
     * Tests system to make sure it will not allow invalid numbers of fans outside of minimum and max range
     * @param sys takes in the specific cooling system
     */
    public static void testRange(CoolingSystem sys){
        // Turn system on
        sys.setOn(true);
        // set capacity above valid range
        sys.setOperatingCapacity(12);
        // set capacity below valid range
        sys.setOperatingCapacity(-1);
        // turn system off
        sys.setOn(false);
    }
    public static void main(String[] args) {
        CoolingSystem systemOne = new CoolingSystem(8);
        systemOne.setOn(true);
        systemOne.setSystemSpeed(Fan.MEDIUM);
        systemOne.setOperatingCapacity(4);
        testRampUp(systemOne);
        testRange(systemOne);
    }
}