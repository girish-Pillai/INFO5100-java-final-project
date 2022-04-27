/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprises;

import finalprojectBackend.BasicInfo.MainClass;
/**
 *
 * @author girish
 */
public class Enterprise {
    private String enterpriseName;
    private String registeryNumber;
    private String address;
    private String username;
    private String password;

    public Enterprise(String enterpriseName, String registeryNumber, String address, String username, String password) {
        this.enterpriseName = enterpriseName;
        this.registeryNumber = registeryNumber;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getRegisteryNumber() {
        return registeryNumber;
    }

    public void setRegisteryNumber(String registeryNumber) {
        this.registeryNumber = registeryNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
