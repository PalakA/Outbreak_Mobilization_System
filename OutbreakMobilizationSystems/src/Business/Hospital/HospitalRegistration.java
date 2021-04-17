/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/14/2021            @author ajayp       Added Hospital Registration Information
 * 
 */

public class HospitalRegistration {
    
    private static int count = 1;
    public int hospitalId;
    public String hospitalName;
    public String hospitalCity;
    public String hospitalState;
    public String hospitalLocation;
    
    public HospitalRegistration() {
        this.hospitalId = count;
        count++;
    }

    public HospitalRegistration(int hospitalId, String hospitalName, String hospitalCity, String hospitalState) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.hospitalCity = hospitalCity;
        this.hospitalState = hospitalState;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public String getHospitalState() {
        return hospitalState;
    }

    public void setHospitalState(String hospitalState) {
        this.hospitalState = hospitalState;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    @Override
    public String toString() {
        return hospitalName;
    }
}
