/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.HealthCare;

import Business.Organization.Organization;
import Business.Results.Result;
import Business.Role.HealthCare.LabAssistantRole;
import Business.Role.Role;
import Business.Results.ResultsDir;
import Refrigerator.ConsumedProudcts;
import Refrigerator.Product;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class LabOrganization extends Organization {

    private ResultsDir resultsDir;
    
       static float  totalFat = 0;
        static float totalCholestrol = 0;
         static float totalSodium = 0;
         static float totalPotasium = 0;
        static float totalCarbohydrate = 0;
       static  float totalProtien = 0;
        static float totalCalcium = 0;
        static float totalIron = 0;
        static float totalSugar = 0;
        String Status = null;

    public LabOrganization() {
        super(Organization.Type1.Lab.getValue());
        resultsDir = new ResultsDir();

    }

    public ResultsDir setParameters(ConsumedProudcts consumedProudcts, String geneResult ,String id) {
        Result result = new Result();

        //public void setParameters(String gene, String pick){

        String gene = geneResult;//whatever you got from Research in real code
        //whatever you got from Research
        int totalMilk = 16;     //16 cups makes one container
        int totalEgg = 12;      //12 eggs makes a box
        int totalButter = 40;   //40 tbs makes a pack
        int totalKetchup = 30;  // 30 tbs makes a jar
        int totalApple = 6;     //6 piece makes a bag
        int totalMeat = 10;     //10 pieces makes a box
        for (Product p : consumedProudcts.getProductList()) {

            if (p.getName().equalsIgnoreCase("egg")) {//get the name of the consumed product
                p.setFat(5);

                p.setCholestrol((float) 0.187);

                p.setSodium((float) 0.062);

                p.setPotasium((float) 0.063);

                p.setCarbohydrate((float) 0.6);

                p.setSugar((float) 0.6);

                p.setProtein((float) 6);

                p.setCalcium((float) 0.25);

                p.setIron((float) 1.5);

            }

            if (p.getName().equalsIgnoreCase("milk")) {
                p.setFat((float) 2.4);

                p.setCholestrol((float) 0.012);

                p.setSodium((float) 0.107);

                p.setPotasium((float) 0.366);

                p.setCarbohydrate((float) 12);

                p.setSugar((float) 13);

                p.setProtein((float) 8);

                p.setCalcium((float) 0.305);

                p.setIron((float) 0);

            }

            if (p.getName().equalsIgnoreCase("butter")) {
                totalButter = totalButter - 1;  //totalMilk is a container which holds 16 cups. with -1 we took 1 cup out of it.
                p.setFat((float) 12);

                p.setCholestrol((float) 0.031);

                p.setSodium((float) 0.002);

                p.setPotasium((float) 0.003);

                p.setCarbohydrate((float) 0);

                p.setSugar((float) 0);

                p.setProtein((float) 0.1);

                p.setCalcium((float) 0);

                p.setIron((float) 0);

            }

            if (p.getName().equalsIgnoreCase("ketchup")) {
                totalKetchup = totalKetchup - 1;  //totalMilk is a container which holds 16 cups. with -1 we took 1 cup out of it.
                p.setFat((float) 20.5);

                p.setCholestrol((float) 0);

                p.setSodium((float) 0.154);

                p.setPotasium((float) 0.54);

                p.setCarbohydrate((float) 4.5);

                p.setSugar((float) 3.7);

                p.setProtein((float) 0.2);

                p.setCalcium((float) 0);

                p.setIron((float) 0);

            }

            if (p.getName().equalsIgnoreCase("apple")) {
                totalApple = totalApple - 1;  //totalMilk is a container which holds 16 cups. with -1 we took 1 cup out of it.
                p.setFat((float) 0.3);

                p.setCholestrol((float) 0);

                p.setSodium((float) 0.195);

                p.setPotasium((float) 0.195);

                p.setCarbohydrate((float) 2.5);

                p.setSugar((float) 19);

                p.setProtein((float) 0.5);

                p.setCalcium((float) 0.25);

                p.setIron((float) 1.8);
            }

            if (p.getName().equalsIgnoreCase("meat")) {
                totalMeat = totalMeat - 1;  //totalMilk is a container which holds 16 cups. with -1 we took 1 cup out of it.
                p.setFat((float) 3);

                p.setCholestrol((float) 0.062);

                p.setSodium((float) 0.358);

                p.setPotasium((float) 0.358);

                p.setCarbohydrate((float) 0);

                p.setSugar((float) 0);

                p.setProtein((float) 22);

                p.setCalcium((float) 0);

                p.setIron((float) 2.2);
            }
            totalFat =  totalFat + p.getFat();
           
            totalCholestrol = totalCholestrol + p.getCholestrol();
            
            totalSodium = totalSodium + p.getSodium();
            
            totalPotasium = totalPotasium + p.getPotasium();
            
            totalCarbohydrate = totalCarbohydrate + p.getCarbohydrate();
            
            totalSugar = totalSugar + p.getSugar();
            
            totalProtien = totalProtien + p.getProtein();
           
            totalCalcium = totalCalcium + p.getCalcium();
            
            totalIron = totalIron + p.getIron();
            
            // fiber is not incuded


        }
        
        //----------------------------------------------------------------------------------------------------------------------------
        if (gene == "clean") {
            if (totalFat <= 22 && totalCholestrol <= 0.3 && totalSodium <= 2.3 && totalPotasium <= 5.1 && totalCarbohydrate >= 100 && totalCarbohydrate <= 150 && totalSugar <= 50
                    && totalProtien <= 50 && totalCalcium <= 2 && totalCalcium >= 1 && totalIron >= 10) {
                Status = "You are fit";
            }
        } else if (gene == "Heart Disease") {
            if (totalFat <= 18 && totalCholestrol <= 0.2 && totalSodium <= 1.5 && totalProtien >= 50) {
                Status = "Your diet is at risk: Heart Disease";
            }
        } else if (gene == "Obesity") {
            if (totalFat <= 18 && totalSodium <= 1.5 && totalCarbohydrate <= 50) {
                Status = "Your diet at risk: Obesity";
            }
        } else if (gene == "Blood Pressure") {
            if (totalFat <= 18 && totalSodium <= 1.5 && totalPotasium <= 4.7 && totalSugar <= 30) {
                Status = "Your diet at risk: BP";
            }
        } else if (gene == "Kidney") {
            if (totalSodium <= 1.5) {
                Status = "Your diet at risk: Kidney disease";
            }
        } else if (gene == "Diabetes") {
            if (totalFat <= 18 && totalCarbohydrate >= 100 && totalSugar <= 30 && totalProtien >= 50) {
                Status = "Your diet at risk: Diabetis";
            }
        } else {
            Status = "Out of all the possibilities ";
        }

        result.setTotalFat(totalFat);
        result.setTotalCarbohydrate(totalCarbohydrate);
        result.setTotalCholestrol(totalCholestrol);
        result.setTotalCalcium(totalCalcium);
        result.setTotalIron(totalIron);
        result.setTotalPotasium(totalPotasium);
        result.setTotalProtien(totalProtien);
        result.setTotalSodium(totalSodium);
        result.setTotalSugar(totalSugar);
        result.setStatus(Status);
        result.setId(id);

        resultsDir.addResult(result);

        return resultsDir;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabAssistantRole());
        return roles;
    }

}
