package edu.wctc.sales;

import edu.wctc.sales.iface.SalesInput;
import edu.wctc.sales.iface.SalesReport;
import edu.wctc.sales.iface.ShippingPolicy;
import edu.wctc.sales.impl.FileSalesInput;
import edu.wctc.sales.impl.FlatRateDomesticShipping;
import edu.wctc.sales.impl.SummarySalesReport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.sales")
public class AppConfig {
    @Bean
    public SalesInput salesInput() {
        return new FileSalesInput();
    }

    @Bean
    public SalesReport salesReport() {
        return new SummarySalesReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy(){
        return new FlatRateDomesticShipping();
    }

}
