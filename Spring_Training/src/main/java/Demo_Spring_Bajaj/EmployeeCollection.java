package Demo_Spring_Bajaj;

import java.util.List;

public class EmployeeCollection {
    private String name;
    private int eid;
    private int sal;
    private List<String> languages;

    @Override
    public String toString() {
        return "EmployeeCollection{" +
                "name='" + name + '\'' +
                ", eid=" + eid +
                ", sal=" + sal +
                ", languages=" + languages +
                '}';
    }

    public EmployeeCollection(int eid, String name, int sal, List<String> languages){
        System.out.println("Inside Constructor");
        this.languages=languages;
        this.name = name;
        this.eid = eid;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}
