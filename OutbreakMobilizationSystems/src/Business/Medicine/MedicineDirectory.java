/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import java.util.ArrayList;

/**
 *
 * @author palak
 */
public class MedicineDirectory {
    
    private ArrayList<Medicine> medicineList;
    
    public MedicineDirectory() {
        medicineList = new ArrayList();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }
    
    public Medicine createMedicine(Medicine medicine){
        medicineList.add(medicine);
        return medicine;
    }
    
    public Medicine updateMedicine(Medicine medicine, String medName){
        medicine.setMedName(medName);
        return medicine;
    }
}
