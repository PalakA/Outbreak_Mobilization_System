/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manager;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/17/2021            @author palak       Added Manager getter setter information
 */

public class Manager {
    
    private static int count = 1;
    public int managerId;
    public String managerName;
    public String managerUsername;
    public String managerPassword;
    public String managerNumber;

    public Manager() {
        this.managerId = count;
        count++;
    }

    public Manager(int managerId, String managerName, String managerUsername, String managerPassword, String managerNumber) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.managerUsername = managerUsername;
        this.managerPassword = managerPassword;
        this.managerNumber = managerNumber;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public String getManagerNumber() {
        return managerNumber;
    }

    public void setManagerNumber(String managerNumber) {
        this.managerNumber = managerNumber;
    }
    
    @Override
    public String toString() {
        return managerName;
    }
}
