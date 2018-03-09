/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refrigerator;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public abstract class Refrigerator {

    private WorkQueue workQueue;
    private String name;
    private ProductDirectory productDirectory;
    private ConsumedProudcts consumedProduct;

    public Refrigerator() {
        this.name = name;
        workQueue = new WorkQueue();
        productDirectory = new ProductDirectory();
        consumedProduct = new ConsumedProudcts();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getName() {
        return name;
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }

    public ConsumedProudcts getConsumedProduct() {
        return consumedProduct;
    }

    public void setConsumedProduct(ConsumedProudcts consumedProduct) {
        this.consumedProduct = consumedProduct;
    }

}
