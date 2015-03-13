package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.ArrayList;
import java.util.List;

public class Offer {
private List<OfferItem> availabeItems = new ArrayList<OfferItem>();
	
	private List<OfferItem> unavailableItems = new ArrayList<OfferItem>();
	
	
	public Offer(List<OfferItem> availabeItems, List<OfferItem> unavailableItems) {
		this.availabeItems = availabeItems;
		this.unavailableItems = unavailableItems;
	}

	public List<OfferItem> getAvailabeItems() {
		return availabeItems;
	}
	
	public List<OfferItem> getUnavailableItems() {
		return unavailableItems;
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (this.availabeItems != null ? this.availabeItems.hashCode() : 0);
        hash = 13 * hash + (this.unavailableItems != null ? this.unavailableItems.hashCode() : 0);
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
        final Offer other = (Offer) obj;
        if (this.availabeItems != other.availabeItems && (this.availabeItems == null || !this.availabeItems.equals(other.availabeItems))) {
            return false;
        }
        if (this.unavailableItems != other.unavailableItems && (this.unavailableItems == null || !this.unavailableItems.equals(other.unavailableItems))) {
            return false;
        }
        return true;
    }

	

	private OfferItem findItem(String productId) {
		for (OfferItem item : availabeItems){
			if (item.getProductsnapshot.getProductId().equals(productId))
				return item;
		}
		return null;
	}
	

}
