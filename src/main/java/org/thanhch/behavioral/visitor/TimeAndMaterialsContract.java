package org.thanhch.behavioral.visitor;

/**
 * @author thanhch
 * <p>
 * Date: 23/05/2024
 * <p>
 * Class: TimeAndMaterialsContract
 */
public class TimeAndMaterialsContract implements ReportElement {
    long costPerHour;
    long hours;

    public TimeAndMaterialsContract(long costPerHour, long hours) {
        this.costPerHour = costPerHour;
        this.hours = hours;
    }

    @Override
    public <R> R accept(ReportVisitor<R> v) {
        return v.visit(this);
    }
}
