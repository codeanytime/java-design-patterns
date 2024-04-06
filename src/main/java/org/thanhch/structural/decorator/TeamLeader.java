package org.thanhch.structural.decorator;

/**
 * @author thanhch
 * <p>
 * Date: 06/04/2024
 * <p>
 * Class: TeamLeader
 */
public class TeamLeader extends EmployeeDecorator {

    protected TeamLeader(EmployeeCommon employee) {
        super(employee);
    }

    public void planing() {
        System.out.println(this.employee.getName() + " is planing.");
    }

    public void motivate() {
        System.out.println(this.employee.getName() + " is motivating his members.");
    }

    public void monitor() {
        System.out.println(this.employee.getName() + " is monitoring his members.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        planing();
        motivate();
        monitor();
    }
}
