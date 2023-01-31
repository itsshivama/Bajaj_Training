package Demo_Spring_Bajaj;

public class Employee {
    String name;
    int eid;
    int sal;

    Employee(){

    }
    Employee(int eid, String name, int sal){
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

    public int getEid() {
        return eid;
    }

    public int getSal() {
        return sal;
    }

    public String getName() {
        return name;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
