/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.HealthCare;

import Business.Organization.Organization;
import Business.Role.HealthCare.DataBaseAdministrativeRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author raunak
 */
public class DataBaseAdministrative extends Organization {

    public DataBaseAdministrative() {
        super(Organization.Type1.DataBaseAdministrative.getValue());
    }

    public String matchGene() {
        Random rand = new Random();
        String[] name = {"Heart Disease", "Obesity", "Blood Pressure", "Kidney", "Diabetes", "Fit"};

        String n = name[rand.nextInt(name.length)];
        return n;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DataBaseAdministrativeRole());
        return roles;
    }

}
