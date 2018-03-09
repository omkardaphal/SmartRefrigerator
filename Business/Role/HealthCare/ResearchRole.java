/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role.HealthCare;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import userinterface.ResearchRole.ResearchWorkAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class ResearchRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ResearchWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }

    @Override
    public String toString() {
        return RoleType.ResearchRole.getValue();
    }

}
