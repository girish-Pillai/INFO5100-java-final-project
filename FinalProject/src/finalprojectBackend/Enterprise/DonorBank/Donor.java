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
 */
public class Donor extends User{
    
    private String donorBankName;
    
    public Donor(String userName, String password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dateOfBirth,String donorBankName) {
        super(userName, password, userId, PersonName, address, gender, phoneNumber, dateOfBirth);
        this.donorBankName = donorBankName;
    }

    public String getDonorBankName() {
        return donorBankName;
    }

    public void setDonorBankName(String donorBankName) {
        this.donorBankName = donorBankName;
    }
}
