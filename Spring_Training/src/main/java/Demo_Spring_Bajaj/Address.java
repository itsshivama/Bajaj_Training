package Demo_Spring_Bajaj;

public class Address {
    private String addressLine1, addressLine2;

    Address(){

    }

    @Override
    public String toString(){
        return "Address{ + " +
                "AddressLine1 = " + addressLine1 +
                "AddressLine2 = " + addressLine2;
    }
    public Address(String addressLine1, String addressLine2){
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
}
