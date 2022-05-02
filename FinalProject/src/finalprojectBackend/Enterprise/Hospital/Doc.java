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
public class Doc extends User{

private String docSpeciality;
private String hospitalName;

    public Doc(String userName, String password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dateOfBirth, String docSpeciality,String hospitalName) {
        super(userName, password, userId, PersonName, address, gender, phoneNumber, dateOfBirth);
        this.docSpeciality = docSpeciality;
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    
    public String getDocSpeciality() {
        return docSpeciality;
    }

    public void setDocSpeciality(String docSpeciality) {
        this.docSpeciality = docSpeciality;
    }
}
