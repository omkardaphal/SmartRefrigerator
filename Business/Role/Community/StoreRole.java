/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.Community;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Community.StoreOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.StroreRole.StoreRoleWorkArea;

/**
 *
 * @author raunak
 */
public class StoreRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new StoreRoleWorkArea(userProcessContainer, account, (StoreOrganization) organization, enterprise, business);
    }

    @Override
    public String toString() {
        return RoleType.Store.getValue();
    }
}
