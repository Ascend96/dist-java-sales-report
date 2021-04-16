package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iface.SalesInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSalesInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        List<Sale> salesList = new ArrayList<>();
        try {
            Scanner reader = new Scanner(new File("sales.txt"));
            while(reader.hasNext()) {
                String[] line = reader.nextLine().split(",");
                Sale sale = new Sale(line[0], line[1], Double.parseDouble(line[2]), Double.parseDouble(line[3]));
                salesList.add(sale);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        return salesList;
    }
}
