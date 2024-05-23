package org.thanhch.behavioral.visitor;

/**
 * @author thanhch
 * <p>
 * Date: 23/05/2024
 * <p>
 * Class: SupportContract
 */
public class SupportContract implements ReportElement{
    long costPerMonth;

    public SupportContract(long costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    @Override
    public <R> R accept(ReportVisitor<R> v) {
        return v.visit(this);
    }
}
