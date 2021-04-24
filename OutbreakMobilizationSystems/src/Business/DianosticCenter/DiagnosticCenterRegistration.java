/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DianosticCenter;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/14/2021            @author ajayp       Added Diagnostic Center Registration Information
 * 
 */

public class DiagnosticCenterRegistration {
    
    private static int count = 1;
    public int diagnosticCenterId;
    public String diagnosticCenterName;
    public String diagnosticCenterCity;
    public String diagnosticCenterState;
    public String diagnosticCenterLocation;
    
    public DiagnosticCenterRegistration() {
        this.diagnosticCenterId = count;
        count++;
    }

    public DiagnosticCenterRegistration(int diagnosticCenterId, String diagnosticCenterName, String diagnosticCenterCity, String diagnosticCenterState, String diagnosticCenterLocation) {
        this.diagnosticCenterId = diagnosticCenterId;
        this.diagnosticCenterName = diagnosticCenterName;
        this.diagnosticCenterCity = diagnosticCenterCity;
        this.diagnosticCenterState = diagnosticCenterState;
        this.diagnosticCenterLocation = diagnosticCenterLocation;
    }

    public int getDiagnosticCenterId() {
        return diagnosticCenterId;
    }

    public void setDiagnosticCenterId(int diagnosticCenterId) {
        this.diagnosticCenterId = diagnosticCenterId;
    }

    public String getDiagnosticCenterName() {
        return diagnosticCenterName;
    }

    public void setDiagnosticCenterName(String diagnosticCenterName) {
        this.diagnosticCenterName = diagnosticCenterName;
    }

    public String getDiagnosticCenterCity() {
        return diagnosticCenterCity;
    }

    public void setDiagnosticCenterCity(String diagnosticCenterCity) {
        this.diagnosticCenterCity = diagnosticCenterCity;
    }

    public String getDiagnosticCenterState() {
        return diagnosticCenterState;
    }

    public void setDiagnosticCenterState(String diagnosticCenterState) {
        this.diagnosticCenterState = diagnosticCenterState;
    }

    public String getDiagnosticCenterLocation() {
        return diagnosticCenterLocation;
    }

    public void setDiagnosticCenterLocation(String diagnosticCenterLocation) {
        this.diagnosticCenterLocation = diagnosticCenterLocation;
    }

    @Override
    public String toString() {
        return diagnosticCenterName;
    }
}
