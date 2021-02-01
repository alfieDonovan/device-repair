package devicerepair;

public class Component {

    private String ComponentName;
    private double Cost;

    public Component(String ComponentName, double code) {
        this.ComponentName = ComponentName;
        this.Cost = code;
    }

    public String getComponentName() {
        return ComponentName;
    }

    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    public double getCode() {
        return Cost;
    }

    public void setCode(double Cost) {
        this.Cost = Cost;
    }

}
