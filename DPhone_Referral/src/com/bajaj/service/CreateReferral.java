package com.bajaj.service;

import java.util.Objects;

public class CreateReferral {

    int refID, uID, dOR, rPoints;
    String fName, lName, email;
    long mobile;
    Boolean status;

    public CreateReferral(){}

    public CreateReferral(int refID, String fName, String lName, long mobile, String email, int uID, int dOR, int rPoints, Boolean status){
        this.refID = refID;
        this.fName = fName;
        this.lName = lName;
        this.mobile = mobile;
        this.email = email;
        this.uID = uID;
        this.dOR = dOR;
        this.rPoints = rPoints;
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateReferral that = (CreateReferral) o;
        return refID == that.refID && uID == that.uID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(refID, uID);
    }

    public void setrefID(int refID) {
        this.refID = refID;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public int getdOR() {
        return dOR;
    }

    public void setdOR(int dOR) {
        this.dOR = dOR;
    }

    public int getrPoints() {
        return rPoints;
    }

    public void setrPoints(int rPoints) {
        this.rPoints = rPoints;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public Boolean getStatus() {
        return status;
    }

    public int getrefID() {
        return refID;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "\nReferral = {"+
                "Referral id = " +refID+
                " First Name = " +fName+
                " Last Name = " +lName+
                " Email = " +email+
                " Mobile = " +mobile+
                " Referral Points = " +rPoints+
                " Status = " +status+
                "} \n";
    }
}
