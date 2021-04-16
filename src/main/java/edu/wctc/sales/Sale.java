package edu.wctc.sales;

public class Sale {
    private String customerName;
    private String country;
    private double amount;
    private double tax;
    private double shipping;

    public Sale(String customerName, String country, double amount, double tax) {
        this.customerName = customerName;
        this.country = country;
        this. amount = amount;
        this.tax = tax;
    }

    public Sale(String country) { this.country = country; }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public String getCustomerName() { return customerName; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public double getShipping() { return shipping; }

    public void setShipping(double shipping) { this.shipping = shipping; }

    public double getTax() { return tax; }

    public void setTax(double tax) { this.tax = tax; }

}
