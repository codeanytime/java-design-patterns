package org.thanhch.structural.decorator;

/**
 * @author thanhch
 * <p>
 * Date: 06/04/2024
 * <p>
 * Class: Client
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeCommon employee = new Employee("nghiabt");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("\nTEAM LEADER: ");
        EmployeeCommon teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nMANAGER: ");
        EmployeeCommon manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeCommon teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}
