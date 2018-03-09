/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Community;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Community.FamilyOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.FamilyRole.FamilyRoleWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class FamilyRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FamilyRoleWorkAreaJPanel(userProcessContainer, account, (FamilyOrganization) organization, enterprise, business);
    }

    @Override
    public String toString() {
        return RoleType.family.getValue();
    }
}
