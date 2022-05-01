/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalprojectBackend.Components;

/**
 *
 * @author girish
 * This is the utility file used to take in inputs from the user(Organization) in ui.
 */
public class Address {
    private String addressLine1;
    private String addressLine2;
    private int apartmentNo;
    private String city;
    private String state;
    private int zip;
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public int getApartmentNo() {
        return apartmentNo;
    }

    public void setApartmentNo(int apartmentNo) {
        this.apartmentNo = apartmentNo;
    }

    public Address(String addressLine1, String addressLine2, int apartmentNo, String city, String state, int zip) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.apartmentNo = apartmentNo;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
