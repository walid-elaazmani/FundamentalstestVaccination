package be.intecbrussel.robot;

public abstract class Robot {
    private String unitName;

    public Robot() {
        this.unitName = "nameless Robot";
        boot();
    }

    public Robot(String unitName) {
        this.unitName = unitName;
    }

    public void boot(){
        System.out.println("Robot is starting up");
        System.out.println("name of unit: " + unitName);
    }

    public String getUnitName() {
        return this.unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "unitName='" + unitName + '\'' +
                '}';
    }
}
