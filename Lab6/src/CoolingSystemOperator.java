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
            Stopwatch.pauseFor(500);
        }
        // Increment capacity until minimum capacity is reached
        for (int i = 0; i < sys.getMinCapacity(); i++){
            operatingCapacity = sys.operatingCapacity - 1;
            Stopwatch.pauseFor(500);
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
        // pause for 1 second
        Stopwatch.pauseFor(500);
        // set capacity below valid range
        sys.setOperatingCapacity(-1);
        // pause for 1 second
        Stopwatch.pauseFor(500);
        // turn system off
        sys.setOn(false);
    }

    public static void main(String[] args) {
        //instantiate a new AdvancedCoolingSystem
        AdvancedCoolingSystem systemOne = new AdvancedCoolingSystem(8, 0.84F);
        // turn AdvancedCoolingSystem on
        systemOne.setOn(true);
        // set system speed to medium
        systemOne.setSystemSpeed(Fan.MEDIUM);
        // set operating capacity to 4
        systemOne.setOperatingCapacity(4);
        // Do ramp-up test
        testRampUp(systemOne);
        // print amount of time system was on during test
        System.out.println("Time used during test is" + systemOne.getTimeOn());
        // print power consumption during test
        System.out.println("Power consumption during test is " + systemOne.getPowerConsumption() + " kWh.");
        // reset the timer
        systemOne.resetTimer();
        // do range test
        testRange(systemOne);
        // print amount of time system was on during test
        System.out.println("Time used during test is" + systemOne.getTimeOn());
        // print power consumption during test
        System.out.println("Power consumption during test is " + systemOne.getPowerConsumption() + " kWh.");
    }
}
