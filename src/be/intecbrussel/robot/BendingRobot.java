package be.intecbrussel.robot;

public class BendingRobot extends Robot {
    private double maxBendAngle;

    public BendingRobot(String unitName, double maxBendAngle) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public void bend (double bendAngle){

        if (bendAngle > maxBendAngle){
            System.out.println("no can do");
        } else System.out.println("gelukt");
    }

    @Override
    public String toString() {
        return "BendingRobot{" +
                "maxBendAngle=" + maxBendAngle +
                '}';
    }
}
