/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.Lab;

import finalprojectBackend.Enterprises.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author girish
 */
public class Lab extends Enterprise{
    
    private ArrayList<Technician> techdirectory;
    
    public Lab(String enterpriseName, String registeryNumber, String address, String username, String password) {
        super(enterpriseName, registeryNumber, address, username, password);
        this.techdirectory = new ArrayList();
    }

    public ArrayList<Technician> getTechdirectory() {
        return techdirectory;
    }

    public void setTechdirectory(ArrayList<Technician> techdirectory) {
        this.techdirectory = techdirectory;
    }
    
}

