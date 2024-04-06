package org.thanhch.structural.decorator;
import java.util.Date;

/**
 * @author thanhch
 * <p>
 * Date: 06/04/2024
 * <p>
 * Class: Employee
 */
public class Employee implements EmployeeCommon {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void join(Date joinDate) {
        System.out.println(this.getName() + " joined on " + formatDate(joinDate));
    }

    @Override
    public void terminate(Date terminateDate) {
        System.out.println(this.getName() + " terminated on " + formatDate(terminateDate));
    }

    @Override
    public void doTask() {
        // Unassigned task
    }
}
