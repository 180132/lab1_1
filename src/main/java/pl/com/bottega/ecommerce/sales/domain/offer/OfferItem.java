/*
 * Copyright 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class OfferItem {

	// product
	

	

	

	

	private int quantity;

	private Money totalCost;

	
        
        private ProductSnapshot productSnapshot;

	// discount
	private Discount discount;

	

	public OfferItem( int quantity, Discount discount, ProductSnapshot product) {
                
                this.productSnapshot = product;
	

		this.quantity = quantity;
		this.discount = discount;

		BigDecimal discountValue = new BigDecimal(0);
		if (discount != null)
			discountValue = discount.getDiscount().getCost();

		this.totalCost = new Money(productSnapshot.getProductPrice().getCost()
				.multiply(new BigDecimal(quantity)).subtract(discountValue));
	}



	public Money getTotalCost() {
		return totalCost;
	}

	

	public Discount getDiscount() {
		return discount;
	}

	public ProductSnapshot getProductSnapshot(){
                return productSnapshot;
        }

	public int getQuantity() {
		return quantity;
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.quantity;
        hash = 71 * hash + (this.totalCost != null ? this.totalCost.hashCode() : 0);
        hash = 71 * hash + (this.productSnapshot != null ? this.productSnapshot.hashCode() : 0);
        hash = 71 * hash + (this.discount != null ? this.discount.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OfferItem other = (OfferItem) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.totalCost != other.totalCost && (this.totalCost == null || !this.totalCost.equals(other.totalCost))) {
            return false;
        }
        if (this.productSnapshot != other.productSnapshot && (this.productSnapshot == null || !this.productSnapshot.equals(other.productSnapshot))) {
            return false;
        }
        if (this.discount != other.discount && (this.discount == null || !this.discount.equals(other.discount))) {
            return false;
        }
        return true;
    }

	

	

}
