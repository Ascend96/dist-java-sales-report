package edu.wctc.sales.iface;

import edu.wctc.sales.Sale;

public interface ShippingPolicy {
    double getShippingCost(Sale sale);
}
