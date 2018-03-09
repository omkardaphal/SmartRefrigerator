/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.HealthcareCenter;

import Business.Enterprise.Enterprise;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class HealthCareCenterEnterprise extends Enterprise {

    public HealthCareCenterEnterprise(String name) {
        super(name, EnterpriseType.HealthCareCenter);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
