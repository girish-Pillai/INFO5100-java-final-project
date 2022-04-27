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
    
    private String labname;
    
    public Technician(String uname, String pswd, String id, String name, String add, String gender, String telenum, Date dob,String labname) {
        super(uname, pswd, id, name, add, gender, telenum, dob);
        this.labname = labname;
    }

    public String getLabname() {
        return labname;
    }

    public void setLabname(String labname) {
        this.labname = labname;
    }
    
    
}
