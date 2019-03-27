package emp;

public class Manager extends Employee {
    private String managerTitle;

    public Manager (){

    }
    public Manager(String managerTitle) {
        this.managerTitle = managerTitle;
    }
    //getter
    public String getManagerTitle() {
        return managerTitle;
    }
    //setter
    public void setManagerTitle(String managerTitle) {
        this.managerTitle = managerTitle;
    }


}
