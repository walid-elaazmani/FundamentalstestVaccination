package be.intecbrussel.robot;

public class BendingRobot extends Robot {
    private double maxBendAngle;

    public BendingRobot(String unitName, double maxBendAngle) {
        super(unitName);

        maxBendAngle = Math.abs(maxBendAngle);

        if (maxBendAngle > 360) {
            maxBendAngle = 360;
        }

        this.maxBendAngle = maxBendAngle;
    }

    public void bend (double bendAngle){

        bendAngle = Math.abs(bendAngle);

        if (bendAngle < maxBendAngle && bendAngle <= 360.0){
            System.out.println("bended at " + bendAngle + " degrees");
        } else System.out.println("Can not do");
    }

    @Override
    public String toString() {
        return "BendingRobot{" +
                "maxBendAngle=" + maxBendAngle +
                '}';
    }
}
