package org.thanhch.behavioral.visitor;

/**
 * @author thanhch
 * <p>
 * Date: 24/05/2024
 * <p>
 * Class: MonthlyCostReportVisitor
 */
public class MonthlyCostReportVisitor implements ReportVisitor<Long> {
    @Override
    public Long visit(FixedPriceContract contract) {
        return contract.costPerYear / 12;
    }

    @Override
    public Long visit(SupportContract contract) {
        return contract.costPerMonth;
    }

    @Override
    public Long visit(TimeAndMaterialsContract contract) {
        return contract.costPerHour * contract.hours;
    }
}
