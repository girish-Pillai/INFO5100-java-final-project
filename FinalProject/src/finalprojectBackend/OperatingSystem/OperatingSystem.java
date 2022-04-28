/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.OperatingSystem;

import finalprojectBackend.Directories.EnterpriseDirectories.HospitalDirectory;
import finalprojectBackend.Enterprise.DonorBank.DonorUser;
import finalprojectBackend.Enterprise.DonorBank.DonorBank;
import finalprojectBackend.Enterprise.Hospital.Doc;
import finalprojectBackend.Enterprise.Hospital.Hospital;
import finalprojectBackend.Enterprise.Hospital.Nurse;
import finalprojectBackend.Enterprise.Hospital.Patient;
import finalprojectBackend.Enterprise.Lab.Technician;
import finalprojectBackend.Enterprise.Logistics.Handler;
import finalprojectBackend.Enterprise.Logistics.Vehicle;
import finalprojectBackend.Organization.DonationAssignment;
import finalprojectBackend.Organization.User;
import java.util.ArrayList;

/**
 *
 * @author prasa
 * This is class for all functional methods of the Application
 */
public class OperatingSystem {
    private static OperatingSystem os;
    private HospitalDirectory hospitalDirectory;
    private ArrayList<Doc> doctorDirectory;
    private ArrayList<DonorUser> donorUserDirectory;
    private ArrayList<DonorBank> donorbankDirectory;
    private ArrayList<Nurse> nurseDirectory;
    private ArrayList<Patient> patientdirectory;
    private ArrayList<DonationAssignment> donationAssignmentList;
    private ArrayList<Handler> handlerDirectory;
    private ArrayList<Vehicle> vehicleDirectory;
    private ArrayList<Technician> technicianDirectory;
    
    public OperatingSystem() {
        this.hospitalDirectory = new HospitalDirectory();
        this.doctorDirectory = new ArrayList();
        this.donorUserDirectory = new ArrayList();
        this.donorbankDirectory = new ArrayList();
        this.nurseDirectory = new ArrayList();
        this.patientdirectory = new ArrayList();
        this.donationAssignmentList = new ArrayList();
        this.handlerDirectory = new ArrayList();
        this.vehicleDirectory = new ArrayList();
        this.technicianDirectory = new ArrayList();
    }

    public static OperatingSystem getOs() {
        return os;
    }

    public static void setOs(OperatingSystem os) {
        OperatingSystem.os = os;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public ArrayList<Doc> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doc> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public ArrayList<DonorUser> getDonorUserDirectory() {
        return donorUserDirectory;
    }

    public void setDonorUserDirectory(ArrayList<DonorUser> donorUserDirectory) {
        this.donorUserDirectory = donorUserDirectory;
    }

    public ArrayList<DonorBank> getDonorbankDirectory() {
        return donorbankDirectory;
    }

    public void setDonorbankDirectory(ArrayList<DonorBank> donorbankDirectory) {
        this.donorbankDirectory = donorbankDirectory;
    }

    public ArrayList<Nurse> getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(ArrayList<Nurse> nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }

    public ArrayList<Patient> getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(ArrayList<Patient> patientdirectory) {
        this.patientdirectory = patientdirectory;
    }

    public ArrayList<DonationAssignment> getDonationAssignmentList() {
        return donationAssignmentList;
    }

    public void setDonationAssignmentList(ArrayList<DonationAssignment> donationAssignmentList) {
        this.donationAssignmentList = donationAssignmentList;
    }

    public ArrayList<Handler> getHandlerDirectory() {
        return handlerDirectory;
    }

    public void setHandlerDirectory(ArrayList<Handler> handlerDirectory) {
        this.handlerDirectory = handlerDirectory;
    }

    public ArrayList<Vehicle> getVehicleDirectory() {
        return vehicleDirectory;
    }

    public void setVehicleDirectory(ArrayList<Vehicle> vehicleDirectory) {
        this.vehicleDirectory = vehicleDirectory;
    }

    public ArrayList<Technician> getTechnicianDirectory() {
        return technicianDirectory;
    }

    public void setTechnicianDirectory(ArrayList<Technician> technicianDirectory) {
        this.technicianDirectory = technicianDirectory;
    }
    
}
