package edu.wctc.sales;

import edu.wctc.sales.iface.SalesInput;
import edu.wctc.sales.iface.SalesReport;
import edu.wctc.sales.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesReportProgram {
    @Autowired
    private ShippingPolicy shippingPolicy;

    @Autowired
    private SalesInput salesInput;

    @Autowired
    private SalesReport salesReport;

    public void runSalesReport(){
        List<Sale> salesList = salesInput.getSales();

        for (Sale sale : salesList){
            sale.setShipping(shippingPolicy.getShippingCost(sale));
        }
        salesReport.generateReport(salesList);
    }

}
