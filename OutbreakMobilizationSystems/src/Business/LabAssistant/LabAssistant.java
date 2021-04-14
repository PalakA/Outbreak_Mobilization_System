/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabAssistant;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/14/2021            @author ajayp       Added LabAssistant Information
 * 04/14/2021            @author ajayp       Added counter for caretaker id
 */

public class LabAssistant {
    
    private static int count = 1;
    public int labAssistantId;
    public String labAssistantName;
    public String labAssistantUsername;
    public String labAssistantPassword;
    public String labAssistantNumber;

    public LabAssistant() {
        this.labAssistantId = count;
        count++;
    }
    
    public LabAssistant(int labAssistantId, String labAssistantName, String labAssistantUsername, String labAssistantPassword, String labAssistantNumber) {
        this.labAssistantId = labAssistantId;
        this.labAssistantName = labAssistantName;
        this.labAssistantUsername = labAssistantUsername;
        this.labAssistantPassword = labAssistantPassword;
        this.labAssistantNumber = labAssistantNumber;
    }

    public int getLabAssistantId() {
        return labAssistantId;
    }

    public void setLabAssistantId(int labAssistantId) {
        this.labAssistantId = labAssistantId;
    }

    public String getLabAssistantName() {
        return labAssistantName;
    }

    public void setLabAssistantName(String labAssistantName) {
        this.labAssistantName = labAssistantName;
    }

    public String getLabAssistantUsername() {
        return labAssistantUsername;
    }

    public void setLabAssistantUsername(String labAssistantUsername) {
        this.labAssistantUsername = labAssistantUsername;
    }

    public String getLabAssistantPassword() {
        return labAssistantPassword;
    }

    public void setLabAssistantPassword(String labAssistantPassword) {
        this.labAssistantPassword = labAssistantPassword;
    }

    public String getLabAssistantNumber() {
        return labAssistantNumber;
    }

    public void setLabAssistantNumber(String labAssistantNumber) {
        this.labAssistantNumber = labAssistantNumber;
    }

    @Override
    public String toString() {
        return labAssistantName;
    }
}
