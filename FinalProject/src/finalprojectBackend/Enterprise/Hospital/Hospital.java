/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise.Hospital;

import finalprojectBackend.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author girish
 */
public class Hospital extends Enterprise {

    private ArrayList<Doc> doctorDirectory;
    private ArrayList<Nurse> nurseDirectory;
    private ArrayList<Patient> patientDirectory;

    public Hospital(String address, String userName, String pwd, String enterpriseName, String regNumber) {
        super(address, userName, pwd, enterpriseName, regNumber);

        this.doctorDirectory = new ArrayList();
        this.nurseDirectory = new ArrayList();
        this.patientDirectory = new ArrayList();

    }

    public ArrayList<Doc> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doc> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public ArrayList<Nurse> getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(ArrayList<Nurse> nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public void addNurse(Nurse nurse) {
        nurseDirectory.add(nurse);
    }

    public void addPatient(Patient patient) {
        patientDirectory.add(patient);
    }
    
    public void addDoctor(Doc doc) {
        doctorDirectory.add(doc);
    }
}
