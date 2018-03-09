/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Community;

import Business.Organization.Organization;
import Business.Role.Community.StoreRole;
import Business.Role.Role;
import Refrigerator.StoreRefrigerator;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class StoreOrganization extends Organization {

    private StoreRefrigerator storeRefrigerator;

    public StoreOrganization() {
        super(Organization.Type1.Store.getValue());
        storeRefrigerator = new StoreRefrigerator();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new StoreRole());
        return roles;
    }

    public StoreRefrigerator getStoreRefrigerator() {
        return storeRefrigerator;
    }

    public void setStoreRefrigerator(StoreRefrigerator storeRefrigerator) {
        this.storeRefrigerator = storeRefrigerator;
    }

}
