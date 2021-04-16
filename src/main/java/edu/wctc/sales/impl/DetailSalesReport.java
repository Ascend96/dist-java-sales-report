package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iface.SalesReport;

import java.util.List;

public class DetailSalesReport implements SalesReport {
    private final String format = "%-30s%-20s%-10.2f%-10.2f%-10.2f\n";
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES DETAIL REPORT");
        System.out.printf("%-30s%-20s%-10s%-10s%-10s\n", "Customer", "Country", "Amount", "Tax", "Shipping");
        for(Sale sale : salesList) {
            System.out.printf(format, sale.getCustomerName(), sale.getCountry(), sale.getAmount(), sale.getTax(), sale.getShipping());
        }


    }
}
