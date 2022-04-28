/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.Logistics;

import finalprojectBackend.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author girish
 */
public class Logistics extends Enterprise {
    
    private ArrayList<Handler> handler;
    private ArrayList<Vehicle> vehicle;

    public Logistics(String address, String userName, String pwd, String enterpriseName, String regNumber) {
        super(address, userName, pwd, enterpriseName, regNumber);
    }

    public ArrayList<Handler> getHandler() {
        return handler;
    }

    public void setHandler(ArrayList<Handler> handler) {
        this.handler = handler;
    }

    public ArrayList<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(ArrayList<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
}
