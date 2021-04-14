/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplyChain;

import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author ajayp       Added Supplychain Directory Information
 * 04/14/2021            @author ajayp       Updated Line 57 for incrementing id using counter
 */

public class SupplyChainDirectory {
    
    private SupplyChain supplyChain;
    private ArrayList<SupplyChain> supplyChainList;

    public SupplyChainDirectory(ArrayList<SupplyChain> supplyChainList) {
        this.supplyChainList = new ArrayList<SupplyChain>();
    }

    public SupplyChain getSupplyChain() {
        return supplyChain;
    }

    public void setSupplyChain(SupplyChain supplyChain) {
        this.supplyChain = supplyChain;
    }

    public ArrayList<SupplyChain> getSupplyChainList() {
        return supplyChainList;
    }

    public void setSupplyChainList(ArrayList<SupplyChain> supplyChainList) {
        this.supplyChainList = supplyChainList;
    }
    
    public SupplyChain getSupplyChain(String supplyChainUsername) {
        for(SupplyChain supplyChain: supplyChainList) {
            if(supplyChain.getSupplyChainUsername().equalsIgnoreCase(supplyChainUsername)) {
                return supplyChain;
            }
        }
        return null;
    }
    
    public SupplyChain createSupplyChain(int supplyChainId, String supplyChainName, String supplyChainUsername, String supplyChainPassword, String supplyChainAddress, String supplyChainNumber) {
        supplyChain = new SupplyChain(supplyChain.getSupplyChainId(), supplyChainName, supplyChainUsername, supplyChainPassword, supplyChainAddress, supplyChainNumber);
        supplyChainList.add(supplyChain);
        return supplyChain;
    }
    
    public void deleteSupplyChain(String supplyChainUsername) {
        for(int i=0; i<supplyChainList.size(); i++) {
            if(supplyChainList.get(i).getSupplyChainUsername().equals(supplyChainUsername)) {
                supplyChainList.remove(i);
            }
        }
    }
    
    public void updateSupplyChain(SupplyChain supplyChain, String supplyChainName, String supplyChainUsername, String supplyChainPassword, String supplyChainAddress, String supplyChainNumber) {
        for(SupplyChain updateSupplyChain: supplyChainList) {
            if(updateSupplyChain.getSupplyChainUsername().equalsIgnoreCase(supplyChainUsername)) {
                supplyChain.supplyChainName = supplyChainName;
                supplyChain.supplyChainUsername = supplyChainUsername;
                supplyChain.supplyChainPassword = supplyChainPassword;
                supplyChain.supplyChainAddress = supplyChainAddress;
                supplyChain.supplyChainNumber = supplyChainNumber;
            }
        }
    }
}
