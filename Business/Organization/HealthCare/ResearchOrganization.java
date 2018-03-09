/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.HealthCare;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.HealthCare.ResearchRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ResearchOrganization extends Organization {

    public ResearchOrganization() {
        super(Organization.Type1.Research.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ResearchRole());
        return roles;
    }

}
