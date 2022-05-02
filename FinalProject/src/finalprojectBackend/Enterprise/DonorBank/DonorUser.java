/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.DonorBank;
import finalprojectBackend.Organization.User;
import java.util.Date;

/**
 *
 * @author prasa
 This Class holds all the functionalities for the DonorUser User
 */
public class DonorUser extends User{
    
    private String donorBankName;
    
    public DonorUser(String uname, String user_password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dob,String donorBankName) {
        super(uname, user_password, userId, PersonName, address, gender, phoneNumber, dob);
        this.donorBankName = donorBankName;
    }

    public String getDonorBankName() {
        return donorBankName;
    }

    public void setDonorBankName(String donorBankName) {
        this.donorBankName = donorBankName;
    }
}
