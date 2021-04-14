/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logistics;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/14/2021            @author ajayp       Added Logistics Registration Information
 * 
 */

public class LogisticsRegistration {
    
    private static int count = 1;
    public int logisticsId;
    public String logisticsName;
    public String logisticsCity;
    public String logisticsState;
    public String logisticsLocation;
    
    public LogisticsRegistration() {
        this.logisticsId = count;
        count++;
    }

    public LogisticsRegistration(int logisticsId, String logisticsName, String logisticsCity, String logisticsState, String logisticsLocation) {
        this.logisticsId = logisticsId;
        this.logisticsName = logisticsName;
        this.logisticsCity = logisticsCity;
        this.logisticsState = logisticsState;
        this.logisticsLocation = logisticsLocation;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        LogisticsRegistration.count = count;
    }

    public int getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(int logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getLogisticsCity() {
        return logisticsCity;
    }

    public void setLogisticsCity(String logisticsCity) {
        this.logisticsCity = logisticsCity;
    }

    public String getLogisticsState() {
        return logisticsState;
    }

    public void setLogisticsState(String logisticsState) {
        this.logisticsState = logisticsState;
    }

    public String getLogisticsLocation() {
        return logisticsLocation;
    }

    public void setLogisticsLocation(String logisticsLocation) {
        this.logisticsLocation = logisticsLocation;
    }

    @Override
    public String toString() {
        return logisticsName;
    }
}
