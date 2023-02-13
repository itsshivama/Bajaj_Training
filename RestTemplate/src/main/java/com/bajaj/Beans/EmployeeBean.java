package com.bajaj.Beans;

import jakarta.persistence.Id;

public class EmployeeBean {
    @Id
    private int eid;
    private String ename;
    private int salary;
    private int did;

    public EmployeeBean(int eid, String ename, int salary, int did) {
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.did = did;
    }

    public EmployeeBean(int eid){
        this.eid=eid;
    }

    public EmployeeBean() {}

    public int getId() {
        return eid;
    }

    public void setId(int eid) {
        this.eid = eid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + eid +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", did=" + did +
                '}';
    }
}
