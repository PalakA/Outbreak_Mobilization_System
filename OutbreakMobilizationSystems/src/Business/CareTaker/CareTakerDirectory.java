/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CareTaker;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author ajayp       Added Caretaker Directory Information
 * 04/14/2021            @author palak       Updated Line 50 with equals sign
 */

public class CareTakerDirectory {
    
    private CareTaker careTaker;
    private ArrayList<CareTaker> careTakerList;

    public CareTakerDirectory(ArrayList<CareTaker> careTakerList) {
        this.careTakerList = new ArrayList<CareTaker>();
    }

    public CareTaker getCareTaker() {
        return careTaker;
    }

    public void setCareTaker(CareTaker careTaker) {
        this.careTaker = careTaker;
    }

    public ArrayList<CareTaker> getCareTakerList() {
        return careTakerList;
    }

    public void setCareTakerList(ArrayList<CareTaker> careTakerList) {
        this.careTakerList = careTakerList;
    }
    
    public CareTaker getCareTaker(String caretakerUsername) {
        for(CareTaker careTaker: careTakerList) {
            if(careTaker.getCaretakerUsername().equalsIgnoreCase(caretakerUsername)) {
                return careTaker;
            }
        }
        return null;
    }
    
    public CareTaker createCareTaker(String caretakerId, String caretakerName, String caretakerUsername, String caretakerPassword, String caretakerAddress, String caretakerNumber, Date dutyHours) {
        careTaker = new CareTaker(caretakerId, caretakerName, caretakerUsername, caretakerPassword, caretakerAddress, caretakerNumber, dutyHours);
        careTakerList.add(careTaker);
        return careTaker;
    }
    
    public void deleteCareTaker(String caretakerUsername) {
        for(int i=0; i<careTakerList.size(); i++) {
            if(careTakerList.get(i).getCaretakerUsername().equals(caretakerUsername)) {
                careTakerList.remove(i);
            }
        }
    }
    
    public void updateCareTaker(CareTaker careTaker, String caretakerName, String caretakerUsername, String caretakerPassword, String caretakerAddress, String caretakerNumber, Date dutyHours) {
        for(CareTaker updateCaretaker: careTakerList) {
            if(updateCaretaker.getCaretakerUsername().equalsIgnoreCase(caretakerUsername)) {
                careTaker.caretakerName = caretakerName;
                careTaker.caretakerUsername = caretakerUsername;
                careTaker.caretakerPassword = caretakerPassword;
                careTaker.caretakerAddress = caretakerAddress;
                careTaker.caretakerNumber = caretakerNumber;
                careTaker.dutyHours = dutyHours;
            }
        }
    }
}
