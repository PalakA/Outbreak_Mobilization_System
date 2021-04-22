/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manager;

import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/17/2021            @author palak       Added Manager directory
 */

public class ManagerDirectory {
    
    private Manager manager;
    private ArrayList<Manager> managerList;

    public ManagerDirectory(ArrayList<Manager> managerList) {
        this.managerList = new ArrayList<Manager>();
    }

    public Manager getmanager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public ArrayList<Manager> getManagerList() {
        return managerList;
    }

    public void setManagerList(ArrayList<Manager> managerList) {
        this.managerList = managerList;
    }
    
    public Manager getManager(String managerUsername) {
        for(Manager manager: managerList) {
            if(manager.getManagerUsername().equalsIgnoreCase(managerUsername)) {
                return manager;
            }
        }
        return null;
    }
    
    public Manager createManager(String managerName, String managerUsername, String managerPassword, String managerNumber) {
        manager = new Manager(manager.getManagerId(), managerName, managerUsername, managerPassword, managerNumber);
        managerList.add(manager);
        return manager;
    }
    
    public void deleteManager(String managerUsername) {
        for(int i=0; i<managerList.size(); i++) {
            if(managerList.get(i).getManagerUsername().equals(managerUsername)) {
                managerList.remove(i);
            }
        }
    }
    
    public void updateManager(Manager manager, String managerName, String managerUsername, String managerPassword, String managerNumber) {
        for(Manager updateManager: managerList) {
            if(updateManager.getManagerUsername().equalsIgnoreCase(managerUsername)) {
                manager.managerName = managerName;
                manager.managerUsername = managerUsername;
                manager.managerPassword = managerPassword;
                manager.managerNumber = managerNumber;
            }
        }
    }
}
