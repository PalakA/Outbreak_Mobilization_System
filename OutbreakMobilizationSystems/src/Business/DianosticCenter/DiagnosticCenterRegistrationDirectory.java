/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DianosticCenter;

import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/14/2021            @author ajayp       Added Diagnostician Cneter Registration Directory Information
 * 
 * 
 */

public class DiagnosticCenterRegistrationDirectory {
    
    private DiagnosticCenterRegistration diagnosticCenterRegistration;
    private ArrayList<DiagnosticCenterRegistration> diagnosticCenterRegistrationList;

    public DiagnosticCenterRegistrationDirectory(ArrayList<DiagnosticCenterRegistration> diagnosticCenterRegistrationList) {
        this.diagnosticCenterRegistrationList = new ArrayList<DiagnosticCenterRegistration>();
    }

    public DiagnosticCenterRegistration getDiagnosticCenterRegistration() {
        return diagnosticCenterRegistration;
    }

    public void setDiagnosticCenterRegistration(DiagnosticCenterRegistration diagnosticCenterRegistration) {
        this.diagnosticCenterRegistration = diagnosticCenterRegistration;
    }

    public ArrayList<DiagnosticCenterRegistration> getDiagnosticCenterRegistrationList() {
        return diagnosticCenterRegistrationList;
    }

    public void setDiagnosticCenterRegistrationList(ArrayList<DiagnosticCenterRegistration> diagnosticCenterRegistrationList) {
        this.diagnosticCenterRegistrationList = diagnosticCenterRegistrationList;
    }
    
    public DiagnosticCenterRegistration createDiagnosticCenterRegistration(int diagnosticCenterId, String diagnosticCenterName, String diagnosticCenterCity, String diagnosticCenterState, String diagnosticCenterLocation) {
        diagnosticCenterRegistration = new DiagnosticCenterRegistration(diagnosticCenterRegistration.getDiagnosticCenterId(), diagnosticCenterName, diagnosticCenterCity, diagnosticCenterState, diagnosticCenterLocation);
        diagnosticCenterRegistrationList.add(diagnosticCenterRegistration);
        return diagnosticCenterRegistration;
    }
    
    public void deleteDiagnosticCenterRegistration(int diagnosticCenterId) {
        for(int i=0; i<diagnosticCenterRegistrationList.size(); i++) {
            if(diagnosticCenterRegistrationList.get(i).getDiagnosticCenterId() == diagnosticCenterId) {
                diagnosticCenterRegistrationList.remove(i);
            }
        }
    }
    
    public void updateDiagnosticCenterRegistration(DiagnosticCenterRegistration diagnosticCenterRegistration, String diagnosticCenterName, String diagnosticCenterCity, String diagnosticCenterState, String diagnosticCenterLocation) {
        for(DiagnosticCenterRegistration updateDiagnosticCenterRegistration: diagnosticCenterRegistrationList) {
            if(updateDiagnosticCenterRegistration.getDiagnosticCenterId() == diagnosticCenterRegistration.getDiagnosticCenterId()) {
                diagnosticCenterRegistration.diagnosticCenterName = diagnosticCenterName;
                diagnosticCenterRegistration.diagnosticCenterCity = diagnosticCenterCity;
                diagnosticCenterRegistration.diagnosticCenterState = diagnosticCenterState;
                diagnosticCenterRegistration.diagnosticCenterLocation = diagnosticCenterLocation;
            }
        }
    }
}
