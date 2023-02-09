
package com.bajaj.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="employee")
public class EmployeeEntity {
	
	@Id
	private int eid;
	private String ename;
	private int salary;
	private int did;

		public EmployeeEntity(int eid, String ename, int salary, int did) {
			this.eid = eid;
			this.ename = ename;
			this.salary = salary;
			this.did = did;
		}

		public EmployeeEntity(int eid){
			this.eid=eid;
		}

	public EmployeeEntity() {}

	public int getId() {
		return eid;
	}

	public void setId(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
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
