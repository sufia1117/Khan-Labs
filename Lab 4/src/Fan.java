public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on == true) {
            String onString = "Fan speed: " + speed + "\nColor: " + color + "\nRadius: " + radius;
            return onString;
        }
        else {
            String offString = "Fan is off.\nColor: " + color + "\nRadius:" + radius;
            return offString;
        }
    }
    public static void main(String[] args) {
        Fan fanOne = new Fan();
        fanOne.setSpeed(FAST);
        fanOne.setRadius(10);
        fanOne.setColor("yellow");
        fanOne.setOn(true);
        System.out.print(fanOne);

        System.out.print("\n--------------------\n");

        Fan fanTwo = new Fan();
        fanTwo.setSpeed(MEDIUM);
        fanTwo.setRadius(5);
        fanTwo.setColor("blue");
        fanTwo.setOn(false);
        System.out.print(fanTwo);
    }
}