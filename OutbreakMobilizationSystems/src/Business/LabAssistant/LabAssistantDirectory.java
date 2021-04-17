/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabAssistant;

import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/14/2021            @author ajayp       Added LabAssistant Directory Information
 * 04/14/2021            @author ajayp       Updated Line 58 for incrementing id using counter
 * 
 */

public class LabAssistantDirectory {
    
    private LabAssistant labAssistant;
    private ArrayList<LabAssistant> labAssistantList;

    public LabAssistantDirectory(ArrayList<LabAssistant> labAssistantList) {
        this.labAssistantList = new ArrayList<LabAssistant>();
    }

    public LabAssistant getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(LabAssistant labAssistant) {
        this.labAssistant = labAssistant;
    }

    public ArrayList<LabAssistant> getLabAssistantList() {
        return labAssistantList;
    }

    public void setLabAssistantList(ArrayList<LabAssistant> labAssistantList) {
        this.labAssistantList = labAssistantList;
    }
    
    public LabAssistant getLabAssistant(String labAssistantUsername) {
        for(LabAssistant labAssistant: labAssistantList) {
            if(labAssistant.getLabAssistantUsername().equalsIgnoreCase(labAssistantUsername)) {
                return labAssistant;
            }
        }
        return null;
    }
    
    public LabAssistant createLabAssistant(String labAssistantName, String labAssistantUsername, String labAssistantPassword, String labAssistantNumber) {
        labAssistant = new LabAssistant(labAssistant.getLabAssistantId(), labAssistantName, labAssistantUsername, labAssistantPassword, labAssistantNumber);
        labAssistantList.add(labAssistant);
        return labAssistant;
    }
    
    public void deleteLabAssistant(String labAssistantUsername) {
        for(int i=0; i<labAssistantList.size(); i++) {
            if(labAssistantList.get(i).getLabAssistantUsername().equals(labAssistantUsername)) {
                labAssistantList.remove(i);
            }
        }
    }
    
    public void updateLabAssistant(LabAssistant labAssistant, String labAssistantName, String labAssistantUsername, String labAssistantPassword, String labAssistantNumber) {
        for(LabAssistant updateDiagnostician: labAssistantList) {
            if(updateDiagnostician.getLabAssistantUsername().equalsIgnoreCase(labAssistantUsername)) {
                labAssistant.labAssistantName = labAssistantName;
                labAssistant.labAssistantUsername = labAssistantUsername;
                labAssistant.labAssistantPassword = labAssistantPassword;
                labAssistant.labAssistantNumber = labAssistantNumber;
            }
        }
    }
}
