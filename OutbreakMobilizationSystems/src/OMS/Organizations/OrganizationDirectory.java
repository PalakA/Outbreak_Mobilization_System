/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OMS.Organizations;

import OMS.Organizations.Organization.Type;
import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 
 */

public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Hospital.getValue())){
            organization = new HospitalInvetoryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdministrationOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Laboratories.getValue())){
            organization = new LaboratoriesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Manufacturer.getValue())){
            organization = new ManufacturerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PharmacyCatalog.getValue())){
            organization = new PharmacyCatalogOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PharmacyDistribution.getValue())){
            organization = new PharmacyDistributionOrganization();
            organizationList.add(organization);
        }
//        else if (type.getValue().equals(Type.SampleCollections.getValue())){
//            organization = new SampleCollectionsOrganization();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.SupplyChain.getValue())){
//            organization = new SupplyChainOrganization();
//            organizationList.add(organization);
//        }
        return organization;
    }
}
