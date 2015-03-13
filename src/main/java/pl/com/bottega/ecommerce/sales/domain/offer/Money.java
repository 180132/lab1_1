/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

/**
 *
 * @author Kuba
 */
public class Money {
    private String currency;
    private BigDecimal cost;
    
    public Money(BigDecimal productPrice){
        this.cost=productPrice;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @return the productPrice
     */
    public BigDecimal getCost() {
        return cost;
    }
}
