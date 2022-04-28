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

    public void removeHospital(String id) {

        for (Hospital hosp : listOfHospitals) {
            if (hosp.getRegisteryNumber() == id) {
                listOfHospitals.remove(hosp);
            }
        }
    }
    
    public ArrayList<Hospital> getListOfHospitals() {
        return listOfHospitals;
    }

    public void setListOfHospitals(ArrayList<Hospital> listOfHospitals) {
        this.listOfHospitals = listOfHospitals;
    }

    public Hospital findHospital(String hospitalName) {
        System.out.println("findHospital() "+hospitalName);
        for (Hospital hosp : listOfHospitals) {
            if (hosp.getEnterpriseName() == hospitalName) {
                return hosp;
            }
        }
        return null;
    }   
}
