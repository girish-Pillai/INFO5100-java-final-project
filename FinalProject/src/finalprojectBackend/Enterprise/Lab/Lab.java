/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.Lab;

import finalprojectBackend.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author girish
 */
public class Lab extends Enterprise{
    
    private ArrayList<Technician> technician;
    
    public Lab(String address, String userName, String pwd, String enterpriseName, String regNumber) {
        super(address, userName, pwd, enterpriseName, regNumber);
        this.technician = new ArrayList();
    }

    public ArrayList<Technician> getTechnician() {
        return technician;
    }

    public void setTechnician(ArrayList<Technician> technician) {
        this.technician = technician;
    }
}

