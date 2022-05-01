/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Organization;
import finalprojectBackend.Enterprise.Enterprise;
import finalprojectBackend.Enterprise.Hospital.Doc;
import finalprojectBackend.Enterprise.Hospital.Nurse;
import finalprojectBackend.Enterprise.Hospital.Patient;
import finalprojectBackend.Enterprise.Lab.Technician;
import finalprojectBackend.Enterprise.SupplyChain.Handler;
/**
 *
 * @author prasa
 * This is a Java Class for Donation Assignment 
 */
public class DonationAssignment {
    
    public String id;
    public Doc donDoctor;
    public Doc recDoctor;
    public Patient recPatient;
    public User donPatient;
    public Nurse nurse;
    public Enterprise donEnterprise;
    public Enterprise recEnterprise;
    public String type;
    public String bGroup;
    public String donationEntityName;
    public String donationStatus;
    public Handler handler;
    public Technician technician;
    private String donationReport;
    private String comm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Doc getDonDoctor() {
        return donDoctor;
    }

    public void setDonDoctor(Doc donDoctor) {
        this.donDoctor = donDoctor;
    }

    public Doc getRecDoctor() {
        return recDoctor;
    }

    public void setRecDoctor(Doc recDoctor) {
        this.recDoctor = recDoctor;
    }

    public Patient getRecPatient() {
        return recPatient;
    }

    public void setRecPatient(Patient recPatient) {
        this.recPatient = recPatient;
    }

    public User getDonPatient() {
        return donPatient;
    }

    public void setDonPatient(User donPatient) {
        this.donPatient = donPatient;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Enterprise getDonEnterprise() {
        return donEnterprise;
    }

    public void setDonEnterprise(Enterprise donEnterprise) {
        this.donEnterprise = donEnterprise;
    }

    public Enterprise getRecEnterprise() {
        return recEnterprise;
    }

    public void setRecEnterprise(Enterprise recEnterprise) {
        this.recEnterprise = recEnterprise;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getbGroup() {
        return bGroup;
    }

    public void setbGroup(String bGroup) {
        this.bGroup = bGroup;
    }

    public String getDonationEntityName() {
        return donationEntityName;
    }

    public void setDonationEntityName(String donationEntityName) {
        this.donationEntityName = donationEntityName;
    }

    public String getDonationStatus() {
        return donationStatus;
    }

    public void setDonationStatus(String donationStatus) {
        this.donationStatus = donationStatus;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public String getDonationReport() {
        return donationReport;
    }

    public void setDonationReport(String donationReport) {
        this.donationReport = donationReport;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }
}
