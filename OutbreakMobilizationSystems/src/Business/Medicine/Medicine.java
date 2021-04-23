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
    private int MedId;
    private String MedName;
    private static int count = 1;

    public Medicine() {
        MedId = count;
        count++;
    }
    
    public Medicine(String medName) {
        this.MedName = medName;
    }

    public int getMedId() {
        return MedId;
    }

    public void setMedId(int MedId) {
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
