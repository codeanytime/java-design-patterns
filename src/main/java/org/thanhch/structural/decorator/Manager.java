package org.thanhch.structural.decorator;

/**
 * @author thanhch
 * <p>
 * Date: 06/04/2024
 * <p>
 * Class: Manager
 */
public class Manager extends EmployeeDecorator {

    protected Manager(EmployeeCommon employee) {
        super(employee);
    }

    public void createRequirement() {
        System.out.println(this.employee.getName() + " is create requirements.");
    }

    public void assignTask() {
        System.out.println(this.employee.getName() + " is assigning tasks.");
    }

    public void manageProgress() {
        System.out.println(this.employee.getName() + " is managing the progress.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }
}
