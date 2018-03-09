/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.HealthCare.DataBaseAdministrative;
import Business.Organization.HealthCare.LabOrganization;
import Business.Organization.HealthCare.ResearchOrganization;
import Business.Organization.Community.StoreOrganization;
import Business.Organization.Community.FamilyOrganization;
import Business.Organization.Organization.Type1;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;
    private ArrayList<Organization> organizationList2;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
        organizationList2 = new ArrayList<>();

    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public ArrayList<Organization> getOrganizationList2() {
        return organizationList2;
    }

    public Organization createOrganization(Type1 type) {
        Organization organization = null;

        if (type.getValue().equals(Type1.Lab.getValue())) {
            organization = new LabOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type1.Research.getValue())) {
            organization = new ResearchOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type1.DataBaseAdministrative.getValue())) {
            organization = new DataBaseAdministrative();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type1.Store.getValue())) {
            organization = new StoreOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type1.Family.getValue())) {
            organization = new FamilyOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

}
