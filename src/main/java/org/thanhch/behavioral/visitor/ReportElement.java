package org.thanhch.behavioral.visitor;

/**
 * @author thanhch
 * <p>
 * Date: 23/05/2024
 * <p>
 * Class: ReportElement
 */
public interface ReportElement {
    <R> R accept(ReportVisitor<R> v);
}
