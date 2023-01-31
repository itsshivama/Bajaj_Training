package Demo_Spring_Bajaj;

public class Employee {
    private String name;
    private int eid;
    private int sal;

    Employee(){

    }
    Employee(int eid, String name, int sal){
        System.out.println("Inside Constructor");
        this.name = name;
        this.eid = eid;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", eid=" + eid +
                ", sal=" + sal +
                '}';
    }

    public void setEid(int eid) {
        System.out.println("Inside Setter Method Injection");
        this.eid = eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
    public int getEid() {
        return eid;
    }

    public int getSal() {
        return sal;
    }

    public String getName() {
        return name;
    }
}
