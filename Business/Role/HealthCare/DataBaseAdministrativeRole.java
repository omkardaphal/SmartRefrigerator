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
import UserInterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import Userinterface.DataBaseAdministrativeWorkAreaJPanel.DataBaseAdministrativeWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DataBaseAdministrativeRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DataBaseAdministrativeWorkAreaJPanel(userProcessContainer, account, organization,enterprise, business);
    }
          @Override
    public String toString() {
        return RoleType.DataBaseAdministrative.getValue();
    }
}
