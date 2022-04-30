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
    
    public static OperatingSystem getInstance() {
        if (os == null) {
            os = new OperatingSystem();
        }
        return os;
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
    
    public void addHospital(Hospital hosp) {
        System.out.println("addHospital() in ecosystem: " + hosp.getEnterpriseName());
        hospitalDirectory.addHospital(hosp);
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
    
    public void addDonationAssignment(DonationAssignment newDonationAssignment) {
        try {
            donationAssignmentList.add(newDonationAssignment);

        } catch (Exception e) {
            this.donationAssignmentList = new ArrayList();
            donationAssignmentList.add(newDonationAssignment);
        }
    }

    public void addDonor(DonorUser newDonor) {
        try {
            donorUserDirectory.add(newDonor);
        } catch (Exception e) {
            this.donorUserDirectory = new ArrayList();
            donorUserDirectory.add(newDonor);

        }
    }

    public void addDonorBank(DonorBank newDonorBank) {
        try {
            donorBankDirectory.add(newDonorBank);
        } catch (Exception e) {
            this.donorBankDirectory = new ArrayList();
            donorBankDirectory.add(newDonorBank);
            e.printStackTrace();
        }
    }
    
    public void addHandler(Handler newHandler) {
        try {
            handlerDirectory.add(newHandler);
        } catch (Exception e) {
            this.handlerDirectory = new ArrayList();
            handlerDirectory.add(newHandler);

        }
    }

    public void addVehicle(Vehicle newVehicle) {
        try {
            vehicleDirectory.add(newVehicle);
        } catch (Exception e) {
            this.vehicleDirectory = new ArrayList();
            vehicleDirectory.add(newVehicle);

        }
    }

    public void addTechnician(Technician newTechnician) {
        try {
            technicianDirectory.add(newTechnician);
        } catch (Exception e) {
            this.technicianDirectory = new ArrayList();
            technicianDirectory.add(newTechnician);
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
    
    public void deleteDonorByUserName(String doctorUserName) {
        for (DonorUser n : donorUserDirectory) {
            if (n.getUserName().equals(doctorUserName)) {
                donorUserDirectory.remove(n);
                return;
            }
        }
    }
    
    public void deleteDonorBank(String donorBankUName) {
        for (DonorBank n : donorBankDirectory) {
            System.out.println("donorb " + n.getUserName());
            if (n.getUserName().equals(donorBankUName)) {
                System.out.println("found");
                donorBankDirectory.remove(n);
                return;
            }
        }
    }
    
    public void deleteDonor(String donorName) {
        for (DonorUser n : donorUserDirectory) {
            if (n.getUserName().equals(donorName)) {
                donorUserDirectory.remove(n);
                return;
            }
        }
    }

    public void deleteHandler(String HUname) {
        for (Handler n : handlerDirectory) {
            if (n.getUserName().equals(HUname)) {
                handlerDirectory.remove(n);
                return;
            }
        }
    }

    public void deleteVehicle(String vNumber) {
        for (Vehicle n : vehicleDirectory) {
            if (n.getVehiclenum().equals(vNumber)) {
                vehicleDirectory.remove(n);
                return;
            }
        }
    }
    
    public Doc getDoctorByUserName(String userName) {
        for (Doc d : doctorDirectory) {
            if (d.getUserName().equals(userName)) {
                return d;
            }
        }
        return null;
    }

    public User getPatientByUserName(String patientUserName) {
        for (Patient p : patientDirectory) {
            if (p.getUserName().equals(patientUserName)) {
                return p;
            }
        }
        for (DonorUser p : donorUserDirectory) {
            if (p.getUserName().equals(patientUserName)) {
                return p;
            }
        }
        return null;
    }

    public Vehicle getVehicleByNumber(String vehicleNo) {
        for (Vehicle v : vehicleDirectory) {
            if (v.getVehiclenum().matches(vehicleNo.substring(0, vehicleNo.indexOf("|")))) {
                return v;
            }
        }
        return null;
    }
    
    private Handler getHandlerByUserName(String handlerUserName) {
        for (Handler d : handlerDirectory) {
            if (d.getUserName().toLowerCase().equals(handlerUserName.toLowerCase())) {
                return d;
            }
        }
        return null;
    }

    private Technician getTechnicianByUserName(String technicianUserName) {
        for (Technician d : technicianDirectory) {
            if (d.getUserName().equals(technicianUserName)) {
                return d;
            }
        }
        return null;
    } 
    
    public void generateRequesting(String donateEntity, String handler, String tech, Hospital rec, String doc, String recPat) {
        Handler h = getHandlerByUserName(handler);
        Technician t = getTechnicianByUserName(tech);
        Doc d = getDoctorByUserName(doc);
        Patient p = (Patient) getPatientByUserName(recPat);
        for (DonationAssignment da : donationAssignmentList) {
            try {
                if (da.getId().equals(donateEntity)) {
                    da.setHandler(h);
                    da.setTechnician(t);
                    da.setRecEnterprise(rec);
                    da.setRecDoctor(d);
                    da.setRecPatient(p);
                    da.setDonationStatus("Requested");
                    return;
                }
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }
    }
    
}
