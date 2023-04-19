package be.intecbrussel.robot;

public class LiftingRobot extends Robot {
    private double maxLifeHeight;

    public LiftingRobot(String unitName, double maxLifeHeight) {
        super(unitName);
        this.maxLifeHeight = maxLifeHeight;
    }

    public void life (double heigth){

        if(heigth > maxLifeHeight && heigth >= 0){
            System.out.println("no can do");
        } else System.out.println("ok can do");
    }

    @Override
    public String toString() {
        return "LiftingRobot{" +
                "maxLifeHeight=" + maxLifeHeight +
                '}';
    }
}
