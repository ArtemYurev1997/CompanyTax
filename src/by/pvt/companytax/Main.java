package by.pvt.companytax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Firm> firmList = new ArrayList<>();
        firmList.add(new Firm("MacDonalds", "food industry", 12500, 1));
        firmList.add(new Firm("KFC", "food industry", 16500, 2));
        firmList.add(new Firm("Apple", "technology industry", 20000, 3));
        firmList.add(new Firm("Microsoft", "programming industry", 0, 4));
        firmList.add(new Firm("Ford", "car industry", 0, 5));
        firmList.add(new Firm("Morgan GP", "oil industry", 0, 6));
        firmList.add(new Firm("Petroleum Company", "oil industry", 2900, 7));
        firmList.add(new Firm("Coca-Cola  company", "drink industry", 9000, 8));
        firmList.add(new Firm("Twitter", "internet industry", 5800, 9));
        firmList.add(new Firm("Facebook", "internet industry", 6100, 10));
        HashMap<String, List<Firm>> firmList1 = new HashMap<>();
        firmList1.put("Firm", firmList);
        System.out.println();

        Tax tax = new Tax();
        tax.addMap("Нет долгов", tax.check1(firmList1));
        tax.addMap("Не уплачено рублей до 10000", tax.check2(firmList1));
        tax.addMap("Не уплачено рублей более 10000", tax.check3(firmList1));
        System.out.println(tax);

    }
}

