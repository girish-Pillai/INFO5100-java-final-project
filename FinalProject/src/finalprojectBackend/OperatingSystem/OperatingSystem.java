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
    private ArrayList<DonorBank> donorBankDirectory;
    private ArrayList<Nurse> nurseDirectory;
    private ArrayList<Patient> patientDirectory;
    private ArrayList<DonationAssignment> donationAssignmentList;
    private ArrayList<Handler> handlerDirectory;
    private ArrayList<Vehicle> vehicleDirectory;
    private ArrayList<Technician> technicianDirectory;
    
    public OperatingSystem() {
        this.hospitalDirectory = new HospitalDirectory();
        this.doctorDirectory = new ArrayList();
        this.donorUserDirectory = new ArrayList();
        this.donorBankDirectory = new ArrayList();
        this.nurseDirectory = new ArrayList();
        this.patientDirectory = new ArrayList();
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

    public ArrayList<DonorBank> getDonorBankDirectory() {
        return donorBankDirectory;
    }

    public void setDonorBankDirectory(ArrayList<DonorBank> donorBankDirectory) {
        this.donorBankDirectory = donorBankDirectory;
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
    
    public void addDoctor(Doc doc) {
        try {
            doctorDirectory.add(doc);
        } catch (Exception e) {
            this.doctorDirectory = new ArrayList();
            doctorDirectory.add(doc);
            e.printStackTrace();
        }
    }

    public void addNurse(Nurse nur) {
        try {
            nurseDirectory.add(nur);
        } catch (Exception e) {
            this.nurseDirectory = new ArrayList();
            nurseDirectory.add(nur);
            e.printStackTrace();
        }
    }

    public void addPatient(Patient pat) {
        try {
            patientDirectory.add(pat);
        } catch (Exception e) {
            this.patientDirectory = new ArrayList();
            patientDirectory.add(pat);
            e.printStackTrace();
        }
    }
    
    public Object loginAuthentication(String userId, String password) {

        for (Doc d : doctorDirectory) {
            System.out.println("LoginCheck(doc): " + d.getUserName() + " " + d.getPassword());
            if (d.getUserName().equals(userId) && d.getPassword().equals(password)) {
                return d;
            }
        }
         for (Hospital ho : hospitalDirectory.getListOfHospitals()) {
            System.out.println("LoginCheck(ho): " + ho.getUserName() + " " + ho.getPwd());
            if (ho.getUserName().equals(userId) && ho.getPwd().equals(password)) {
                System.out.println("LoginCheck(): matched");
                return ho;
            }
        }

        for (Patient p : patientDirectory) {
            System.out.println("LoginCheck(doc): " + p.getUserName() + " " + p.getPassword());
            if (p.getUserName().equals(userId) && p.getPassword().equals(password)) {
                return p;
            }
        }

       
        for (DonorBank don : donorBankDirectory) {
            if (don.getUserName().equals(userId) && don.getPwd().equals(password)) {
                return don;
            }
        }
        for (Handler don : handlerDirectory) {
            if (don.getUserName().equals(userId) && don.getPassword().equals(password)) {
                return don;
            }
        }

        for (Technician tech : technicianDirectory) {
            if (tech.getUserName().equals(userId) && tech.getPassword().equals(password)) {
                return tech;
            }
        }

        for (DonorUser don : donorUserDirectory) {
            if (don.getUserName().equals(userId) && don.getPassword().equals(password)) {
                return don;
            }
        }
        return null;
    }

    public void deleteDoctorUser(String doctorUserName) {
        for (Doc d : doctorDirectory) {
            if (d.getUserName().equals(doctorUserName)) {
                doctorDirectory.remove(d);
                return;
            }
        }
    }

    public void deleteNurseUser(String NurseUserName) {
        for (Nurse n : nurseDirectory) {
            if (n.getUserName().equals(NurseUserName)) {
                nurseDirectory.remove(n);
                return;
            }
        }
    }

    public void deletePatient(String PatientUserName) {
        for (Patient p : patientDirectory) {
            if (p.getUserName().equals(PatientUserName)) {
                patientDirectory.remove(p);
                return;
            }
        }
    }
    
}
