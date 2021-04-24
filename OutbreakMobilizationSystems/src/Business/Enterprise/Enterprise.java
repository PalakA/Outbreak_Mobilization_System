/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Medicine.Medicine;
import Business.Organizations.Organization;
import Business.Organizations.OrganizationDirectory;
import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 *
 * Revision History:
 *
 * Date(MM/DD/YYYY) Author Comment 04/14/2021 @author palak Updated package
 * names
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Organization organization;
    private ArrayList<Medicine> medicineList;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        Hospital("Hospital"),
        DiagnosticCenter("DiagnosticCenter"),
        Logistics("Logistics"),
        MedicalDeviceCompanies("MedicalDeviceCompanies"),
        Pharmacy("Pharmacy"),
        Laboratories("Laboratories");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public ArrayList<Medicine> getMedicineList() {
        if (medicineList == null) {
            medicineList = new ArrayList<Medicine>();
        }
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        this.medicineList = new ArrayList<>();
        organizationDirectory = new OrganizationDirectory();
    }

    public Medicine createMedicineList(String medicineName) {
        Medicine medicine = new Medicine(medicineName);
        this.medicineList.add(medicine);
        return medicine;
    }

    public void deleteItem(Medicine medicine) {
        medicineList.remove(medicine);
    }
}
