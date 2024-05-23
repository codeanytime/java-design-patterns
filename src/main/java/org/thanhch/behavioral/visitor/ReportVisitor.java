package org.thanhch.behavioral.visitor;

/**
 * @author thanhch
 * <p>
 * Date: 23/05/2024
 * <p>
 * Class: ReportVisitor
 */
public interface ReportVisitor<R> {
    R visit(FixedPriceContract contract);
    R visit(SupportContract contract);
    R visit(TimeAndMaterialsContract contract);
}
