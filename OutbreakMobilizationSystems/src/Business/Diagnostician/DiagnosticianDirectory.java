/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Diagnostician;

import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author ajayp       Added Diagnostician Directory Information
 * 
 */

public class DiagnosticianDirectory {
    
    private Diagnostician diagnostician;
    private ArrayList<Diagnostician> diagnosticianList;

    public DiagnosticianDirectory(ArrayList<Diagnostician> diagnosticianList) {
        this.diagnosticianList = new ArrayList<Diagnostician>();
    }

    public Diagnostician getDiagnostician() {
        return diagnostician;
    }

    public void setDiagnostician(Diagnostician diagnostician) {
        this.diagnostician = diagnostician;
    }

    public ArrayList<Diagnostician> getDiagnosticianList() {
        return diagnosticianList;
    }

    public void setDiagnosticianList(ArrayList<Diagnostician> diagnosticianList) {
        this.diagnosticianList = diagnosticianList;
    }
    
    public Diagnostician getDiagnostician(String diagnosticianUsername) {
        for(Diagnostician diagnostician: diagnosticianList) {
            if(diagnostician.getDiagnosticianUsername().equalsIgnoreCase(diagnosticianUsername)) {
                return diagnostician;
            }
        }
        return null;
    }
    
    public Diagnostician createDiagnostician(String diagnosticianId, String diagnosticianName, String diagnosticianUsername, String diagnosticianPassword, String diagnosticianNumber) {
        diagnostician = new Diagnostician(diagnosticianId, diagnosticianName, diagnosticianUsername, diagnosticianPassword, diagnosticianNumber);
        diagnosticianList.add(diagnostician);
        return diagnostician;
    }
    
    public void deleteDiagnostician(String diagnosticianUsername) {
        for(int i=0; i<diagnosticianList.size(); i++) {
            if(diagnosticianList.get(i).getDiagnosticianUsername() == diagnosticianUsername) {
                diagnosticianList.remove(i);
            }
        }
    }
    
    public void updateDiagnostician(Diagnostician diagnostician, String diagnosticianName, String diagnosticianUsername, String diagnosticianPassword, String diagnosticianNumber) {
        for(Diagnostician updateDiagnostician: diagnosticianList) {
            if(updateDiagnostician.getDiagnosticianUsername().equalsIgnoreCase(diagnosticianUsername)) {
                diagnostician.diagnosticianName = diagnosticianName;
                diagnostician.diagnosticianUsername = diagnosticianUsername;
                diagnostician.diagnosticianPassword = diagnosticianPassword;
                diagnostician.diagnosticianNumber = diagnosticianNumber;
            }
        }
    }
}
