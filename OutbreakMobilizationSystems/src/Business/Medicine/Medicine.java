/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

/**
 *
 * @author palak
 */
public class Medicine {
    private String MedId;
    private String MedName;
    int min = 100;
    int max = 999;
    
    public Medicine(String medName) {
        this.MedName = medName;
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        MedId = "MEDICINE "+randomNum;
    }

    public String getMedId() {
        return MedId;
    }

    public void setMedId(String MedId) {
        this.MedId = MedId;
    }

    public String getMedName() {
        return MedName;
    }

    public void setMedName(String MedName) {
        this.MedName = MedName;
    }
    
    @Override
        public String toString(){
        return MedName;
    }
}
