package org.thanhch.behavioral.visitor;

/**
 * @author thanhch
 * <p>
 * Date: 23/05/2024
 * <p>
 * Class: FixedPriceContract
 */
public class FixedPriceContract implements ReportElement {
    long costPerYear;

    public FixedPriceContract(long costPerYear) {
        this.costPerYear = costPerYear;
    }

    @Override
    public <R> R accept(ReportVisitor<R> v) {
        return v.visit(this);
    }
}
