/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.MainEnterprises.Hospital;

import finalprojectBackend.Organization.PersonClass;
import java.util.Date;

/**
 *
 * @author girish
 */
public class Doc extends PersonClass{
    
    private String hospitalName; 
    private String docSpeciality;
    
    public Doc(String userName, String password, String userId, String personName, String address, String gender, String phoneNumber, Date dateOfBirth, String speciality,String hospname){
        super(userName, password, userId, personName, address, gender, phoneNumber, dateOfBirth);
        this.hospitalName = hospitalName;
        this.docSpeciality = docSpeciality;
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
