/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.Hospital;

import finalprojectBackend.Organization.User;
import java.util.Date;

/**
 *
 * @author girish
 */
public class Patient extends User {
    
    private String ptnDiagnosis;
    private String hospitalName;

    public String getPtnDiagnosis() {
        return ptnDiagnosis;
    }

    public void setPtnDiagnosis(String ptnDiagnosis) {
        this.ptnDiagnosis = ptnDiagnosis;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    
    public Patient(String userName, String password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dateOfBirth, String ptnDiagnosis, String hospitalName) {
        super(userName, password, userId, PersonName, address, gender, phoneNumber, dateOfBirth);
        this.ptnDiagnosis = ptnDiagnosis;
        this.hospitalName = hospitalName;
    }
}
