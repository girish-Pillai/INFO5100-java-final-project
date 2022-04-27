/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalprojectBackend.BasicInfo;

/**
 *
 * @author girish
 */
public class MainClass {
    private String Address1;
    private String Address2;
    private int AptNum;
    private String City;
    private String State;
    private int Zip;

    public MainClass(String Address1, String Address2, int AptNum, String City, String State, int Zip) {
        this.Address1 = Address1;
        this.Address2 = Address2;
        this.AptNum = AptNum;
        this.City = City;
        this.State = State;
        this.Zip = Zip;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String Address1) {
        this.Address1 = Address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }

    public int getAptNum() {
        return AptNum;
    }

    public void setAptNum(int AptNum) {
        this.AptNum = AptNum;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getZip() {
        return Zip;
    }

    public void setZip(int Zip) {
        this.Zip = Zip;
    }

    
    
}
