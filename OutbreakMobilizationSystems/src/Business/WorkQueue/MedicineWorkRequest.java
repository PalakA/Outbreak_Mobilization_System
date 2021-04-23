/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Medicine.Medicine;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author palak
 */
public class MedicineWorkRequest extends WorkRequest{
        List<Medicine> medicineList;
        private Employee patient;

    public MedicineWorkRequest() {
        this.medicineList = new ArrayList<>();
    }

    public List<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(List<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public Employee getPatient() {
        return patient;
    }

    public void setPatient(Employee patient) {
        this.patient = patient;
    }

}
