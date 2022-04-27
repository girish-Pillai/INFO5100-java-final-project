/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.MainEnterprises.Hospital;

import finalprojectBackend.BasicInfo.MainClass;
import finalprojectBackend.Organization.User;
import java.util.Date;

/**
 *
 * @author girish
 */
public class Doctor extends User {

private String speciality;
private String hospname;

    public Doctor(String uname, String pswd, String id, String name, String add, String gender, String telenum, Date dob, String speciality,String hospname) {
        super(uname, pswd, id, name, add, gender, telenum, dob);
        this.speciality = speciality;
        this.hospname = hospname;
    }

    public String getHospname() {
        return hospname;
    }

    public void setHospname(String hospname) {
        this.hospname = hospname;
    }

    
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
   
}