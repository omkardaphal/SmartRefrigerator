/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refrigerator;

import java.util.ArrayList;

/**
 *
 * @author MAC
 */
public class ConsumedProudcts {

    private ArrayList<Product> productList;

    public ConsumedProudcts() {
        productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void addConsumedProduct(Product product) {

        productList.add(product);

    }

    public void removeProduct(Product product) {
        productList.remove(product);

    }

    public Product searchProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
