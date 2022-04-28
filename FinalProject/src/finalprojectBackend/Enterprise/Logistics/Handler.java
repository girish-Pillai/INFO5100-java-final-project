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
    
    public Handler(String userName, String password, String userId, String PersonName, String address, String gender, String phoneNumber, Date dateOfBirth, Vehicle vehicle) {
        super(userName, password, userId, PersonName, address, gender, phoneNumber, dateOfBirth);
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
