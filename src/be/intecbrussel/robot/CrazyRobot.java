package be.intecbrussel.robot;

public class CrazyRobot extends Robot {

    public CrazyRobot(String unitName) {
        super(unitName);
        boot();
    }

    public void boot(){
        setUnitName(new StringBuilder(super.getUnitName()).reverse().toString());
    }

}
