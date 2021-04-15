/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logistics;

import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/14/2021            @author ajayp       Added Logistics Registration Directory Information
 * 
 * 
 */

public class LogisticsRegistrationDirectory {
    
    private LogisticsRegistration logisticsRegistration;
    private ArrayList<LogisticsRegistration> logisticsRegistrationList;

    public LogisticsRegistrationDirectory(ArrayList<LogisticsRegistration> logisticsRegistrationList) {
        this.logisticsRegistrationList = new ArrayList<LogisticsRegistration>();
    }

    public LogisticsRegistration getLogisticsRegistration() {
        return logisticsRegistration;
    }

    public void setLogisticsRegistration(LogisticsRegistration logisticsRegistration) {
        this.logisticsRegistration = logisticsRegistration;
    }

    public ArrayList<LogisticsRegistration> getLogisticsRegistrationList() {
        return logisticsRegistrationList;
    }

    public void setLogisticsRegistrationList(ArrayList<LogisticsRegistration> logisticsRegistrationList) {
        this.logisticsRegistrationList = logisticsRegistrationList;
    }
    
    public LogisticsRegistration createLogisticsRegistration(String logisticsName, String logisticsCity, String logisticsState, String logisticsLocation) {
        logisticsRegistration = new LogisticsRegistration(logisticsRegistration.getLogisticsId(), logisticsName, logisticsCity, logisticsState, logisticsLocation);
        logisticsRegistrationList.add(logisticsRegistration);
        return logisticsRegistration;
    }
    
    public void deleteLogisticsRegistration(int logisticsId) {
        for(int i=0; i<logisticsRegistrationList.size(); i++) {
            if(logisticsRegistrationList.get(i).getLogisticsId() == logisticsId) {
                logisticsRegistrationList.remove(i);
            }
        }
    }
    
    public void updateLogisticsRegistration(LogisticsRegistration logisticsRegistration, String logisticsName, String logisticsCity, String logisticsState, String logisticsLocation) {
        for(LogisticsRegistration updateLogisticsRegistration: logisticsRegistrationList) {
            if(updateLogisticsRegistration.getLogisticsId() == logisticsRegistration.getLogisticsId()) {
                logisticsRegistration.logisticsName = logisticsName;
                logisticsRegistration.logisticsCity = logisticsCity;
                logisticsRegistration.logisticsState = logisticsState;
                logisticsRegistration.logisticsLocation = logisticsLocation;
            }
        }
    }
}
