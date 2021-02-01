package devicerepair;

public class Device {

    protected String Code;
    protected String Model;
    protected String Owner;
    protected String Problem;
    protected String Repair;
    protected int Priority;

    public Device(String Code, String Model, String Owner, String Problem, String Repair, int priority) {
        this.Code = Code;
        this.Model = Model;
        this.Owner = Owner;
        this.Problem = Problem;
        this.Repair = Repair;
        this.Priority = priority;
    }

    public String toString() {
        return Code + ", " + Model + ", " + Owner + ", " + Problem + ", " + Repair + ", " + Priority;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public String getProblem() {
        return Problem;
    }

    public void setProblem(String Problem) {
        this.Problem = Problem;
    }

    public String getRepair() {
        return Repair;
    }

    public void setRepair(String Repair) {
        this.Repair = Repair;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int priority) {
        this.Priority = priority;
    }

}
