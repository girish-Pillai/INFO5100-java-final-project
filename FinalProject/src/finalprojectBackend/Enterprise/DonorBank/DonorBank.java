/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.DonorBank;
import finalprojectBackend.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author prasa
 */
public class DonorBank extends Enterprise {
    
    private ArrayList<Donor> donor;
    private ArrayList<BloodGroup> bloodgroup;
    private ArrayList<Organ> organ;

    public DonorBank(String address, String userName, String pwd, String enterpriseName, String regNumber) {
        super(address, userName, pwd, enterpriseName, regNumber);

        this.donor = new ArrayList();
        this.bloodgroup = new ArrayList();
        this.organ = new ArrayList();
    }

    public ArrayList<Donor> getDonor() {
        return donor;
    }

    public void setDonor(ArrayList<Donor> donor) {
        this.donor = donor;
    }

    public ArrayList<BloodGroup> getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(ArrayList<BloodGroup> bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public ArrayList<Organ> getOrgan() {
        return organ;
    }

    public void setOrgan(ArrayList<Organ> organ) {
        this.organ = organ;
    }

}
