/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Directories.EnterpriseDirectories;

import finalprojectBackend.Enterprise.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author girish
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> listOfHospitals;
 
    public HospitalDirectory(){
        listOfHospitals = new ArrayList();
    }

    public void addHospital(Hospital hospital) {
        listOfHospitals.add(hospital);
    }

    public void removeHospital(String hosId) {

        for (Hospital hos : listOfHospitals) {
            if (hos.getRegNumber() == hosId) {
                listOfHospitals.remove(hos);
            }
        }
    }
    
    public Hospital findHospital(String hosName) {
        System.out.println("SearchHospital() "+hosName);
        for (Hospital Hos : listOfHospitals) {
            if (Hos.getEnterpriseName() == hosName) {
                return Hos;
            }
        }
        return null;
    } 
    
    public ArrayList<Hospital> getListOfHospitals() {
        return listOfHospitals;
    }

    public void setListOfHospitals(ArrayList<Hospital> listOfHospitals) {
        this.listOfHospitals = listOfHospitals;
    }
  
}
