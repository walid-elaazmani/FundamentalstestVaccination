package be.intecbrussel.robot;

public class CrazyRobot extends Robot {

    public CrazyRobot(String unitName) {
        super(unitName);
        boot();
    }

    public void boot(){
        System.out.println("Booting up")
        System.out.println("my name is " + new StringBuilder(super.getUnitName()).reverse().toString());
    }

}
