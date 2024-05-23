package org.thanhch.behavioral.visitor;

import java.util.List;

/**
 * @author thanhch
 * <p>
 * Date: 24/05/2024
 * <p>
 * Class: Client
 */
public class Client {
    public static void main(String[] args) {
        FixedPriceContract fixedPriceContract = new FixedPriceContract(100000);
        SupportContract supportContract = new SupportContract(300);
        TimeAndMaterialsContract kaigo = new TimeAndMaterialsContract(10, 100);
        TimeAndMaterialsContract kwmc = new TimeAndMaterialsContract(15, 150);

        List<ReportElement> projects = List.of(fixedPriceContract, supportContract, kaigo, kwmc);

        MonthlyCostReportVisitor monthlyReport = new MonthlyCostReportVisitor();
        YearlyCostReportVisitor yearlyReport = new YearlyCostReportVisitor();
        long monthlyCost = 0;
        long yearlyCost = 0;

        for (ReportElement project : projects) {
            monthlyCost += project.accept(monthlyReport);
            yearlyCost += project.accept(yearlyReport);
        }
        System.out.println("Monthly cost:" + monthlyCost);
        System.out.println("Yearly cost:" + yearlyCost);
    }
}
