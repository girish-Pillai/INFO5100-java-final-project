/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectBackend.Enterprise;

/**
 *
 * @author girish
 */
public class Enterprise {
    private String address;
    private String userName;
    private String pwd;
    private String enterpriseName;
    private String regNumber;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    
    public Enterprise(String address, String userName, String pwd,String enterpriseName, String regNumber) {
        this.address = address;
        this.userName = userName;
        this.pwd = pwd;
        this.enterpriseName = enterpriseName;
        this.regNumber = regNumber;
        
    }
}
