/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Diagnostician;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author ajayp       Added Diagnostician Information
 * 
 */

public class Diagnostician {
    
    private static int count = 1;
    public int diagnosticianId;
    public String diagnosticianName;
    public String diagnosticianUsername;
    public String diagnosticianPassword;
    public String diagnosticianNumber;
    
    public Diagnostician() {
        this.diagnosticianId = count;
        count++;
    }

    public Diagnostician(int diagnosticianId, String diagnosticianName, String diagnosticianUsername, String diagnosticianPassword, String diagnosticianNumber) {
        this.diagnosticianId = diagnosticianId;
        this.diagnosticianName = diagnosticianName;
        this.diagnosticianUsername = diagnosticianUsername;
        this.diagnosticianPassword = diagnosticianPassword;
        this.diagnosticianNumber = diagnosticianNumber;
    }

    public int getDiagnosticianId() {
        return diagnosticianId;
    }

    public void setDiagnosticianId(int diagnosticianId) {
        this.diagnosticianId = diagnosticianId;
    }

    public String getDiagnosticianName() {
        return diagnosticianName;
    }

    public void setDiagnosticianName(String diagnosticianName) {
        this.diagnosticianName = diagnosticianName;
    }

    public String getDiagnosticianUsername() {
        return diagnosticianUsername;
    }

    public void setDiagnosticianUsername(String diagnosticianUsername) {
        this.diagnosticianUsername = diagnosticianUsername;
    }

    public String getDiagnosticianPassword() {
        return diagnosticianPassword;
    }

    public void setDiagnosticianPassword(String diagnosticianPassword) {
        this.diagnosticianPassword = diagnosticianPassword;
    }

    public String getDiagnosticianNumber() {
        return diagnosticianNumber;
    }

    public void setDiagnosticianNumber(String diagnosticianNumber) {
        this.diagnosticianNumber = diagnosticianNumber;
    }

    @Override
    public String toString() {
        return diagnosticianName;
    }
}
