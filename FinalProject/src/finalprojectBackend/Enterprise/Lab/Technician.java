/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.Lab;

import finalprojectBackend.Organization.User;
import java.util.Date;

/**
 *
 * @author girish
 */
public class Technician extends User {
    
    private String laboratoryName;
    
    public Technician(String userName, String password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dateOfBirth, String laboratoryName) {
        super(userName, password, userId, PersonName, address, gender, phoneNumber, dateOfBirth);
        this.laboratoryName = laboratoryName;
    }

    public String getLaboratoryName() {
        return laboratoryName;
    }

    public void setLaboratoryName(String laboratoryName) {
        this.laboratoryName = laboratoryName;
    }
}

