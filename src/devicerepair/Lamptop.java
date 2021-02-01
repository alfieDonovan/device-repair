package devicerepair;

import java.util.ArrayList;

public class Lamptop {

    private ArrayList<Component> Components = new ArrayList<>();

    public class lamptop extends Device {

        public lamptop(String Code, String Model, String Owner, String Problem, String Repair, int priority) {
            super(Code, Model, Owner, Problem, Repair, priority);
        }
    }

    public ArrayList<Component> getComponents() {
        return Components;
    }

    public void setComponents(ArrayList<Component> Components) {
        this.Components = Components;
    }

    public void addComponent(Component component) {
        Components.add(component);
    }

    public void deleteComponent(int index) {
        if (index >= 0 && index < Components.size()) {

            Components.remove(index);
        }
    }
}
