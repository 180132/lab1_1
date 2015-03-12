/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Kuba
 */
public class ProductSnapshot {
    private String productName;
    private String productId;
    private Money productPrice;
    private Date productSnapshotDate;
    private String productType;

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @return the productPrice
     */
    public Money getProductPrice() {
        return productPrice;
    }

    /**
     * @return the productSnapshotDate
     */
    public Date getProductSnapshotDate() {
        return productSnapshotDate;
    }

    /**
     * @return the productType
     */
    public String getProductType() {
        return productType;
    }
}
