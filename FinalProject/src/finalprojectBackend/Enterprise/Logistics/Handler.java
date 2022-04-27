/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.Logistics;

import finalprojectBackend.Organization.User;
import java.util.Date;

/**
 *
 * @author girish
 */
public class Handler extends User {
    
    private Vehicle vehicle;
    
    public Handler(String uname, String pswd, String id, String name, String add, String gender, String telenum, Date dob,Vehicle vehicle) {
        super(uname, pswd, id, name, add, gender, telenum, dob);
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
  
    
    
}
