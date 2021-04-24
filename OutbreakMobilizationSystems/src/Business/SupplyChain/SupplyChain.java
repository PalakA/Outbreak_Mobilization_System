/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplyChain;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author ajayp       Added SupplyChain Information
 * 04/14/2021            @author ajayp       Added counter for supply chain id
 */

public class SupplyChain {
    
    private static int count = 1;
    public int supplyChainId;
    public String supplyChainName;
    public String supplyChainUsername;
    public String supplyChainPassword;
    public String supplyChainAddress;
    public String supplyChainNumber;
    
    public SupplyChain() {
        this.supplyChainId = count;
        count++;
    }

    public SupplyChain(int supplyChainId, String supplyChainName, String supplyChainUsername, String supplyChainPassword, String supplyChainAddress, String supplyChainNumber) {
        this.supplyChainId = supplyChainId;
        this.supplyChainName = supplyChainName;
        this.supplyChainUsername = supplyChainUsername;
        this.supplyChainPassword = supplyChainPassword;
        this.supplyChainAddress = supplyChainAddress;
        this.supplyChainNumber = supplyChainNumber;
    }

    public int getSupplyChainId() {
        return supplyChainId;
    }

    public void setSupplyChainId(int supplyChainId) {
        this.supplyChainId = supplyChainId;
    }

    public String getSupplyChainName() {
        return supplyChainName;
    }

    public void setSupplyChainName(String supplyChainName) {
        this.supplyChainName = supplyChainName;
    }

    public String getSupplyChainUsername() {
        return supplyChainUsername;
    }

    public void setSupplyChainUsername(String supplyChainUsername) {
        this.supplyChainUsername = supplyChainUsername;
    }

    public String getSupplyChainPassword() {
        return supplyChainPassword;
    }

    public void setSupplyChainPassword(String supplyChainPassword) {
        this.supplyChainPassword = supplyChainPassword;
    }

    public String getSupplyChainAddress() {
        return supplyChainAddress;
    }

    public void setSupplyChainAddress(String supplyChainAddress) {
        this.supplyChainAddress = supplyChainAddress;
    }

    public String getSupplyChainNumber() {
        return supplyChainNumber;
    }

    public void setSupplyChainNumber(String supplyChainNumber) {
        this.supplyChainNumber = supplyChainNumber;
    }

    @Override
    public String toString() {
        return supplyChainName;
    }
}
