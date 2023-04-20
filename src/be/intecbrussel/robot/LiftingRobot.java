package be.intecbrussel.robot;

public class LiftingRobot extends Robot {
    private double maxLifeHeight;

    public LiftingRobot(String unitName, double maxLifeHeight) {
        super(unitName);

        if (maxLifeHeight < 0) {
            maxLifeHeight = 0;
        }

        this.maxLifeHeight = maxLifeHeight;
    }

    public void lift(double heigth){

        if(heigth > maxLifeHeight || heigth < 0){
            System.out.println("no can do");
        } else System.out.println("ok can do, lifted up to : " + heigth + " cm");
    }

    @Override
    public String toString() {
        return "LiftingRobot{" +
                "maxLifeHeight=" + maxLifeHeight +
                '}';
    }
}
