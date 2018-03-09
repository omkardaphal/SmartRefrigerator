/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Community;

import Business.Organization.Organization;
import Business.Role.Community.FamilyRole;
import Business.Role.Role;
import Business.Role.HealthCare.ResearchRole;
import Refrigerator.HomeRefrigerator;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class FamilyOrganization extends Organization {

    private HomeRefrigerator homeRefrigerator;
    String name;

    public FamilyOrganization() {
        super(Organization.Type1.Family.getValue());
        homeRefrigerator = new HomeRefrigerator();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FamilyRole());
        return roles;
    }

    public HomeRefrigerator getHomeRefrigerator() {
        return homeRefrigerator;
    }

    public void setHomeRefrigerator(HomeRefrigerator homeRefrigerator) {
        this.homeRefrigerator = homeRefrigerator;
    }

}
