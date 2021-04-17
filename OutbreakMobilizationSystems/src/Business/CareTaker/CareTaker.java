/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CareTaker;

import java.util.Date;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author ajayp       Added Caretaker Information
 * 04/14/2021            @author ajayp       Added counter for caretaker id
 */

public class CareTaker {
    
    private static int count = 1;
    public int caretakerId;
    public String caretakerName;
    public String caretakerUsername;
    public String caretakerPassword;
    public String caretakerAddress;
    public String caretakerNumber;
    public String dutyHours;
    
    public CareTaker() {
        this.caretakerId = count;
        count++;
    }

    public CareTaker(int caretakerId, String caretakerName, String caretakerUsername, String caretakerPassword, String caretakerAddress, String caretakerNumber, String dutyHours) {
        this.caretakerId = caretakerId;
        this.caretakerName = caretakerName;
        this.caretakerUsername = caretakerUsername;
        this.caretakerPassword = caretakerPassword;
        this.caretakerAddress = caretakerAddress;
        this.caretakerNumber = caretakerNumber;
        this.dutyHours = dutyHours;
    }

    public int getCaretakerId() {
        return caretakerId;
    }

    public void setCaretakerId(int caretakerId) {
        this.caretakerId = caretakerId;
    }

    public String getCaretakerName() {
        return caretakerName;
    }

    public void setCaretakerName(String caretakerName) {
        this.caretakerName = caretakerName;
    }

    public String getCaretakerUsername() {
        return caretakerUsername;
    }

    public void setCaretakerUsername(String caretakerUsername) {
        this.caretakerUsername = caretakerUsername;
    }

    public String getCaretakerPassword() {
        return caretakerPassword;
    }

    public void setCaretakerPassword(String caretakerPassword) {
        this.caretakerPassword = caretakerPassword;
    }

    public String getCaretakerAddress() {
        return caretakerAddress;
    }

    public void setCaretakerAddress(String caretakerAddress) {
        this.caretakerAddress = caretakerAddress;
    }

    public String getCaretakerNumber() {
        return caretakerNumber;
    }

    public void setCaretakerNumber(String caretakerNumber) {
        this.caretakerNumber = caretakerNumber;
    }

    public String getDutyHours() {
        return dutyHours;
    }

    public void setDutyHours(String dutyHours) {
        this.dutyHours = dutyHours;
    }

    @Override
    public String toString() {
        return caretakerName;
    }
}
