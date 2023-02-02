/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

/**
 *
 * @author MRuser
 */
public class Mobile
{
    private String company;
    private String model;
    private double price;

   public Mobile(String company,String model,double price)
   {
       this.company=company;
       this.model=model;
       this.price=price;

   }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }


}
