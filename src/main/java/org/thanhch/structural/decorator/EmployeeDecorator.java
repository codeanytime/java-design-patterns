package org.thanhch.structural.decorator;

import java.util.Date;

/**
 * @author thanhch
 * <p>
 * Date: 06/04/2024
 * <p>
 * Class: EmployeeDecorator
 */
public abstract class EmployeeDecorator implements EmployeeCommon{
    protected EmployeeCommon employee;

    protected EmployeeDecorator(EmployeeCommon employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void join(Date joinDate) {
        employee.join(joinDate);
    }

    @Override
    public void terminate(Date terminateDate) {
        employee.terminate(terminateDate);
    }
}
