package org.thanhch.structural.decorator;

/**
 * @author thanhch
 * <p>
 * Date: 06/04/2024
 * <p>
 * Class: TeamMember
 */
public class TeamMember extends EmployeeDecorator {

    protected TeamMember(EmployeeCommon employee) {
        super(employee);
    }

    public void reportTask() {
        System.out.println(this.employee.getName() + " is reporting his assigned tasks.");
    }

    public void coordinateWithOthers() {
        System.out.println(this.employee.getName() + " is coordinating with other members of his team.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        reportTask();
        coordinateWithOthers();
    }
}
